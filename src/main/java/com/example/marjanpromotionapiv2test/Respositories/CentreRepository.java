package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.CentreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CentreRepository extends JpaRepository<CentreEntity,Long> {
    Optional<CentreEntity> findByCentreId(String centreId);
}
