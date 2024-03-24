package com.example.app.SpringBootWebContacts.repository;

import com.example.app.SpringBootWebContacts.entity.Contact;
import com.example.app.SpringBootWebContacts.utils.Constants;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.logging.Logger;
import java.util.List;

@Repository
public class ContactRepository {
    private static final Logger LOGGER = Logger.getLogger(ContactRepository.class.getName());
    List<Contact> list;

    public List<Contact> getContacts() throws IOException {
        File jsonFile = new ClassPathResource(Constants.URL_FILES
                + Constants.FILE_CONTACTS).getFile();
        String path = jsonFile.getAbsolutePath();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            list = gson.fromJson(reader,
                    new TypeToken<List<Contact>>() {
                    }.getType());
            reader.close();
            return list.stream().map(contact -> new Contact(contact.getId(),
                    Constants.URL_IMAGES + contact.getImg(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getPhone())).toList();
        } catch (Exception e) {
            LOGGER.info("ContactRepository msg: " + e.getMessage());
            return Collections.emptyList();
        }

    }
}
