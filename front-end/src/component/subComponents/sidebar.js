import React from "react";


export default function Sidebar(){

    return(
        <nav id="sidebar" aria-label="Main Navigation">
            <div className="bg-header-dark">
                <div className="content-header bg-white-5">
                    {/* Logo */}
                    <a className="fw-semibold text-white tracking-wide" href="index.html">
                            <span className="smini-hidden">
                  Gestion de <span className="opacity-75"> Scolarité</span>
                </span>
                    </a>

                    <div>

                        <button type="button" className="btn btn-sm btn-alt-secondary d-lg-none"
                                data-toggle="layout" data-action="sidebar_close">
                            <i className="fa fa-times-circle"/>
                        </button>
                        {/* END Close Sidebar */}
                    </div>
                    {/* END Options */}
                </div>
            </div>
            {/* END Side Header */}
            {/* Sidebar Scrolling */}
            <div className="js-sidebar-scroll">
                {/* Side Navigation */}
                <div className="content-side">
                    <ul className="nav-main">

                        <li className="nav-main-heading">Modules</li>
                        <li className="nav-main-item">
                            <a className="nav-main-link" data-toggle="submenu"
                               aria-haspopup="true" aria-expanded="false" href="/etudiant">
                                <span className="nav-main-link-name">Etudiant</span>
                            </a>
                        </li>
                        <li className="nav-main-item">
                            <a className="nav-main-link" data-toggle="submenu"
                               aria-haspopup="true" aria-expanded="false" href="#">
                                <span className="nav-main-link-name">Evaluation</span>
                            </a>
                        </li>
                        <li className="nav-main-item">
                            <a className="nav-main-link" data-toggle="submenu"
                               aria-haspopup="true" aria-expanded="false" href="#">
                                <span className="nav-main-link-name">Inscription</span>
                            </a>

                        </li>

                        <li className="nav-main-item">
                            <a className="nav-main-link" data-toggle="submenu"
                               aria-haspopup="true" aria-expanded="false" href="#">
                                <span className="nav-main-link-name">Module</span>
                            </a>
                        </li>
                        <li className="nav-main-item">
                            <a className="nav-main-link" data-toggle="submenu"
                               aria-haspopup="true" aria-expanded="false" href="/filiere">
                                <span className="nav-main-link-name">Filiere</span>
                            </a>
                        </li>
                        <li className="nav-main-item">
                            <a className="nav-main-link" data-toggle="submenu"
                               aria-haspopup="true" aria-expanded="false" href="#">
                                <span className="nav-main-link-name">Planning</span>
                            </a>
                        </li>
                    </ul>
                </div>
                {/* END Side Navigation */}
            </div>
            {/* END Sidebar Scrolling */}
        </nav>
    )
}