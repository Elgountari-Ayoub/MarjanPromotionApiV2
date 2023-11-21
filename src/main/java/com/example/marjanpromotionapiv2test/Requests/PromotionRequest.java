package com.example.marjanpromotionapiv2test.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromotionRequest {


    private Double percentage;

    private String description;

    private Date dateDebut ;

    private Date dateFin ;

    private String categorieId ;

}
