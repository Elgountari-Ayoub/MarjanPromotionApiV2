package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.ClientDTO;
import com.example.marjanpromotionapiv2test.Entities.ClientEntity;
import com.example.marjanpromotionapiv2test.Entities.FideliteEntity;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Respositories.ClientRepository;
import com.example.marjanpromotionapiv2test.Services.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository ;
    private final ModelMapper modelMapper ;
    private final Generate generate ;

    public ClientServiceImpl(ClientRepository clientRepository, ModelMapper modelMapper, Generate generate) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;
        this.generate = generate;
    }

    @Override
    public ClientDTO create(ClientDTO clientDTO) {
        ClientEntity client = modelMapper.map(clientDTO, ClientEntity.class);
        client.setClientId(generate.generateStringId());
        FideliteEntity fideliteEntity = FideliteEntity.builder()
                .fideliteId(generate.generateStringId())
                .points(0)
                .build();
        client.setFideliteEntity(fideliteEntity);
        ClientEntity createdClient = clientRepository.save(client);
        return modelMapper.map(createdClient, ClientDTO.class);
    }

    @Override
    public ClientDTO update(String clientId, ClientDTO clientDTO) {
        return null;
    }

    @Override
    public ClientDTO findByClientId(String clientId) {
        if (clientRepository.findByClientId(clientId).isPresent())
            return modelMapper.map(clientRepository.findByClientId(clientId).get(),ClientDTO.class);
        else
            return null ;

    }

    @Override
    public List<ClientDTO> findAll() {
        return null;
    }

    @Override
    public void delete(String clientId) {

    }
}
