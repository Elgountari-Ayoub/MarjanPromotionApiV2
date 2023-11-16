package com.example.marjanpromotionapiv2test.DTOs;

import jakarta.persistence.Column;

public class ProduitDTO {
    private Long id;
    private String produitId ;
    private String titre ;
    private Float prix ;
    private CategorieDTO categorieDTO ;
}
