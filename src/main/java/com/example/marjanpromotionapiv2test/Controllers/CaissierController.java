package com.example.marjanpromotionapiv2test.Controllers;

import com.example.marjanpromotionapiv2test.DTOs.CaissierDTO;
import com.example.marjanpromotionapiv2test.Errors.ErrorMessageCaissier;
import com.example.marjanpromotionapiv2test.Exceptions.CaissierException;
import com.example.marjanpromotionapiv2test.Helpers.Generate;
import com.example.marjanpromotionapiv2test.Requests.CaissierRequest;
import com.example.marjanpromotionapiv2test.Responses.CaissierResponse;
import com.example.marjanpromotionapiv2test.Services.CaissierService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/caissier")
public class CaissierController {

    private final CaissierService caissierService ;

    private final ModelMapper modelMapper ;
    @Autowired
    public CaissierController(CaissierService caissierService, ModelMapper modelMapper) {
        this.caissierService = caissierService;

        this.modelMapper = modelMapper;
    }


    @PostMapping
    public ResponseEntity<CaissierResponse> create(@RequestBody CaissierRequest caissierRequest) throws Exception{
        if (caissierRequest.getEmail().isEmpty() || caissierRequest.getPassword().isEmpty()){
            throw new CaissierException(ErrorMessageCaissier.MISSING_REQUIRED_FIELD.getErrorMessageCaissier());
        }
        CaissierDTO caissierDTO = caissierService.create(modelMapper.map(caissierRequest , CaissierDTO.class));
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(caissierDTO, CaissierResponse.class));
   }

   @PutMapping("/{CaissierId}")
    public ResponseEntity<CaissierResponse> update(@RequestBody CaissierRequest caissierRequest ,@PathVariable String CaissierId){
        CaissierDTO caissierDTO = caissierService.update(CaissierId,modelMapper.map(caissierRequest,CaissierDTO.class));
       return ResponseEntity.status(HttpStatus.ACCEPTED).body(modelMapper.map(caissierDTO, CaissierResponse.class));
   }

}
