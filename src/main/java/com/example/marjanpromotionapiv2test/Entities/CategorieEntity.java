package com.example.marjanpromotionapiv2test.Entities;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategorieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String categorieId;
    @Column(nullable = false)
    private String nom ;

    @OneToMany
    private List<ProduitEntity> produitEntityList;

    @OneToMany
    private List<PromotionEntity> promotionEntitieList ;
}
