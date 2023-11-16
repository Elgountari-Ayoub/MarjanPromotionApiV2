package com.example.marjanpromotionapiv2test.Entities;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;



@Entity
@Data
@Component
public class ProduitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(nullable = false)
    private String produitId ;
    @Column(nullable = false)
    private String titre ;
    @Column(nullable = false)
    private Float prix ;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    public CategorieEntity categorieEntity ;
}
