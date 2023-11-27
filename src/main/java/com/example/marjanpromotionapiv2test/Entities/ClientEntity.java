package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(nullable = false)
    private String clientId ;
    @Column(nullable = false)
    private String fullname;
    @Column(nullable = false,unique = true)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fidelite_id")
    private FideliteEntity fideliteEntity ;
}
