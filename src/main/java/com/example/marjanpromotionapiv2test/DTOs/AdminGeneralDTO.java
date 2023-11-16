package com.example.marjanpromotionapiv2test.DTOs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminGeneralDTO {
    private Long id ;
    private String AdminGeneralId ;
    private String email ;
    private String password ;
    private String encryptPassword ;
}
