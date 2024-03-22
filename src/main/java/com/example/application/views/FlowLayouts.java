package com.example.application.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("flow-layouts")
public class FlowLayouts extends VerticalLayout {
    public FlowLayouts() {
        HorizontalLayout layout = new HorizontalLayout();
        layout.add(new H3("Vaadin Layouts"));
        HorizontalLayout buttons = new HorizontalLayout();
        buttons.add(new Button("Start"));
        buttons.add(new Button("Pause"));
        buttons.add(new Button("End"));
        HorizontalLayout textFields = new HorizontalLayout();
        textFields.add(new TextField("Player Name"));
        textFields.add(new TextField("Age"));
        textFields.add(new TextField("Ranking"));
        FormLayout formLayout = new FormLayout();
        formLayout.add(new TextField("Player Name"));
        formLayout.add(new TextField("Age"));
        formLayout.add(new TextField("Ranking"));
        Image image = new Image();

        add(layout);
        add(buttons);
        add(textFields);
        add(formLayout);
        add(image);
    }
}
