package com.hospital.Final_project.clients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.beans.ConstructorProperties;
import java.util.List;

@RestController("/clients")

public class ClientController {
    private

    @GetMapping("/main")
    public String main(){

        return null;
    }

    @GetMapping("/registration")
    public String registration(@RequestBody ClientModel clientModel){
        return null;
    }
}
