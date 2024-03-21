package com.example.application.views;

import com.example.application.data.Contact;
import com.example.application.data.ContactRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;

@Route("flow-grid")
public class FlowGrid extends VerticalLayout {


    public FlowGrid(ContactRepository repo) {

        var grid = new Grid<Contact>();
        grid.addColumn(Contact::getName).setHeader("Name");
        grid.addColumn(Contact::getEmail).setHeader("Email");
        grid.addColumn(Contact::getPhone).setHeader("Phone");

        // Load all items into memory - easy, but not great for large data sets
        //grid.setItems(repo.findAll());

        // Use callback to lazily fetch pages from the database
        grid.setItems(query -> repo.findAll(VaadinSpringDataHelpers.toSpringPageRequest(query)).stream());

        add(grid);
    }
}
