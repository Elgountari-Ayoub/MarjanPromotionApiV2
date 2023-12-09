package com.example.marjanpromotionapiv2test.Controllers;

import com.example.marjanpromotionapiv2test.Entities.CategorieEntity;
import com.example.marjanpromotionapiv2test.Respositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/categories")
public class CategorieController {

private final CategorieRepository categorieRepository ;

    @Autowired
    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }


    @GetMapping
    public ResponseEntity<List<CategorieEntity>> all(){
    List<CategorieEntity> categorieList = categorieRepository.findAll();
    return ResponseEntity.ok().body(categorieList);
}


}
