package com.example.marjanpromotionapiv2test.Requests;

import com.example.marjanpromotionapiv2test.Enums.PromoStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CentrePromotionRequest {

    private String adminRayonId;
    private String centreId;
    private String promotionId;
    private PromoStatus promoStatus ;
}
