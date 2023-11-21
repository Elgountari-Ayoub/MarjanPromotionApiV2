package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.AdminCentreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminCentreRepository extends JpaRepository<AdminCentreEntity,Long> {
    public AdminCentreEntity findAdminCentreEntitiesByEmail(String email);
}
