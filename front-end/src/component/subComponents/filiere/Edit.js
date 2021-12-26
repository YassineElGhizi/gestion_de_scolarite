import React, {useState} from "react";
import axios from "axios";
import Swal from "sweetalert2";


export default function Edit(props){
    const [id , setId] = useState(props.target.id_fil)
    const [intitule , setIntitule] = useState(props.target.intitule)

   let update = (e) => {
        e.preventDefault();
        axios.put('http://localhost:8080/api/filiere/' + id + `?intitule=${intitule}`)
            .then(function (response) {
                console.log(response);
                Swal.fire({
                    position: 'top-end',
                    icon: 'success',
                    title: 'Your work has been saved',
                    showConfirmButton: false,
                    timer: 1500
                })
                props.etat()
                props.load()
                props.load()
                props.load()
            })
            .catch(function (error) {
                alert(error);
            });
   }



    return(
        <div className="block block-rounded col-md-11" style={{marginLeft:'2rem'}}>
            <div className="block-header block-header-default">
                <h3 className="block-title">Modifier Un Etudiant</h3>
            </div>
            <div className="block-content">
                <form>
                    <h2 className="content-heading pt-0">Modifier</h2>
                    <div className="row push">
                        <div className="col-lg-4">
                            <p className="text-muted"></p>
                        </div>
                        <div className="col-lg-8 col-xl-5">

                            <div className="mb-4">
                                <label className="form-label" >Intitule</label>
                                <input type="text" className="form-control" id="example-nom-input"
                                        placeholder="Nom Input" onChange={ event => setIntitule(event.target.value) }
                                        value={ intitule }
                                />
                            </div>
                            <button className="btn btn-success" onClick={update}>Confirmer</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>


    )
}