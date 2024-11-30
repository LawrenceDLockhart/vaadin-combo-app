import { VerticalLayout } from '@vaadin/react-components/VerticalLayout';
import {ContactService, CrudService} from "Frontend/generated/endpoints";
import {AutoGrid} from "@vaadin/hilla-react-crud";
import ContactModel from "Frontend/generated/com/example/application/data/ContactModel";
import React, {useEffect} from "react";
import {useSignal} from "@vaadin/hilla-react-signals";
import Contact from "Frontend/generated/com/example/application/data/Contact";
import { Grid } from '@vaadin/react-components/Grid';
import { GridColumn } from '@vaadin/react-components/GridColumn';

export default function HillaGrid() {

    const contacts = useSignal<Contact[]>([]);

    useEffect(() => {
        ContactService.findAll().then(c => contacts.value = c);
    }, []);

    return (
        <div>
            <h2>Grid</h2>
            <Grid items={contacts.value}>
                <GridColumn path="name" />
                <GridColumn path="email" />
                <GridColumn path="phone" />
            </Grid>


            {/*<VerticalLayout><h1>New Heading</h1></VerticalLayout><h3 className="mt-xl">AutoGrid</h3>*/}
            {/*<AutoGrid service={CrudService} model={ContactModel} />*/}
        </div>
    )
}
