package com.hospital.Final_project.controller;


import com.hospital.Final_project.model.ClientModel;
import com.hospital.Final_project.service.ClientService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public ModelAndView findClients(Model model){
        model.addAttribute("clients", clientService.getAllClients());
        return new ModelAndView("clients");
    }

    @GetMapping("/registration")
    public ModelAndView registration(Model model){
        ClientModel clientModel = new ClientModel();
        model.addAttribute("clients", clientModel);
        return new ModelAndView("registration");
    }

    @GetMapping("/get")
    public String getClient(@PathVariable Long id, Model model) {
        model.addAttribute("client",clientService.getClientById(id));
        return "";
    }
}
