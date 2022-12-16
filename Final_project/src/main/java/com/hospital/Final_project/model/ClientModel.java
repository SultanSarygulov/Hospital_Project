package com.hospital.Final_project.model;


import com.hospital.Final_project.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "dateOFbirth", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfbirth;
    @Column(name = "bloodGroup")
    private String bloodGroup;
    @Column(name = "height")
    private String height;
    @Column(name = "weight")
    private String weight;
    @Column(name = "phone", nullable = false)
    private Integer phone;

    @OneToOne(mappedBy = "clientModel")
    private User user;

    public ClientModel(){

    }

    public ClientModel(
            String name,
            String surname,
            LocalDate dateOfbirth,
            String bloodGroup,
            String height,
            String weight,
            Integer phone
    ) {
        this.name = name;
        this.surname = surname;
        this.dateOfbirth = dateOfbirth;
        this.bloodGroup = bloodGroup;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
    }

}
