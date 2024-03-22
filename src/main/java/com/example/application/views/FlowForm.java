package com.example.application.views;

import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import javax.swing.text.FlowView;

@Route("flow-form")
public class FlowForm extends VerticalLayout {

    public FlowForm() {
        add(new TextField("Enter name"));

    }
}
