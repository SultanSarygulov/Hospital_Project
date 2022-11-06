package com.hospital.Final_project.stuff;

import com.hospital.Final_project.clients.ClientModel;
import com.hospital.Final_project.stuff.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {
}
