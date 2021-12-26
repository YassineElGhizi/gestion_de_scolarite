import React from "react";
import {useEffect, useState} from "react";
import Swal from "sweetalert2";


import Form from "./subComponents/filiere/Form";
import Edit from "./subComponents/filiere/Edit";
import axios from "axios";



export default function Filiere(){
    const [filieres , setFilieres] = useState([])
    const [loading , setLoading] = useState(false)
    const [etat , setEtat] = useState('add')
    const [filTarget , setFilTarget] = useState({})

    const fetchData = async () =>{
        try {
            const {data: response} = await axios.get('http://localhost:8080/api/filiere');
            setFilieres(response);
        } catch (error) {
            console.error(error.message);
        }
    }

    let DeleteFiliere = (obj) => {
        let id_fil = obj.target.value
        try {
            axios.delete('http://localhost:8080/api/filiere/' + id_fil);
            Swal.fire({
                position: 'top-end',
                icon: 'success',
                title: 'Your work has been saved',
                showConfirmButton: false,
                timer: 1500
            })
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()
            forceLoad()

        } catch (error) {
            alert(error.message)
        }
    }

    useEffect(() => {
        fetchData();
    }, [loading]);


    let handleUpdate = (e) =>{
        setEtat('edit')
        let id_fil = e.target.value
        let objIndex = filieres.findIndex(
            (obj => obj.id_fil == id_fil)
        )
        setFilTarget(filieres[objIndex])
    }

    let forceLoad = () => {
        loading === false ? setLoading(true)  : setLoading(false)
    }

    let changeEtat = () => {
        setEtat('add')
    }

    return(
        <div style={{marginTop: '6rem' }}>
            {etat === 'add' ? <Form  load={forceLoad} /> : <Edit etat={changeEtat}  load={forceLoad} target={filTarget}/> }


            <div className="col-md-11" style={{marginLeft:'2rem'}} >
                {/*  Latest Orders */}
                <div className="block block-rounded block-mode-loading-refresh">
                    <div className="block-header block-header-default">
                        <h3 className="block-title">
                            List des Filieres
                        </h3>
                    </div>
                    <div className="block-content">
                        <table className="table table-striped table-hover table-borderless table-vcenter fs-sm">
                            <thead>
                            <tr className="text-uppercase">
                                <th>ID</th>
                                <th className="d-none d-xl-table-cell">Intitule</th>
                                <th className="d-none d-sm-table-cell text-end" style={{width: '120px'}}>Actions</th>

                            </tr>
                            </thead>
                            <tbody>
                            {/*<tr>*/}
                            {filieres.map(
                                (item) => {
                                    return(
                                        <tr key={item.id_fil}>
                                            <td>
                                                <span className="fw-semibold">{item.id_fil}</span>
                                            </td>
                                            <td className="d-none d-xl-table-cell">
                                                <span className="fw-semibold text-success">{item.intitule}</span>
                                            </td>
                                            <td className="d-none d-sm-table-cell text-end fw-medium" >
                                                <div className="d-flex">
                                                    <div className="d-inline-block">
                                                        <button className="btn btn-success" value={item.id_fil} onClick={handleUpdate}>EDIT</button>
                                                    </div>
                                                    <div className="d-inline-block">
                                                        &nbsp;&nbsp;
                                                    </div>
                                                    <div className="d-inline-block">
                                                        <button className="btn btn-danger" onClick={DeleteFiliere} value={item.id_fil}>DELETE</button>
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