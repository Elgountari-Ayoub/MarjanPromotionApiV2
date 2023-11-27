package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.CaissierDTO;
import com.example.marjanpromotionapiv2test.Entities.CaissierEntity;
import com.example.marjanpromotionapiv2test.Exceptions.PromotionException;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Respositories.CaissierRepository;
import com.example.marjanpromotionapiv2test.Services.CaissierService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CaissierServiceImpl implements CaissierService {

    private final CaissierRepository caissierRepository ;
    private final Generate generate ;
    private final ModelMapper modelMapper ;

    public CaissierServiceImpl(CaissierRepository caissierRepository,  Generate generate  ,ModelMapper modelMapper) {
        this.caissierRepository = caissierRepository;
        this.generate = generate;
        this.modelMapper = modelMapper;
    }

    @Override
    public CaissierDTO create(CaissierDTO caissierDTO) {
        caissierDTO.setCaissierId(generate.generateStringId());
        caissierDTO.setEncryptPassword(caissierDTO.getPassword());
        CaissierEntity caissierEntity = caissierRepository.save(modelMapper.map(caissierDTO, CaissierEntity.class));
        return modelMapper.map(caissierEntity,CaissierDTO.class);
    }

    @Override
    public CaissierDTO update(String Caissierid, CaissierDTO caissierDTO)  {
        Optional<CaissierEntity> caissier = caissierRepository.findByCaissierId(Caissierid);
        if (caissier.isPresent()){
            CaissierEntity caissierEntity = caissierRepository.save(caissier.get());
            return modelMapper.map(caissierEntity,CaissierDTO.class);
        }else {
            System.out.println("Id not exist");
            return null;
        }


    }

    @Override
    public CaissierDTO findByCaissierId(String CaissierId) {
        return null;
    }

    @Override
    public List<CaissierDTO> findAll() {
        return null;
    }

    @Override
    public void delete(String CaissierId) {

    }
}
