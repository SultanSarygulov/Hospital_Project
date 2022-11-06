package com.hospital.Final_project.clients;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceimpl implements ClientService{

    private ClientRepository clientRepository;

    public ClientServiceimpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<ClientModel> getAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public ClientModel saveClient(ClientModel clientModel){
        return clientRepository.save(clientModel);
    }

    @Override
    public ClientModel getClientById(Long id) {
        return clientRepository.findById(id).get();
    }
}
