package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.CategorieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategorieRepository extends JpaRepository<CategorieEntity,Long> {

    public Optional<CategorieEntity> findAllByCategorieId(String CategorieId);
    public Optional<CategorieEntity> findAllById(Long Id);
}
