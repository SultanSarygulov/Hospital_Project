package com.hospital.Final_project.clients;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;

@Repository
public class ClientRepository {
    HashMap<String, LocalDate> registration = new HashMap<>();
}
