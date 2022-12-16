package com.hospital.Final_project.service.serviceImpl;

import com.hospital.Final_project.model.ClientModel;
import com.hospital.Final_project.repository.ClientRepository;
import com.hospital.Final_project.service.ClientService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceimpl implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceimpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<ClientModel> getAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public void saveClient(ClientModel clientModel){
        this.clientRepository.save(clientModel);
    }

    @Override
    public ClientModel getClientById(Long id) {
        return clientRepository.findById(id).get();
    }

}
