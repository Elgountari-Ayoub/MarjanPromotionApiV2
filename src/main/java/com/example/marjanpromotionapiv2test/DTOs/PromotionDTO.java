package com.example.marjanpromotionapiv2test.DTOs;

import com.example.marjanpromotionapiv2test.Entities.CategorieEntity;
import jakarta.persistence.Column;
import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PromotionDTO {
    private Long id = null;
    private String promotionId = null ;
    private Double percentage;
    private String description;
    private Date dateDebut ;
    private Date dateFin ;
    private String categorieId ;
    private CategorieDTO categorieDTO;
}
