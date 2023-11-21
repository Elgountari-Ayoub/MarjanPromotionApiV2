package com.example.marjanpromotionapiv2test.Responses;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorieResponse {
    private String categorieId;
    private String nom ;
}
