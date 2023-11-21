package com.example.marjanpromotionapiv2test.DTOs;

import com.example.marjanpromotionapiv2test.Entities.AdminCentreEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class CentreDTO {
    private Long id ;

    private String centreId ;

    private String label ;

    private String ville ;
    private AdminCentreDTO adminCentreDTO;
}
