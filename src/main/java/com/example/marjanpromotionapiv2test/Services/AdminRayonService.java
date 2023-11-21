package com.example.marjanpromotionapiv2test.Services;

import com.example.marjanpromotionapiv2test.DTOs.AdminRayonDTO;
import com.example.marjanpromotionapiv2test.DTOs.CentreDTO;
import com.example.marjanpromotionapiv2test.DTOs.CentrePromotionDTO;
import com.example.marjanpromotionapiv2test.DTOs.PromotionDTO;
import com.example.marjanpromotionapiv2test.Entities.AdminRayonEntity;
import com.example.marjanpromotionapiv2test.Enums.PromoStatus;
import com.example.marjanpromotionapiv2test.Requests.CentrePromotionRequest;

public interface AdminRayonService {

    public CentrePromotionDTO accepterOuRefuserPromotion(CentrePromotionRequest centrePromotionRequest);
    public AdminRayonDTO create(AdminRayonDTO adminRayonDTO);

}
