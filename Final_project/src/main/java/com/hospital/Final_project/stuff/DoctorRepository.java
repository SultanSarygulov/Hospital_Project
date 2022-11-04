package com.hospital.Final_project.stuff;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;

@Repository
public class DoctorRepository {
    HashMap<String, LocalDate> doctorInfo = new HashMap<>();
}
