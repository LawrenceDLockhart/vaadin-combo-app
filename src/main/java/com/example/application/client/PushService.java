package com.example.application.client;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import reactor.core.publisher.Flux;

import java.time.Duration;

@BrowserCallable
@AnonymousAllowed
public class PushService {

    public Flux<String> streamMessage() {
        return Flux.fromArray("Full stack from the back!".split(" "))
                .map(word -> word + " ")
                .delayElements(Duration.ofMillis(500));
    }
}
