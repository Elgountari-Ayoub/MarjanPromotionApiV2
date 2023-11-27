package com.example.marjanpromotionapiv2test.DTOs;

import com.example.marjanpromotionapiv2test.Entities.FideliteEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDTO {
    private int id ;
    private String clientId ;
    private String fullname;
    private String email;
    private FideliteEntity fideliteEntity ;

}
