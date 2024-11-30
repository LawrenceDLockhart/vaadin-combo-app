package com.example.application.views;

import com.vaadin.flow.component.html.H3;

import com.example.application.data.Contact;
import com.example.application.data.ContactRepository;
import com.vaadin.flow.component.html.H5;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import reactor.core.publisher.Flux;
import java.time.Duration;

@Route(value = "form", layout = MainLayout.class)
public class FlowForm extends VerticalLayout {

    public FlowForm(ContactRepository repo) {
        var ui = UI.getCurrent();
        Flux.fromArray("Full stack from the back!".split(" "))
                .delayElements(Duration.ofMillis(500))
                .subscribe(word -> ui.access(() -> add(word+ " ")));
        //
        Button button = new Button("Press me for a greeting");
        TextField name = new TextField("Enter name here");
        button.addClickListener(e ->  {
            Notification.show("Hello " + name.getValue() + "!");
        });
        button.addClickShortcut(Key.ENTER);
        add(name, button);
        H3 heading3 = new H3("Heading 3");

        var grid = new Grid<Contact>();
        grid.addColumn(Contact::getName).setHeader("Name");
        grid.addColumn(Contact::getEmail).setHeader("Email");
        grid.addColumn(Contact::getPhone).setHeader("Phone");
//      grid.setItems(repo.findAll());
        grid.setItems(query -> repo.findAll(VaadinSpringDataHelpers.toSpringPageRequest(query)).stream());
        add(heading3);
        add(grid);

        TextField firstName = new TextField("First name");
        TextField lastName = new TextField("Last name");
        TextField username = new TextField("Username");
        PasswordField password = new PasswordField("Password");
        PasswordField confirmPassword = new PasswordField("Confirm password");

        FormLayout formLayout = new FormLayout();
        formLayout.add(firstName, lastName, username, password,
                confirmPassword);
        formLayout.setResponsiveSteps(

                new FormLayout.ResponsiveStep("0", 1),
                // Use two columns, if layout's width exceeds 500px
                new FormLayout.ResponsiveStep("500px", 2));
        // Stretch the username field over 2 columns
        formLayout.setColspan(username, 2);

        add(formLayout);
    }
}
