import React, {useState} from "react";
import axios from "axios";


export default function Form(props){

    const [cne , setCne] = useState('')
    const [nom , setNom] = useState('')
    const [prenom , setPrenom] = useState('')


   let add = (e) => {
        e.preventDefault();
        let etudiant = {cne:cne, nom: nom, prenom : prenom};
        axios.post('http://localhost:8080/api/etudiant', etudiant)
            .then(function (response) {
                console.log(response);
                props.addetudiant(etudiant)
                props.load()
                setCne('')
                setNom('')
                setPrenom('')
            })
            .catch(function (error) {
                alert(error);
            });
   }



    return(
        <div className="block block-rounded col-md-11" style={{marginLeft:'2rem'}}>
            <div className="block-header block-header-default">
                <h3 className="block-title">Ajouter Un Etudiant</h3>
            </div>
            <div className="block-content">
                <form>
                    <h2 className="content-heading pt-0">Ajouter</h2>
                    <div className="row push">
                        <div className="col-lg-4">
                            <p className="text-muted"></p>
                        </div>
                        <div className="col-lg-8 col-xl-5">
                            <div className="mb-4">
                                <label className="form-label" >Cne</label>
                                <input type="text" className="form-control" id="example-cne-input"
                                        placeholder="Cne Input" onChange={event => setCne(event.target.value)}
                                        value={cne}
                                />
                            </div>
                            <div className="mb-4">
                                <label className="form-label" >Nom</label>
                                <input type="text" className="form-control" id="example-nom-input"
                                        placeholder="Nom Input" onChange={ event => setNom(event.target.value) }
                                        value={ nom }
                                />
                            </div>
                            <div className="mb-4">
                                <label className="form-label" >Prenom</label>
                                <input type="text" className="form-control" id="example-prenom-input"
                                        placeholder="Prenom Input" onChange={event => setPrenom(event.target.value)}
                                        value={  prenom }
                                />
                            </div>
                            <button className="btn btn-success" onClick={add }>Add</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>


    )
}