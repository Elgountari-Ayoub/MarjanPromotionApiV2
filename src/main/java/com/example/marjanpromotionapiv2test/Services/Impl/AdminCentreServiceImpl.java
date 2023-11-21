package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.AdminCentreDTO;
import com.example.marjanpromotionapiv2test.Entities.AdminCentreEntity;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Respositories.AdminCentreRepository;
import com.example.marjanpromotionapiv2test.Services.AdminCentreService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminCentreServiceImpl implements AdminCentreService {

    private final AdminCentreRepository adminCentreRepository ;
    private final Generate generate ;

    ModelMapper modelMapper = new ModelMapper();
    @Autowired
    public AdminCentreServiceImpl(AdminCentreRepository adminCentreRepository,Generate generate) {
        this.adminCentreRepository = adminCentreRepository;
        this.generate = generate ;
    }


    @Override
    public AdminCentreDTO saveAdminCentre(AdminCentreDTO adminCentreDTO) {
        adminCentreDTO.setEncryptPassword(adminCentreDTO.getPassword());
        adminCentreDTO.setAdminCentreId(generate.generateStringId());
        AdminCentreEntity adminCentreEntity = adminCentreRepository.save(modelMapper.map(adminCentreDTO, AdminCentreEntity.class));
        return modelMapper.map(adminCentreEntity,AdminCentreDTO.class);
    }

    @Override
    public Optional<AdminCentreDTO> getAdminCentre(Long id) {
        return null;
    }

    @Override
    public List<AdminCentreDTO> getAll() {
        return null;
    }

    @Override
    public AdminCentreDTO login(AdminCentreDTO adminCentreDTO) {
        return null;
    }
}
