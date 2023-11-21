package com.example.marjanpromotionapiv2test.Services;

import com.example.marjanpromotionapiv2test.DTOs.AdminGeneralDTO;

import java.util.Optional;

public interface AdminGeneralService {

    public Optional<AdminGeneralDTO> login(AdminGeneralDTO adminGeneralDTO);
}
