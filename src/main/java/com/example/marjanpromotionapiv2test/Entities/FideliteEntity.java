package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FideliteEntity {
    @Id
    @GeneratedValue
    private Long id ;
    @Column(nullable = false)
    private String FideliteId ;
    @Column(nullable = false)
    private String fullName ;
    @OneToOne
    private UserEntity userEntity;
}
