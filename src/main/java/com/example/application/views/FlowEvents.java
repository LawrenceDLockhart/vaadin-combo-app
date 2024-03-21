package com.example.application.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("flow-events")
public class FlowEvents extends VerticalLayout {
    public FlowEvents() {
        add(new H1("Flow event page"));
    }
}
