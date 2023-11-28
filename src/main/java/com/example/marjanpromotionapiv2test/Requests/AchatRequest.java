package com.example.marjanpromotionapiv2test.Requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AchatRequest {
    private String clientId ;
    private List<String> productList;
}
