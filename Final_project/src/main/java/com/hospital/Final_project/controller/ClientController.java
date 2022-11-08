package com.hospital.Final_project.controller;

import com.hospital.Final_project.model.ClientModel;
import com.hospital.Final_project.service.ClientService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String listClients(Model model){
        model.addAttribute("client", clientService.getAllClients());
        return "clients";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        ClientModel clientModel = new ClientModel();
        model.addAttribute("client", clientModel);
        return "registration";
    }

    @PostMapping("/")
    public String saveClient(@ModelAttribute("client") ClientModel clientModel){
        clientService.saveClient(clientModel);
        return "redirect:/home";
    }

    public String getClient(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id));
        return "";
    }


}
