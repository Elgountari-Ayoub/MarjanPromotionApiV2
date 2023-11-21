package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    @Column(nullable = false,unique = true)
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
