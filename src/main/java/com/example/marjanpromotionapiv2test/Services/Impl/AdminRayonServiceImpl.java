package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.*;
import com.example.marjanpromotionapiv2test.Entities.AdminRayonEntity;
import com.example.marjanpromotionapiv2test.Entities.CentreEntity;
import com.example.marjanpromotionapiv2test.Entities.CentrePromotionEntity;
import com.example.marjanpromotionapiv2test.Entities.PromotionEntity;
import com.example.marjanpromotionapiv2test.Requests.CentrePromotionRequest;
import com.example.marjanpromotionapiv2test.Respositories.AdminRayonRepository;
import com.example.marjanpromotionapiv2test.Respositories.CentrePromotionRepository;
import com.example.marjanpromotionapiv2test.Respositories.CentreRepository;
import com.example.marjanpromotionapiv2test.Respositories.PromotionRepository;
import com.example.marjanpromotionapiv2test.Services.AdminRayonService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AdminRayonServiceImpl implements AdminRayonService {

    private final AdminRayonRepository adminRayonRepository ;
    private final CentrePromotionRepository centrePromotionRepository ;
    private final PromotionRepository promotionRepository;
    private final CentreRepository centreRepository ;
    private final CentrePromotionDTO centrePromotionDTO;
//    CentrePromotionEntity centrePromotionEntity ;

    ModelMapper modelMapper = new ModelMapper();

    public AdminRayonServiceImpl(AdminRayonRepository adminRayonRepository, CentrePromotionRepository centrePromotionRepository, PromotionRepository promotionRepository, CentreRepository centreRepository, CentrePromotionDTO centrePromotionDTO, CentrePromotionEntity centrePromotionEntity) {
        this.adminRayonRepository = adminRayonRepository;
        this.centrePromotionRepository = centrePromotionRepository;
        this.promotionRepository = promotionRepository;
        this.centreRepository = centreRepository;
        this.centrePromotionDTO = centrePromotionDTO;
//        this.centrePromotionEntity = centrePromotionEntity ;
    }

    @Override
    public CentrePromotionDTO accepterOuRefuserPromotion(CentrePromotionRequest centrePromotionRequest) {
        CentrePromotionEntity centrePromotionEntity = new CentrePromotionEntity();
        PromotionEntity promotionEntity = promotionRepository.findByPromotionId(centrePromotionRequest.getPromotionId()).get();
        AdminRayonEntity adminRayonEntity  = adminRayonRepository.findAllByAdminRayonId(centrePromotionRequest.getAdminRayonId()).get();
        CentreEntity centreEntity = centreRepository.findByCentreId(centrePromotionRequest.getCentreId()).get();
        centrePromotionEntity.setPromotionEntity(promotionEntity);
        centrePromotionEntity.setAdminRayonEntity(adminRayonEntity);
        centrePromotionEntity.setCentreEntity(centreEntity);
        centrePromotionEntity.setPromoStatus(centrePromotionRequest.getPromoStatus());
        CentrePromotionEntity savedCentrePromotionEntity = centrePromotionRepository.save(centrePromotionEntity);

        CentreDTO centreDTO = modelMapper.map(savedCentrePromotionEntity.getCentreEntity(),CentreDTO.class);
        AdminRayonDTO adminRayonDTO = modelMapper.map(savedCentrePromotionEntity.getAdminRayonEntity(),AdminRayonDTO.class);
        PromotionDTO promotionDTO = modelMapper.map(savedCentrePromotionEntity.getPromotionEntity(),PromotionDTO.class);
        centrePromotionDTO.setAdminRayonDTO(adminRayonDTO);
        centrePromotionDTO.setPromotionDTO(promotionDTO);
        centrePromotionDTO.setCentreDTO(centreDTO);
        return centrePromotionDTO;
    }

    @Override
    public AdminRayonDTO create(AdminRayonDTO adminRayonDTO) {
        return null;
    }
}
