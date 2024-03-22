package com.example.application.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import reactor.core.publisher.Flux;
import java.time.Duration;

@Route("flow-push")
public class FlowPush extends VerticalLayout {
    public FlowPush() {
        var ui = UI.getCurrent();

        Flux.fromArray("Full stack from the back!".split(" "))
                .delayElements(Duration.ofMillis(500))
                .subscribe(word -> ui.access(() -> add(word+ " ")));
    }
}
