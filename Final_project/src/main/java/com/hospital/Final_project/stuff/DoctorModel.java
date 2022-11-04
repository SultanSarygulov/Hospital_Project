package com.hospital.Final_project.stuff;

import java.time.LocalDate;

public class DoctorModel {

    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfbirth;
    private String role;
    private Integer office;
    private Integer number;

    public DoctorModel(Long id) {
        this.id = id;
    }

    public DoctorModel(
            Long id,
            String name,
            String surname,
            LocalDate dateOfbirth,
            String role,
            Integer office,
            Integer number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfbirth = dateOfbirth;
        this.role = role;
        this.office = office;
        this.number = number;
    }

    public DoctorModel(
            String name,
            String surname,
            LocalDate dateOfbirth,
            String role,
            Integer office,
            Integer number) {
        this.name = name;
        this.surname = surname;
        this.dateOfbirth = dateOfbirth;
        this.role = role;
        this.office = office;
        this.number = number;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
                ", number=" + number +
                '}';
    }
}
