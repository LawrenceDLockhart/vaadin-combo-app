package com.example.application.views;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("flow-events")
public class FlowEvents extends VerticalLayout {
    public FlowEvents() {
        var textField = new TextField("Your name");
        var button = new Button("Say hello");

        button.addClickListener(e -> {
            add(new Paragraph("Hello, " + textField.getValue() +"!"));
            textField.clear();
        });
        button.addClickShortcut(Key.ENTER);

        var formLayout = new HorizontalLayout(textField, button);
        formLayout.setDefaultVerticalComponentAlignment(Alignment.BASELINE);

        add(formLayout);
    }
}
