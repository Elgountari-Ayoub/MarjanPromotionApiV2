package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.FideliteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FideliteRepository extends JpaRepository<FideliteEntity,Long> {
}
