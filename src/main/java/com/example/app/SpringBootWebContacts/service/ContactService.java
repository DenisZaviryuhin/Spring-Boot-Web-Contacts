package com.example.app.SpringBootWebContacts.service;
import com.example.app.SpringBootWebContacts.entity.Contact;

import com.example.app.SpringBootWebContacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepository repository;

    public List<Contact> getContacts() throws URISyntaxException, IOException {
        return repository.getContacts();
    }
}
