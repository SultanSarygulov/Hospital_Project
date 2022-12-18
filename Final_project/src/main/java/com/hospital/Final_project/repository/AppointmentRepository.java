package com.hospital.Final_project.repository;

import com.hospital.Final_project.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

//    @Query(value="select name, office, time_table from staff", nativeQuery=true)
}
