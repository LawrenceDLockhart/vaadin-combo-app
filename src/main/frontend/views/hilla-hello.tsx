import React, {useState} from "react";
import {Button, TextField, Notification} from "@vaadin/react-components";

export default function HillaHello() {
    const [name, setName] = useState("");
    function greet() {
        Notification.show(name);
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