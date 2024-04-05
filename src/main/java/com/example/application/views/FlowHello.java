package com.example.application.views;

import com.sun.jna.platform.unix.X11;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("flow-hello")
public class FlowHello extends VerticalLayout {
    public FlowHello() {
        Button button = new Button("Press me for a greeting");
        TextField name = new TextField("Enter name here");
        button.addClickListener(e ->  {
            Notification.show("Hello " + name.getValue() + "!");
        });

        button.addClickShortcut(Key.ENTER);
        add(name, button);
    }
}
