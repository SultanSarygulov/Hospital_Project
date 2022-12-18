package com.hospital.Final_project.controller;

import com.hospital.Final_project.service.ClientService;
import com.hospital.Final_project.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/head-doctor-home")
public class HeadDoctorController {

    private final DoctorService doctorService;
    private final ClientService clientService;

    public HeadDoctorController(DoctorService doctorService, ClientService clientService) {
        this.doctorService = doctorService;
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("1. List of doctors 2. List of clients");
    }

}
