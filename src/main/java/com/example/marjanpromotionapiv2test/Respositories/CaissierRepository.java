package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.CaissierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CaissierRepository extends JpaRepository<CaissierEntity,Long> {
    Optional<CaissierEntity> findByCaissierId(String CaissierId);
    Optional<CaissierEntity> findById(Long id);
}
