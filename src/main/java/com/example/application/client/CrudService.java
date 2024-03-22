package com.example.application.client;

import com.example.application.data.Contact;
import com.example.application.data.ContactRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class CrudService extends CrudRepositoryService<Contact, Long, ContactRepository> {
}
