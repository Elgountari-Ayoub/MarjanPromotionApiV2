package com.example.marjanpromotionapiv2test.Responses;

import com.example.marjanpromotionapiv2test.DTOs.AdminRayonDTO;
import com.example.marjanpromotionapiv2test.DTOs.PromotionDTO;
import com.example.marjanpromotionapiv2test.Enums.PromoStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CentrePromotionResponse {
    PromotionResponse promotionResponse ;
    AdminRayonResponse adminRayonResponse ;
    CentreResponse centreResponse ;
    PromoStatus promoStatus ;
}
