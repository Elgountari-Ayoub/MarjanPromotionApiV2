package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
//@Table(name = "")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AdminCentreEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String adminCentreId ;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String encryptPassword;

    @OneToMany
    private List<CentreEntity> centreEntityList ;

}