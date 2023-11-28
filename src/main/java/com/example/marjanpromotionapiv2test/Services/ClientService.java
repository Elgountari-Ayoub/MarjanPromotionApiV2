package com.example.marjanpromotionapiv2test.Services;

import com.example.marjanpromotionapiv2test.DTOs.CaissierDTO;
import com.example.marjanpromotionapiv2test.DTOs.ClientDTO;
import com.example.marjanpromotionapiv2test.Requests.AchatRequest;

import java.util.List;

public interface ClientService {
    public ClientDTO create(ClientDTO clientDTO);

    public ClientDTO update(String clientId , ClientDTO clientDTO);

    public ClientDTO findByClientId(String clientId);

    public List<ClientDTO> findAll();

    public void delete(String clientId);

    void achat(AchatRequest achatRequest);
}
