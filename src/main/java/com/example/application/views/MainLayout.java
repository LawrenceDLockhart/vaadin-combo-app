package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

// MainLayout.java
public class MainLayout extends VerticalLayout implements RouterLayout {
    public MainLayout() {
        RouterLink homeLink = new RouterLink("Form", FlowForm.class);
        RouterLink dataLink = new RouterLink("Push", FlowPush.class);
        HorizontalLayout navigation = new HorizontalLayout(homeLink, dataLink);
        add(navigation);
    }
}

// HomeView.java
