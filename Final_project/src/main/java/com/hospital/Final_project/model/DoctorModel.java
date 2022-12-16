package com.hospital.Final_project.model;

import com.hospital.Final_project.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@Table(name = "staff")
public class DoctorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "dateOFbirth", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfbirth;
    @Column(name = "role", nullable = false)
    private String role;
    @Column(name = "office", nullable = false)
    private Integer office;
    @Column(name = "phone", nullable = false)
    private Integer phone;

    @OneToOne(mappedBy = "doctorModel")
    private User user;

    public DoctorModel() {
    }

    public DoctorModel(
            String name,
            String surname,
            LocalDate dateOfbirth,
            String role,
            Integer office,
            Integer phone
    ) {
        this.name = name;
        this.surname = surname;
        this.dateOfbirth = dateOfbirth;
        this.role = role;
        this.office = office;
        this.phone = phone;
    }

}
