package com.example.application.views;

import com.example.application.data.Contact;
import com.example.application.data.ContactRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("flow-components")
public class FlowComponents extends VerticalLayout {

    public FlowComponents(ContactRepository repo) {
        var contacts = repo.findAll();

        var button = new Button("Click me");
        var datePicker = new DatePicker("Select date");
        var comboBox = new ComboBox<String>("Select person");
        var grid = new Grid<>(Contact.class);

        // Add components to layout
        add(button, datePicker, comboBox, grid);

        // Configure components
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        comboBox.setItems(contacts.stream().map(Contact::getName).toList());
        grid.setColumns("name", "email", "phone");
        grid.setItems(contacts);
    }
}
