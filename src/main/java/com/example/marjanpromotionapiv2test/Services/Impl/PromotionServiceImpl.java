package com.example.marjanpromotionapiv2test.Services.Impl;

import com.example.marjanpromotionapiv2test.DTOs.CategorieDTO;
import com.example.marjanpromotionapiv2test.DTOs.PromotionDTO;
import com.example.marjanpromotionapiv2test.Entities.CategorieEntity;
import com.example.marjanpromotionapiv2test.Entities.PromotionEntity;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Responses.PromotionResponse;
import com.example.marjanpromotionapiv2test.Respositories.CategorieRepository;
import com.example.marjanpromotionapiv2test.Respositories.PromotionRepository;
import com.example.marjanpromotionapiv2test.Services.PromotionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PromotionServiceImpl implements PromotionService {

    private final PromotionRepository promotionRepository ;
    private final CategorieRepository categorieRepository ;
    private final Generate generate ;
    ModelMapper modelMapper = new ModelMapper();
    @Autowired
    public PromotionServiceImpl(PromotionRepository promotionRepository
                                ,CategorieRepository categorieRepository,
                                Generate generate ) {
        this.promotionRepository = promotionRepository;
        this.categorieRepository = categorieRepository;
        this.generate = generate ;
    }

    @Override
    public PromotionDTO createPromotion(PromotionDTO promotionDTO) {

        CategorieDTO categorieDTO = modelMapper.map(categorieRepository.findAllById(Long.parseLong(promotionDTO.getCategorieId())).get(),CategorieDTO.class);
        promotionDTO.setCategorieDTO(categorieDTO);
        PromotionEntity promotionEntity = modelMapper.map(promotionDTO, PromotionEntity.class);


        promotionEntity.setCategorieEntity(modelMapper.map(promotionDTO.getCategorieDTO(), CategorieEntity.class));
        promotionEntity.setPromotionId(generate.generateStringId());
        PromotionEntity promotionEntityCreated = promotionRepository.save(promotionEntity);

        PromotionDTO promotionDTOAfterSave = modelMapper.map(promotionEntityCreated,PromotionDTO.class);
        promotionDTOAfterSave.setCategorieDTO(modelMapper.map(promotionEntityCreated.getCategorieEntity(),CategorieDTO.class));
        return promotionDTOAfterSave ;
    }

    @Override
    public List<PromotionDTO> promotionList() {
        List<PromotionEntity> promotionEntityList = promotionRepository.findAll();
        List<PromotionDTO> promotionDTOList = promotionEntityList.stream().map(promotionEntity -> {
            PromotionDTO promotionDTO = modelMapper.map(promotionEntity,PromotionDTO.class);
            promotionDTO.setCategorieDTO(modelMapper.map(promotionEntity.getCategorieEntity(),CategorieDTO.class));
            return promotionDTO ;
        }).collect(Collectors.toList());
        return promotionDTOList ;
    }
}
