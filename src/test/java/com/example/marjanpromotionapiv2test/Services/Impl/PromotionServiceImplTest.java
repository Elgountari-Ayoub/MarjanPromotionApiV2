package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.Entities.CategorieEntity;
import com.example.marjanpromotionapiv2test.Entities.PromotionEntity;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Respositories.PromotionRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.AbstractFileAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
import java.util.List;

//@SpringBootTest(classes = PromotionServiceImpl.class )
@SpringBootTest
class PromotionServiceImplTest {
    @MockBean
    private Generate generate ;
    @Autowired
    private  PromotionRepository promotionRepository ;

//    PromotionServiceImplTest(Generate generate, PromotionRepository promotionRepository) {
//        this.generate = generate;
//        this.promotionRepository = promotionRepository;
//    }

    @Test
    public void testCreate(){
        PromotionEntity promotionEntity = new PromotionEntity();
        CategorieEntity categorieEntity = new CategorieEntity();
        // create category
        categorieEntity.setCategorieId(generate.generateStringId());
        categorieEntity.setId(1L);
        categorieEntity.setNom("test ctaegory");
        //create promotion
        promotionEntity.setPromotionId("kljsdskdsk");
        promotionEntity.setId(100L);
        promotionEntity.setDescription("test test");
        promotionEntity.setDateDebut(Date.valueOf("2023-11-15"));
        promotionEntity.setDateFin(Date.valueOf("2023-11-30"));
        promotionEntity.setCategorieEntity(categorieEntity);
        promotionEntity.setPercentage(10D);

        PromotionEntity savedPromotionEntity = promotionRepository.save(promotionEntity);
        assertNotNull(promotionRepository.findById(savedPromotionEntity.getId()));
//        System.out.println("testest");
    }

    @Test
    public void readAll(){
        List<PromotionEntity> promotionEntityList = promotionRepository.findAll();
        assertThat(promotionEntityList).isNotEmpty();
    }


}