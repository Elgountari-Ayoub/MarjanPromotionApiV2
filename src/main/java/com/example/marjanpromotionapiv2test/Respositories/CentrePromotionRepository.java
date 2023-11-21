package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.CentreEntity;
import com.example.marjanpromotionapiv2test.Entities.CentrePromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CentrePromotionRepository extends JpaRepository<CentrePromotionEntity,Long> {

}
