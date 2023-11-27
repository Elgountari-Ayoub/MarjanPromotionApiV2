package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaissierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(nullable = false)
    private String caissierId ;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String encryptPassword;
    
}
