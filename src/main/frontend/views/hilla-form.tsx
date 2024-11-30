import {useForm} from "@vaadin/hilla-react-form";
import ContactModel from "Frontend/generated/com/example/application/data/ContactModel";
import {ContactService, CrudService} from "Frontend/generated/endpoints";
import {AutoForm} from "@vaadin/hilla-react-crud";
import { Button } from '@vaadin/react-components/Button';
import { TextField } from '@vaadin/react-components/TextField';
import {useSignal} from "@vaadin/hilla-react-signals";
import Contact from "Frontend/generated/com/example/application/data/Contact";
import {useEffect} from "react";

export default function HillaForm() {
    const contact = useSignal<Contact | undefined>(undefined);

    useEffect(() => {
        ContactService.findById(42).then(c => {
            contact.value = c;
            read(c);
        });
    }, []);

    const {field, model, read, submit} = useForm(ContactModel, {
        onSubmit: saved => ContactService.save(saved)
    });

    return (
        <div>

            <div className="flex flex-col">
                <h1>Hilla Form</h1><div className="grid grid-cols-2 items-baseline gap-m">
                    <TextField label="Name" {...field(model.name)} />
                    <TextField label="Email" {...field(model.email)} />
                    <TextField label="Phone" {...field(model.phone)} />
                </div>
                <Button className="self-end" onClick={submit} theme="primary">Send</Button>
            </div>









            {/*<h3 className="mt-xl">AutoForm</h3>*/}
            {/*<AutoForm service={CrudService} model={ContactModel} item={contact.value}/>*/}
        </div>
    );
}
