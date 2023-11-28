package com.example.marjanpromotionapiv2test.DTOs;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduitDTO {
    private Long id;
    private String produitId ;
    private String titre ;
    private Float prix ;
    private CategorieDTO categorieDTO ;
}
