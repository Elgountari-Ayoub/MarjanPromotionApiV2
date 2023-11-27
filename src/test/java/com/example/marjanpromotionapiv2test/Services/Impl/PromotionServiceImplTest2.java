package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.CategorieDTO;
import com.example.marjanpromotionapiv2test.DTOs.PromotionDTO;
import com.example.marjanpromotionapiv2test.Entities.CategorieEntity;
import com.example.marjanpromotionapiv2test.Entities.PromotionEntity;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Respositories.CategorieRepository;
import com.example.marjanpromotionapiv2test.Respositories.PromotionRepository;
import com.example.marjanpromotionapiv2test.Services.PromotionService;
import jakarta.inject.Inject;
import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class PromotionServiceImplTest2 {

    @Mock
    Generate generate ;

    @Mock
    private ModelMapper modelMapper;
    @Mock
    private CategorieRepository categorieRepository;
    @Mock
    private PromotionRepository promotionRepository ;

    @InjectMocks
    private PromotionServiceImpl promotionService;

    private PromotionEntity promotionEntity ;

    private PromotionDTO promotionDTO ;

    private CategorieEntity categorieEntity ;

    private CategorieDTO categorieDTO ;

    @BeforeEach
    public void init(){
        categorieDTO = CategorieDTO.builder()
                .categorieId("testtestte")
                .id(1L)
                .nom("CategoryDtoTest")
                .build();



        categorieEntity = CategorieEntity.builder()
                .categorieId("lskjlsdbsdkh")
                .nom("CategoryEntity")
                .id(1L)
                .build();

        promotionEntity = PromotionEntity.builder()
                .promotionId("testtestte")
                .categorieEntity(categorieEntity)
                .percentage(10D)
                .description("lorem epsom ")
                .dateFin(Date.valueOf("2023-11-23"))
                .dateDebut(Date.valueOf("2023-11-30"))
                .id(1L)
                .build();
        promotionDTO = PromotionDTO.builder()
                .categorieDTO(categorieDTO)
                .promotionId("test ets tes te t")
                .dateFin(Date.valueOf("2023-11-23"))
                .dateDebut(Date.valueOf("2023-11-30"))
                .percentage(10D)
                .id(1L)
                .description("lorem epsom ")
                .categorieId("1")
                .build();
    }

    @Test
    public void promotionTest_createPromotion_ReturnPromotionDto(){
        when(promotionRepository.findById(any())).thenReturn(Optional.of(promotionEntity));

        when(categorieRepository.findAllById(anyLong())).thenReturn(Optional.of(categorieEntity));
        //In Mockito, the eq method is used to create a matcher for a specific value.
        // It stands for "equals" and is used to match arguments during stubbing or verification.
        when(modelMapper.map(any(), eq(CategorieDTO.class))).thenReturn(new CategorieDTO());
        // fake category
        when(categorieRepository.save(any(CategorieEntity.class))).thenReturn(categorieEntity);

        when(promotionRepository.save(any())).thenReturn(promotionEntity);

        when(generate.generateStringId()).thenReturn("someId");

        PromotionDTO promotion = promotionService.createPromotion(promotionDTO);


        assertNotNull(promotionRepository.findById(promotion.getId()));



    }





}