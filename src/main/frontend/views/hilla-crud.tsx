import { AvatarGroup } from '@vaadin/react-components/AvatarGroup';
import ContactModel from "Frontend/generated/com/example/application/data/ContactModel";
import React from "react";
import {AutoCrud} from "@vaadin/hilla-react-crud";
import {CrudService} from "Frontend/generated/endpoints";


export default function HillaCrud() {
    return <AutoCrud
                service={CrudService}
                model={ContactModel} className="auto-crud hilla-crud-auto-crud"
            ></AutoCrud>
}














