package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProduitRepository extends JpaRepository<ProduitEntity,Long> {
    Optional<ProduitEntity> findByProduitId(String produitId);
}
