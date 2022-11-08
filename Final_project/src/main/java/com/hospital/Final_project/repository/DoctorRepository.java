package com.hospital.Final_project.repository;

import com.hospital.Final_project.model.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {
}
