package com.hospital.Final_project.user;

import com.hospital.Final_project.model.ClientModel;
import com.hospital.Final_project.model.DoctorModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userSurname")
    private String userSurname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "users_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection<Role> userRole;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_doctor_id", referencedColumnName = "id")
    private DoctorModel doctorModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_client_id", referencedColumnName = "id")
    private ClientModel clientModel;

    public User(){

    }

    public User(String userName, String userSurname, String email, String password) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
        this.password = password;
    }
}
