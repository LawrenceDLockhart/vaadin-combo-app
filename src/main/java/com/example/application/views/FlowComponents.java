package com.example.application.views;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("flow-components")
public class FlowComponents extends VerticalLayout {
    public FlowComponents() {
        add(new H2("Flow component page"));
    }
}
