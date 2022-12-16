package com.hospital.Final_project.controller;


import com.hospital.Final_project.model.DoctorModel;
import com.hospital.Final_project.service.ClientService;
import com.hospital.Final_project.service.DoctorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DoctorController {
    private final DoctorService doctorService;
    private final ClientService clientService;

    public DoctorController(DoctorService doctorService, ClientService clientService) {
        this.doctorService = doctorService;
        this.clientService = clientService;

    }

    @GetMapping("/doctorHomePage")
    public String doctorHomePage(Model model){
        return "Doctor home page";
    }

    @GetMapping("/clients")
    public ModelAndView findClients(Model model){
        model.addAttribute("clients", clientService.getAllClients());
        return new ModelAndView("clients");
    }

    @GetMapping("/client")
    public ModelAndView getClientById(){
//        model.addAttribute("client", clientService.getClientById(id));
        return new ModelAndView("client");
    }

    @GetMapping("/client/sendResults")
    public String sendClientsResult(Model model){
        return "Your results are good!";
    }

}
