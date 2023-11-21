package com.example.marjanpromotionapiv2test.Controllers;

import com.example.marjanpromotionapiv2test.DTOs.AdminCentreDTO;
import com.example.marjanpromotionapiv2test.Requests.AdminCentreRequest;
import com.example.marjanpromotionapiv2test.Responses.AdminCentreResponse;
import com.example.marjanpromotionapiv2test.Responses.AdminRayonResponse;
import com.example.marjanpromotionapiv2test.Services.AdminCentreService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/adminCenter")
public class AdminCentreController {

    private final AdminCentreService adminCentreService ;
    ModelMapper modelMapper = new ModelMapper();
    @Autowired
    public AdminCentreController(AdminCentreService adminCentreService) {
        this.adminCentreService = adminCentreService;
    }



    @PostMapping
    public ResponseEntity<AdminCentreResponse> Save(@RequestBody AdminCentreRequest adminCentreRequest ){

        AdminCentreDTO adminCentreDTO = adminCentreService.saveAdminCentre(modelMapper.map(adminCentreRequest,AdminCentreDTO.class));
        return ResponseEntity.status(HttpStatus.OK).body(modelMapper.map(adminCentreDTO,AdminCentreResponse.class));
    }




}
