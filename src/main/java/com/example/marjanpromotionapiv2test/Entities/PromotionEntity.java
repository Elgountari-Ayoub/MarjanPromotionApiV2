package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String promotionId ;
    @Column(nullable = false)
    private Double percentage;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Date dateDebut ;
    @Column(nullable = false)
    private Date dateFin ;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategorieEntity categorieEntity;
}
