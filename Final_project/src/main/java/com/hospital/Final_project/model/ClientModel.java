package com.hospital.Final_project.model;


import javax.persistence.*;
import java.time.LocalDate;

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
    private LocalDate dateOfbirth;
    @Column(name = "problem")
    private String problem;
    @Column(name = "email")
    private String email;
    @Column(name = "phone", nullable = false)
    private Integer phone;
    @Column(name = "whom")
    private Long whom;
    @Column(name = "time", nullable = false)
    private LocalDate when;

    public ClientModel(){

    }

    public ClientModel(String name,
                       String surname,
                       LocalDate dateOfbirth,
                       String problem,
                       String email,
                       Integer phone,
                       Long whom,
                       LocalDate when) {
        super();
        this.name = name;
        this.surname = surname;
        this.dateOfbirth = dateOfbirth;
        this.problem = problem;
        this.email = email;
        this.phone = phone;
        this.whom = whom;
        this.when = when;
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

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Long getWhom() {
        return whom;
    }

    public void setWhom(Long whom) {
        this.whom = whom;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "Model_registration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfbirth=" + dateOfbirth +
                ", problem='" + problem + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", whom=" + whom +
                ", when=" + when +
                '}';
    }
}
