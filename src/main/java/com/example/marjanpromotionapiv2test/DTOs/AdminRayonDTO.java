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
public class AdminRayonDTO {
    private Long id ;
    private String AdminRayonId ;
    private String email ;
    private String password ;
    private String encryptPassword ;
}
