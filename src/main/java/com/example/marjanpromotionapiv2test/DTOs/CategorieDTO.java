package com.example.marjanpromotionapiv2test.DTOs;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategorieDTO {

    private Long id;

    private String categorieId;

    private String nom ;
    private List<ProduitDTO> produitDTOList ;
}
