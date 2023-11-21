package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.AdminGeneralDTO;
import com.example.marjanpromotionapiv2test.Services.AdminGeneralService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminGeneralServiceImpl implements AdminGeneralService {
    @Override
    public Optional<AdminGeneralDTO> login(AdminGeneralDTO adminGeneralDTO) {
        return Optional.empty();
    }
}
