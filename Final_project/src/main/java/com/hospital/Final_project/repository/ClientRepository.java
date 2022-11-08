package com.hospital.Final_project.repository;

import com.hospital.Final_project.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
