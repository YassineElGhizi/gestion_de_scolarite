import React, {useState} from "react";
import axios from "axios";


export default function Form(props){
    const [intitule , setIntitule] = useState('')

   let add = (e) => {
        e.preventDefault();

        axios.post('http://localhost:8080/api/filiere', {
            intitule : intitule
        })
            .then(function (response) {
                console.log(response);
                props.load()
                setIntitule('')

            })
            .catch(function (error) {
                alert(error);
            });
   }



    return(
        <div className="block block-rounded col-md-11" style={{marginLeft:'2rem'}}>
            <div className="block-header block-header-default">
                <h3 className="block-title">Ajouter Une Filier</h3>
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
                                <label className="form-label" >Intitule</label>
                                <input type="text" className="form-control" id="example-cne-input"
                                        placeholder="Cne Input" onChange={event => setIntitule(event.target.value)}
                                        value={intitule}
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