package com.example.marjanpromotionapiv2test.Controllers;

import com.example.marjanpromotionapiv2test.Requests.AdminGeneralRequest;
import com.example.marjanpromotionapiv2test.Services.AdminGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/adminGeneral")
public class AdminGeneralController {


    private final AdminGeneralService adminGeneralService;

    @Autowired
    public AdminGeneralController(AdminGeneralService adminGeneralService) {
        this.adminGeneralService = adminGeneralService;
    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AdminGeneralRequest adminGeneralRequest) {
//        Optional<AdminGeneral> existingAdmin = adminGeneralService.&(AdminGeneral.getEmail());
//        if (existingAdmin.isPresent() && AdminGeneral.getPassword().equals(existingAdmin.get().getPassword())){
//            return ResponseEntity.ok("Login successful");
//        }else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
        return ResponseEntity.ok().body("jdjd");
    }
}
