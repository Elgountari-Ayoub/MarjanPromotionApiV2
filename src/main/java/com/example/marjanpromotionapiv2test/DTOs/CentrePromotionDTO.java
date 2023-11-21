package com.example.marjanpromotionapiv2test.DTOs;

import com.example.marjanpromotionapiv2test.Enums.PromoStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CentrePromotionDTO {
    private Long id ;
    private PromotionDTO promotionDTO ;
    private AdminRayonDTO adminRayonDTO ;
    private CentreDTO centreDTO ;
    private PromoStatus promoStatus ;
}
