package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id ;
    @Column(nullable = false)
    private String userId ;
    @Column(nullable = false)
    private String fullName ;
    @Column(nullable = false , unique = true)
    private String email ;
    @Column(nullable = false)
    private String encryptPassword;
}
