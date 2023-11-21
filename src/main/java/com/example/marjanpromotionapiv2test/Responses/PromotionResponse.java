package com.example.marjanpromotionapiv2test.Responses;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromotionResponse {
    private String promotionId ;
    private Double percentage;
    private String description;
    private Date dateDebut;
    private Date dateFin ;
    private CategorieResponse categorieResponse ;
}
