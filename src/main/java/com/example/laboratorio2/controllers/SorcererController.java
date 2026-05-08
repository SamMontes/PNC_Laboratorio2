package com.example.laboratorio2.controllers;

import com.example.laboratorio2.model.Sorcerer;
import com.example.laboratorio2.services.SorcererServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/sorcerer")
@AllArgsConstructor
public class SorcererController {
    private final SorcererServiceImpl sorcererService;

    //Registrar hechicero
    @PostMapping
    public ResponseEntity<Sorcerer> createSorcerer(@RequestBody Sorcerer sorcerer){
        sorcererService.createSorcerer(sorcerer);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(sorcerer);
    }

    //Obtener todos los hechiceros
    @GetMapping
    public ResponseEntity<List<Sorcerer>> getSorcerers(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(sorcererService.getSorcerers());
    }

    //Obtener hechicero
    @GetMapping("/{id}")
    public ResponseEntity<Sorcerer> getSorcerer(@PathVariable UUID id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(sorcererService.getSorcerer(id));
    }

    //Actualizar hechicero
    @PutMapping("/{id}")
    public ResponseEntity<Sorcerer> updateSorcerer(@PathVariable UUID id, @RequestBody Sorcerer sorcerer){
        sorcererService.updateSorcerer(id, sorcerer);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(sorcerer);
    }

    //Eliminar hechicero
    @DeleteMapping("/{id}")
    public ResponseEntity<Sorcerer> deleteSorcerer(@PathVariable UUID id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(sorcererService.deleteSorcerer(id));
    }

    //Obtener hechiceros por escuela
    @GetMapping("/school/{escuela}")
    public ResponseEntity<List<Sorcerer>> getSorcerersBySchool(@PathVariable String escuela){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(sorcererService.getSorcerersBySchool(escuela));
    }

    //Obtener hechiceros por grado
    @GetMapping("/grade/{grado}")
    public ResponseEntity<List<Sorcerer>> getSorcerersByGrade(@PathVariable String grado){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(sorcererService.getSorcerersByGrade(grado));
    }

    //Obtener hechcieros activos
    @GetMapping("/active")
    public ResponseEntity<List<Sorcerer>> getSorcerersActive(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(sorcererService.getSorcerersActive(true));
    }
}
