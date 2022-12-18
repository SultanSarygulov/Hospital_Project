package com.hospital.Final_project.repository;

import com.hospital.Final_project.model.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {
//    DoctorModel findByEmail(String email);
    @Query(value="select name, office, time_table from staff", nativeQuery=true)
    List<DoctorModel> findAllTimeTable();
}
