import ContactModel from "Frontend/generated/com/example/application/data/ContactModel";
import React from "react";
import {AutoCrud, AutoGrid} from "@vaadin/hilla-react-crud";
import {CrudService} from "Frontend/generated/endpoints";


export default function HillaAutocrud() {
    return (
        <div>
            <h2>Autocrud view</h2>
            <AutoGrid className = "p-m" service={CrudService} model={ContactModel} />
            <AutoCrud className= "p-m" service={CrudService} model={ContactModel} />
        </div>
    )
}