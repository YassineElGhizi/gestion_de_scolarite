import React from "react";
import {
    BrowserRouter as Router,
    Routes,
    Route,
} from "react-router-dom";

import Etudiant from "./Etudiant";


import Sidebar from "./subComponents/sidebar";
import Contentheader from "./subComponents/Contentheader";
import Filiere from "./Filiere";


export default function Navbar(){

    return(
        <div id="page-container"
             className="sidebar-o sidebar-dark enable-page-overlay side-scroll page-header-fixed main-content-narrow">

            <Sidebar />

            <header id="page-header">
                <Contentheader />
            </header>


            <Router>
                <div>
                    <Routes >
                        <Route path="/etudiant" element={<Etudiant />}></Route>
                        <Route path="/filiere" element={<Filiere />}></Route>
                    </Routes >
                </div>
            </Router>

        </div>
    )

}