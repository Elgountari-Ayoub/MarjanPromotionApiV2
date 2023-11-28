package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.ClientDTO;
import com.example.marjanpromotionapiv2test.DTOs.ProduitDTO;
import com.example.marjanpromotionapiv2test.Entities.ClientEntity;
import com.example.marjanpromotionapiv2test.Entities.FideliteEntity;
import com.example.marjanpromotionapiv2test.Helpers.EmailService;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Requests.AchatRequest;
import com.example.marjanpromotionapiv2test.Respositories.ClientRepository;
import com.example.marjanpromotionapiv2test.Respositories.ProduitRepository;
import com.example.marjanpromotionapiv2test.Services.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository ;
    private final ModelMapper modelMapper ;
    private final ProduitRepository produitRepository ;
    private final Generate generate ;

    private final EmailService emailService ;

    public ClientServiceImpl(ClientRepository clientRepository, ModelMapper modelMapper, ProduitRepository produitRepository, Generate generate, EmailService emailService) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;
        this.produitRepository = produitRepository;
        this.generate = generate;
        this.emailService = emailService;
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

    @Override
    public void achat(AchatRequest achatRequest) {
        List<ProduitDTO> produitDTOList = achatRequest.getProductList().stream().map(produitId ->{
            if (produitRepository.findByProduitId(produitId).isPresent())
                return modelMapper.map(produitRepository.findByProduitId(produitId).get(),ProduitDTO.class);
            return null;
            }
        ).toList();
        StringBuilder emailBody = new StringBuilder();
        emailBody.append( "Thank you for your purchase! Here are the details of your recent purchase:\n\n");
        produitDTOList.forEach(produitDTO -> {
            emailBody.append("Product :")
                    .append(produitDTO.getTitre())
                    .append(", price :")
                    .append(produitDTO.getPrix())
                    .append("\n");
        });

        ClientDTO clientDTO = modelMapper.map(clientRepository.findByClientId(achatRequest.getClientId()).get(),ClientDTO.class);
        System.out.println(String.valueOf(emailBody));
        System.out.println(clientDTO.getEmail());
        emailService.sendSimpleMessage(clientDTO.getEmail(),"New purchase", String.valueOf(emailBody));

    }
}
