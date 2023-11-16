package com.example.marjanpromotionapiv2test.DTOs;
import com.example.marjanpromotionapiv2test.Entities.CentreEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminCentreDTO {
    private Long id ;
    private String AdminCentreId ;
    private String email ;
    private String password ;
    private String encryptPassword ;
    private List<CentreDTO> centreDTOList ;
}
