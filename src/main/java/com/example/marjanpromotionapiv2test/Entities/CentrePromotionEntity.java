package com.example.marjanpromotionapiv2test.Entities;

import com.example.marjanpromotionapiv2test.Enums.PromoStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
//@Table(name = "admin_rayon", uniqueConstraints = {@UniqueConstraint(columnNames = "admin_rayon_id", name = "uk_4d3dago4trq35k1tent5no9or")})
public class CentrePromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "adminRayon_id")
    private AdminRayonEntity adminRayonEntity ;
    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private PromotionEntity promotionEntity ;
    @ManyToOne
    @JoinColumn(name = "centre_id")
    private  CentreEntity centreEntity ;
    @Enumerated(EnumType.STRING)
    private PromoStatus promoStatus ;
}
