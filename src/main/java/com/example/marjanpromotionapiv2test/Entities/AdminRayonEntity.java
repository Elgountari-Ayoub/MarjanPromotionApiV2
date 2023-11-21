package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminRayonEntity {
    @Id
    @GeneratedValue
    private Long id ;
    @Column(nullable = false)
    private String adminRayonId ;
    @Column(nullable = false)
    private String email ;
    @Column(nullable = false)
    private String encryptPassword ;
//    @ManyToOne
//    private AdminCentreEntity adminCentreEntity;
    @ManyToOne
    @JoinColumn(name = "centre_id")
    private CentreEntity centreEntity ;
}
