package com.hospital.Final_project.controller;


import com.hospital.Final_project.model.DoctorModel;
import com.hospital.Final_project.service.ClientService;
import com.hospital.Final_project.service.DoctorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/doctor-home")
public class DoctorController {
    private final DoctorService doctorService;
    private final ClientService clientService;

    public DoctorController(DoctorService doctorService, ClientService clientService) {
        this.doctorService = doctorService;
        this.clientService = clientService;

    }

    @GetMapping
    public String doctorHomePage(Model model){
        return "Doctor home page";
    }



}
