package com.hospital.Final_project.clients;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController("/clients")

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String listClients(Model model){
        model.addAttribute("clients", clientService.getAllClients());
        return "home";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        ClientModel clientModel = new ClientModel();
        model.addAttribute("client", clientModel);
        return "registration";
    }

    @PostMapping("/clients")
    public String saveClient(@ModelAttribute("client") ClientModel clientModel){
        clientService.saveClient(clientModel);
        return "redirect:/home";
    }

    public String getClient(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id));
        return "client";
    }


}
