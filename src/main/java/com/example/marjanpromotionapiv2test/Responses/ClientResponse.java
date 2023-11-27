package com.example.marjanpromotionapiv2test.Responses;

import com.example.marjanpromotionapiv2test.Entities.FideliteEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {
    private String clientId  ;
    private String fullname;
    private String email;
    private FideliteEntity fideliteEntity ;
}
