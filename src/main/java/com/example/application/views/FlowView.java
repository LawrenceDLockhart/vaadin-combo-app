package com.example.application.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("flow")
public class FlowView extends VerticalLayout {
    public FlowView() {
        add(new H1("Flow View"));
    }

}
