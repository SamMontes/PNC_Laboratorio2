package com.example.laboratorio2.services;

import com.example.laboratorio2.model.Sorcerer;

import java.util.List;
import java.util.UUID;

public interface SorcererService {
    //Registrar hechicero
    void createSorcerer(Sorcerer sorcerer);

    //Obtener todos los hechiceros
    List<Sorcerer> getSorcerers();

    //Obtener hechicero
    Sorcerer getSorcerer(UUID id);

    //Actualizar hechicero
    void updateSorcerer(UUID id, Sorcerer sorcerer);

    //Eliminar hechicero
    Sorcerer deleteSorcerer(UUID id);

    //Obtener hechiceros por escuela
    List<Sorcerer> getSorcerersBySchool(String escuela);

    //Obtener hechiceros por grado
    List<Sorcerer> getSorcerersByGrade(String grado);

    //Obtener hechiceros activos
    List<Sorcerer> getSorcerersActive(Boolean isActive);
}
