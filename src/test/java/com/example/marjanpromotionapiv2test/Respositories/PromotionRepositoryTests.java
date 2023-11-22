package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.CategorieEntity;
import com.example.marjanpromotionapiv2test.Entities.PromotionEntity;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Date;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class PromotionRepositoryTests {

    @MockBean
    Generate generate ;

    @MockBean
    CategorieEntity categorieEntity;
    private PromotionRepository promotionRepository ;
    @Autowired
    public PromotionRepositoryTests(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    @BeforeEach



    @Test
    public void PromotionRespository_saveAll_ReturnsSavedPromotion(){
        PromotionEntity promotionEntity = PromotionEntity
                .builder()
                .promotionId(generate.generateStringId())
                .dateFin(Date.valueOf("2023-11-26"))
                .dateDebut(Date.valueOf("2023-11-21"))
                .description("lorem mlsdfk slkds sdflkfsd lksd")
                .percentage(20D)
                .categorieEntity(categorieEntity)
                .build();
    }


}