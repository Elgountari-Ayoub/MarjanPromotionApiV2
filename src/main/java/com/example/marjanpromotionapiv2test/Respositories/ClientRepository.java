package com.example.marjanpromotionapiv2test.Respositories;

import com.example.marjanpromotionapiv2test.Entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity,Long> {
    Optional<ClientEntity> findByClientId(String clientId);
}
