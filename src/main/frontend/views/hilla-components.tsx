import {useSignal} from "@vaadin/hilla-react-signals";
import Contact from "Frontend/generated/com/example/application/data/Contact";
import {useEffect} from "react";
import {ContactService} from "Frontend/generated/endpoints";
import {Button, ComboBox, DatePicker, Grid, GridSortColumn} from "@vaadin/react-components";

export default function HillaComponents(){
    const contacts = useSignal<Contact[]>([]);

    useEffect(() => {
        ContactService.findAll().then(c => contacts.value = c);
    }, []);

    return (
        <div className="flex flex-col gap-s items-start">
            <Button theme="primary">Click me</Button>
            <DatePicker label="Select date"/>
            <ComboBox
                label="Select person"
                items={contacts.value.map(c => c.name)} />

            <Grid items={contacts.value}>
                <GridSortColumn path="name" />
                <GridSortColumn path="email" />
                <GridSortColumn path="phone" />
            </Grid>
        </div>
    );
}