package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity,Long> {
    Optional<PromotionEntity> findByPromotionId(String promotionId);
    Optional<PromotionEntity> findById(Long id);

}
