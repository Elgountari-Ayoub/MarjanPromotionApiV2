package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
