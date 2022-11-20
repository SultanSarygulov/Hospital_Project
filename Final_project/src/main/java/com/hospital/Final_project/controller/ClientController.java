package com.hospital.Final_project.controller;


import com.hospital.Final_project.model.ClientModel;
import com.hospital.Final_project.service.ClientService;
import com.hospital.Final_project.service.DoctorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ClientController {
    private final DoctorService doctorService;
    private final ClientService clientService;

    public ClientController(DoctorService doctorService, ClientService clientService) {
        this.doctorService = doctorService;
        this.clientService = clientService;
    }

    @GetMapping("/homePage")
    public String homePage(Model model){
        return "Home page";
    }

    @GetMapping("/doctors")
    public ModelAndView findClients(Model model){
        model.addAttribute("doctors", doctorService.getAllstuff());
        return new ModelAndView("doctors");
    }

    @GetMapping("/doctor/{id}")
    public ModelAndView getClientById(@PathVariable Long id, Model model){
        model.addAttribute("doctor", doctorService.getDoctorById(id));
        return new ModelAndView("");
    }

    @GetMapping("/doctors/registration")
    public ModelAndView registration(Model model){
        ClientModel clientModel = new ClientModel();
        model.addAttribute("client", clientModel);
        return new ModelAndView("registration");
    }

    @GetMapping("/homePage/history")
    public String history(Model model){
        return "Your history";
    }

    @PostMapping("/save")
    public ModelAndView saveClient(@ModelAttribute("client") ClientModel clientModel){
        clientService.saveClient(clientModel);
        return new ModelAndView("redirect:/doctors");
    }

}
