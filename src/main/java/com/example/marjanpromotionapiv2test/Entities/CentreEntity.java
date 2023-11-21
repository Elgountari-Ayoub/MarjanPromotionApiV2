package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CentreEntity {
    @Id
    @GeneratedValue
    private Long id ;
    @Column(nullable = false)
    private String centreId ;
    @Column(nullable = false)
    private String label ;
    @Column(nullable = false)
    private String ville ;
    @ManyToOne
    @JoinColumn(name = "adminCentre_id")
    private AdminCentreEntity adminCentreEntity;

    @OneToMany
    private List<AdminRayonEntity> adminRayonEntityList ;
}
