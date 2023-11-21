package com.example.marjanpromotionapiv2test.Errors;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorMessage {
    private Date timeStamp ;
    private String message ;

}
