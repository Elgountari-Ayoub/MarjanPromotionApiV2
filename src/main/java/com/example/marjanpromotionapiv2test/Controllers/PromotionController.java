package com.example.marjanpromotionapiv2test.Controllers;

import com.example.marjanpromotionapiv2test.DTOs.PromotionDTO;
import com.example.marjanpromotionapiv2test.Errors.ErrorMessagePromotion;
import com.example.marjanpromotionapiv2test.Exceptions.PromotionException;
import com.example.marjanpromotionapiv2test.Requests.PromotionRequest;
import com.example.marjanpromotionapiv2test.Responses.CategorieResponse;
import com.example.marjanpromotionapiv2test.Responses.PromotionResponse;
import com.example.marjanpromotionapiv2test.Services.PromotionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
        @RequestMapping("/api/v1/promotions")
public class PromotionController {

    private final PromotionService promotionService;
    private final ModelMapper modelMapper ;
    @Autowired
    public PromotionController(PromotionService promotionService , ModelMapper modelMapper) {
        this.promotionService = promotionService;
        this.modelMapper = modelMapper ;


        modelMapper.addMappings(new PropertyMap<PromotionRequest, PromotionDTO>() {
            @Override
            protected void configure() {
                skip().setPromotionId(null);
                skip().setId(null);
            }
        });
    }






    @PostMapping("/create")
    public ResponseEntity<PromotionResponse> create(@RequestBody PromotionRequest promotionRequest) throws Exception{
      if (promotionRequest.getDescription().isEmpty() || promotionRequest.getPercentage() == null || promotionRequest.getDateFin() == null || promotionRequest.getDateDebut() == null || promotionRequest.getCategorieId() == null ) throw  new PromotionException(ErrorMessagePromotion.MISSING_REQUIRED_FIELD.getErrorMessagePromotion());
      if (promotionRequest.getPercentage()>50) throw new PromotionException(ErrorMessagePromotion.OVER_THAN_50.getErrorMessagePromotion());
      PromotionResponse promotionResponse = modelMapper.map(promotionService.createPromotion(modelMapper.map(promotionRequest, PromotionDTO.class)),PromotionResponse.class);
      return ResponseEntity.status(HttpStatus.CREATED).body(promotionResponse);
    }
    @GetMapping
    public ResponseEntity<List<PromotionResponse>> all(){
        List<PromotionResponse> promotionResponseList = promotionService.promotionList().stream().map(promotionDTO ->{
            PromotionResponse promotionResponse = modelMapper.map(promotionDTO,PromotionResponse.class);
            promotionResponse.setCategorieResponse(modelMapper.map(promotionDTO.getCategorieDTO(), CategorieResponse.class));
            return promotionResponse;
        }).toList();
        return ResponseEntity.ok().body(promotionResponseList);
    }
}
