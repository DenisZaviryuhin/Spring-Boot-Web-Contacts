package com.example.app.SpringBootWebContacts.controller;

import com.example.app.SpringBootWebContacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class AppController {
    @Autowired
    ContactService service;

    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("contacts", service.getContacts());
        return "home";
    }
}
