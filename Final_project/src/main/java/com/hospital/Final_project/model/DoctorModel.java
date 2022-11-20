package com.hospital.Final_project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getOffice() {
        return office;
    }

    public void setOffice(Integer office) {
        this.office = office;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfbirth=" + dateOfbirth +
                ", role='" + role + '\'' +
                ", office=" + office +
                ", phone=" + phone +
                '}';
    }
}
