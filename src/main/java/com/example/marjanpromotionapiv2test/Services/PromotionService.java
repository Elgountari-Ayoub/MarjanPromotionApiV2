package com.example.marjanpromotionapiv2test.Services;

import com.example.marjanpromotionapiv2test.DTOs.PromotionDTO;

import java.util.List;

public interface PromotionService {
    public PromotionDTO createPromotion(PromotionDTO promotionDTO);

    public List<PromotionDTO> promotionList();
}
