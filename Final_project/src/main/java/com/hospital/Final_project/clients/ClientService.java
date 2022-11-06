package com.hospital.Final_project.clients;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClientService {

    public List<ClientModel> getAllClients();

    ClientModel saveClient(ClientModel clientModel);

    ClientModel getClientById(Long id);

}
