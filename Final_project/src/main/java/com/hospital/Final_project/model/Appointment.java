package com.hospital.Final_project.model;

import com.hospital.Final_project.user.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "illness")
    private String illness;
    @Column(name = "appointmentTime")
    private LocalDateTime appointmentTime;
    @Column(name = "result")
    private String result;
    @Column(name = "startTherapy")
    private LocalDate startTherapy;
    @Column(name = "endTherapy")
    private LocalDate endTherapy;


    public Appointment() {
    }

    public Appointment(String illness, LocalDateTime appointmentTime, String result, LocalDate startTherapy, LocalDate endTherapy) {
        this.illness = illness;
        this.appointmentTime = appointmentTime;
        this.result = result;
        this.startTherapy = startTherapy;
        this.endTherapy = endTherapy;
    }
}
