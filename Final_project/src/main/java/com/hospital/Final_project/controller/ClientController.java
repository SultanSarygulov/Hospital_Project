package com.hospital.Final_project.controller;


import com.hospital.Final_project.model.ClientModel;
import com.hospital.Final_project.service.ClientService;
import com.hospital.Final_project.service.DoctorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/home")
public class ClientController {
    private final DoctorService doctorService;
    private final ClientService clientService;

    public ClientController(DoctorService doctorService, ClientService clientService) {
        this.doctorService = doctorService;
        this.clientService = clientService;
    }

    @GetMapping
    public String homePage(Model model){
        return "Home page";
    }



}
