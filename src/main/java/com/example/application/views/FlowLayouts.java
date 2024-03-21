package com.example.application.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("flow-layouts")
public class FlowLayouts extends VerticalLayout {
    public FlowLayouts() {
        add(new H1("Flow View"));
    }

}
