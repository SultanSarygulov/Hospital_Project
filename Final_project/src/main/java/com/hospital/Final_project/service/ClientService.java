package com.hospital.Final_project.service;

import com.hospital.Final_project.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClientService {

    List<ClientModel> getAllClients();

    ClientModel saveClient(ClientModel clientModel);

    ClientModel getClientById(Long id);

}
