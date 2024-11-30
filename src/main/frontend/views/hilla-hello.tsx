import { LoginForm } from '@vaadin/react-components/LoginForm';
import React, {useState} from "react";
import { Button } from '@vaadin/react-components/Button';
import { TextField } from '@vaadin/react-components/TextField';
import { Notification } from '@vaadin/react-components/Notification';


export default function HillaHello() {
    const [name, setName] = useState("");
    function greet() {
        Notification.show("Hi " + name);
    }
    return (
        <div className="flex flex-col gap-s items-start">
            <TextField
                label="Enter name here"
                value={name}
                onChange={e => setName(e.target.value)}
            />
            <Button onClick={greet}>Press me for a greeting</Button>

        </div>
    )
}
