import React from "react";


export default function Contentheader(){
    return(
        <div className="content-header">
            <div className="space-x-1">
                {/* User Dropdown */}
                <div className="dropdown d-inline-block">
                    <button type="button" className="btn btn-alt-secondary" id="page-header-user-dropdown"
                            data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i className="fa fa-fw fa-user d-sm-none"/>
                        <span className="d-none d-sm-inline-block">Admin</span>
                    </button>
                    <div className="dropdown-menu dropdown-menu-end p-0"
                         aria-labelledby="page-header-user-dropdown">
                        <div className="bg-primary-dark rounded-top fw-semibold text-white text-center p-3">
                            User Options
                        </div>
                        <div className="p-2">
                            <a className="dropdown-item" href="be_pages_generic_profile.html">
                                <i className="far fa-fw fa-user me-1"/> Profile
                            </a>
                            <a className="dropdown-item d-flex align-items-center justify-content-between"
                               href="be_pages_generic_inbox.html">
                                <span><i className="far fa-fw fa-envelope me-1"/> Inbox</span>
                                <span className="badge bg-primary rounded-pill">3</span>
                            </a>
                            <a className="dropdown-item" href="be_pages_generic_invoice.html">
                                <i className="far fa-fw fa-file-alt me-1"/> Invoices
                            </a>
                            <div role="separator" className="dropdown-divider"/>
                            {/* Toggle Side Overlay */}
                            {/* Layout API, functionality initialized in Template._uiApiLayout() */}
                            <a className="dropdown-item" href="javascript:void(0)" data-toggle="layout"
                               data-action="side_overlay_toggle">
                                <i className="far fa-fw fa-building me-1"/> Settings
                            </a>
                            {/* END Side Overlay */}
                            <div role="separator" className="dropdown-divider"/>
                            <a className="dropdown-item" href="op_auth_signin.html">
                                <i className="far fa-fw fa-arrow-alt-circle-left me-1"/> Sign Out
                            </a>
                        </div>
                    </div>
                </div>

                {/* END Toggle Side Overlay */}
            </div>
            {/* END Right Section */}
        </div>
    )
}