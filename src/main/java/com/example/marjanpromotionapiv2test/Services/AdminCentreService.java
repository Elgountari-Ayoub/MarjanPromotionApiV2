package com.example.marjanpromotionapiv2test.Services;

import com.example.marjanpromotionapiv2test.DTOs.AdminCentreDTO;

import java.util.List;
import java.util.Optional;

public interface AdminCentreService {
    public AdminCentreDTO saveAdminCentre(AdminCentreDTO adminCentreDTO);
    public Optional<AdminCentreDTO> getAdminCentre(Long id);
    public List<AdminCentreDTO> getAll();

    public AdminCentreDTO login(AdminCentreDTO adminCentreDTO);
}
