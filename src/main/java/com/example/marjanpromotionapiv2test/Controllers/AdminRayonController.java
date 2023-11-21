package com.example.marjanpromotionapiv2test.Controllers;

import com.example.marjanpromotionapiv2test.DTOs.CentrePromotionDTO;
import com.example.marjanpromotionapiv2test.Requests.CentrePromotionRequest;
import com.example.marjanpromotionapiv2test.Responses.AdminRayonResponse;
import com.example.marjanpromotionapiv2test.Responses.CentrePromotionResponse;
import com.example.marjanpromotionapiv2test.Responses.CentreResponse;
import com.example.marjanpromotionapiv2test.Responses.PromotionResponse;
import com.example.marjanpromotionapiv2test.Services.AdminRayonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/api/v1/adminRayon")
public class AdminRayonController {

    private final AdminRayonService adminRayonService ;
    private final  CentrePromotionResponse centrePromotionResponse ;
    ModelMapper modelMapper = new ModelMapper();
    @Autowired
    public AdminRayonController(AdminRayonService adminRayonService, CentrePromotionResponse centrePromotionResponse) {
        this.adminRayonService = adminRayonService;
        this.centrePromotionResponse = centrePromotionResponse;
    }


    @PostMapping("/promotion")
    public ResponseEntity<?> accepterOuRefuserPromotion(@RequestBody CentrePromotionRequest centrePromotionRequest){
        CentrePromotionDTO centrePromotionDTO = adminRayonService.accepterOuRefuserPromotion(centrePromotionRequest);

        AdminRayonResponse adminRayonResponse = modelMapper.map(centrePromotionDTO.getAdminRayonDTO(),AdminRayonResponse.class);
        CentreResponse centreResponse = modelMapper.map(centrePromotionDTO.getPromotionDTO(),CentreResponse.class);
        PromotionResponse promotionResponse = modelMapper.map(centrePromotionDTO.getPromotionDTO(),PromotionResponse.class);
        centrePromotionResponse.setAdminRayonResponse(adminRayonResponse);
        centrePromotionResponse.setPromotionResponse(promotionResponse);
        centrePromotionResponse.setCentreResponse(centreResponse);
        centrePromotionResponse.setPromoStatus(centrePromotionDTO.getPromoStatus());
        return ResponseEntity.ok().body("created");
    }
}
