package com.hospital.Final_project.model;


import com.hospital.Final_project.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Collection<Appointment> appointments;

    public ClientModel(){

    }

    public ClientModel(
            LocalDate dateOfbirth,
            String bloodGroup,
            String height,
            String weight,
            Integer phone
    )
    {
        this.dateOfbirth = dateOfbirth;
        this.bloodGroup = bloodGroup;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
    }

}
