package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.AdminRayonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRayonRepository extends JpaRepository<AdminRayonEntity,Long> {
    Optional<AdminRayonEntity> findAllByAdminRayonId(String adminRayonId);
}
