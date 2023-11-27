package com.example.marjanpromotionapiv2test.Controllers;

import com.example.marjanpromotionapiv2test.DTOs.ClientDTO;
import com.example.marjanpromotionapiv2test.Requests.ClientRequest;
import com.example.marjanpromotionapiv2test.Responses.ClientResponse;
import com.example.marjanpromotionapiv2test.Services.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    private final ClientService clientService ;
    private final ModelMapper modelMapper ;
    @Autowired
    public ClientController(ClientService clientService, ModelMapper modelMapper) {
        this.clientService = clientService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest) {
        ClientDTO clientDTO = clientService.create(modelMapper.map(clientRequest,ClientDTO.class));
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(clientDTO, ClientResponse.class));
    }

    @PutMapping("{clientId}")
    public ClientDTO update(@RequestBody ClientRequest clientRequest, @PathVariable String clientId) {
        return null;
    }

    @GetMapping("{clientId}")
    public ClientDTO findByClientId(@PathVariable String clientId) {
        return null;
    }

    @GetMapping
    public List<ClientDTO> findAll() {
        return null;
    }

    @DeleteMapping("{clientId}")
    public void delete(@PathVariable String clientId) {

    }
}
