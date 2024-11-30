import {useSignal} from "@vaadin/hilla-react-signals";
import {useEffect} from "react";
import {PushService} from "Frontend/generated/endpoints";

export default function HillaPush() {

    const message = useSignal('');

    useEffect(()=>{
        PushService.streamMessage()
            .onNext(word => message.value += word);
    },[]);

    return (
        <div>
            <p>{message}</p>
        </div>
    )
}