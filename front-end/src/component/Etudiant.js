import React, {useEffect, useState} from "react";
import axios from "axios";
import Form from "./subComponents/etudiant/Form";
import Edit from "./subComponents/etudiant/Edit";



export default function Etudiant(){

    const [loading , setLoading] = useState(false)
    const [etudiant, setEtudiant] = useState([])
    const [etat , setEtat] = useState('add')
    const [etTarget , setEtTarget] = useState({})

    const fetchData = async () =>{
        try {
            const {data: response} = await axios.get('http://localhost:8080/api/etudiant');
            setEtudiant(response);
        } catch (error) {
            console.error(error.message);
        }
    }

    let DeleteEtudiant = (obj) => {
        let cne = obj.target.value
        try {
            alert('dafuk !!')
            axios.delete('http://localhost:8080/api/etudiant/' + cne);
            setEtudiant(etudiant.filter(item => item.cne !== cne));
        } catch (error) {
            alert(error.message)
        }
    }

    useEffect(() => {
        fetchData();
    }, [loading]);

    let addetudiant = (et) => {
        let tmp = []
        etudiant.push(et)
        tmp = etudiant
        setEtudiant(tmp)
    }

    let updateetudiant = (et) => {
        let tmp = []
        let objIndex = etudiant.findIndex(
            (obj => obj.cne == et.cne)
        )
        etudiant[objIndex] = et
        tmp = etudiant
        setEtudiant(tmp)
    }

    let handleUpdate = (e) =>{
        setEtat('edit')
        let cne = e.target.value
        let objIndex = etudiant.findIndex(
            (obj => obj.cne == cne)
        )
        setEtTarget(etudiant[objIndex])
    }

    let forceLoad = () => {
        loading == false ? setLoading(true)  : setLoading(false)
    }

    let changeEtat = () => {
        setEtat('add')
    }

    return(

        <div style={{marginTop: '6rem' }}>
            {etat === 'add' ? <Form  load={forceLoad} addetudiant={addetudiant}/> : <Edit etat={changeEtat}  load={forceLoad} target={etTarget}/> }


            <div className="col-md-11" style={{marginLeft:'2rem'}} >
                {/*  Latest Orders */}
                <div className="block block-rounded block-mode-loading-refresh">
                    <div className="block-header block-header-default">
                        <h3 className="block-title">
                            List des Etudiants
                        </h3>
                    </div>
                    <div className="block-content">
                        <table className="table table-striped table-hover table-borderless table-vcenter fs-sm">
                            <thead>
                            <tr className="text-uppercase">
                                <th>CNE</th>
                                <th className="d-none d-xl-table-cell">Nom</th>
                                <th>Prenom</th>
                                <th className="d-none d-sm-table-cell text-end" style={{width: '120px'}}>Actions</th>

                            </tr>
                            </thead>
                            <tbody>
                            {/*<tr>*/}
                                {etudiant.map(
                                    (item) => {
                                        return(
                                            <tr key={item.cne}>
                                            <td>
                                                <span className="fw-semibold">{item.cne}</span>
                                            </td>
                                            <td className="d-none d-xl-table-cell">
                                                <span className="fw-semibold text-success">{item.nom}</span>
                                            </td>
                                            <td>
                                                <span className="fw-semibold text-success">{item.prenom}</span>
                                            </td>
                                            <td className="d-none d-sm-table-cell text-end fw-medium" >
                                                <div className="d-flex">
                                                    <div className="d-inline-block">
                                                        <button className="btn btn-success" value={item.cne} onClick={handleUpdate}>EDIT</button>
                                                    </div>
                                                    <div className="d-inline-block">
                                                        &nbsp;&nbsp;
                                                    </div>
                                                    <div className="d-inline-block">
                                                        <button className="btn btn-danger" onClick={DeleteEtudiant} value={item.cne}>DELETE</button>
                                                    </div>
                                                </div>
                                            </td>
                                            </tr>
                                        )
                                    })
                                }
                            </tbody>
                        </table>
                    </div>

                </div>

            </div>

        </div>
    )
}