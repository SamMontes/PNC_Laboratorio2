package com.example.laboratorio2.repositories;

import com.example.laboratorio2.model.Sorcerer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SorcererRepository extends JpaRepository<Sorcerer, UUID> {
    Sorcerer getSorcerersById(UUID id);
    List<Sorcerer> getSorcerersByEscuela(String escuela);
    List<Sorcerer> getSorcerersByGrado(String grado);

    List<Sorcerer> getSorcerersByIsActiveEquals(Boolean isActive);
}
