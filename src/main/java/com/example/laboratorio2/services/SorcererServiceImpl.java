package com.example.laboratorio2.services;

import com.example.laboratorio2.model.Sorcerer;
import com.example.laboratorio2.repositories.SorcererRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SorcererServiceImpl implements SorcererService{
    private final SorcererRepository sorcererRepository;

    //Registrar hechicero
    @Override
    public void createSorcerer(Sorcerer sorcerer){
        sorcererRepository.save(sorcerer);
    }

    //Obtener todos los hechiceros
    @Override
    public List<Sorcerer> getSorcerers(){
        return sorcererRepository.findAll();
    }

    //Obtener hechicero
    @Override
    public Sorcerer getSorcerer(UUID id){
        return sorcererRepository.getSorcerersById(id);
    }

    //Actualizar hechicero
    public void updateSorcerer(UUID id, Sorcerer sorcerer){
        Sorcerer existSorcerer = sorcererRepository.getSorcerersById(id);
        existSorcerer.setNombre(sorcerer.getNombre());
        existSorcerer.setGrado(sorcerer.getGrado());
        existSorcerer.setTecnica(sorcerer.getTecnica());
        existSorcerer.setEscuela(sorcerer.getEscuela());
        existSorcerer.setEnergia(sorcerer.getEnergia());
        existSorcerer.setIsActive(sorcerer.getIsActive());
        sorcererRepository.save(existSorcerer);
    }

    //Eliminar hechicero
    @Override
    public Sorcerer deleteSorcerer(UUID id){
        Sorcerer existSorcerer = sorcererRepository.getSorcerersById(id);
        sorcererRepository.deleteById(id);
        return existSorcerer;
    }

    //Obtener hechiceros por ecuela
    @Override
    public List<Sorcerer> getSorcerersBySchool(String escuela){
        return sorcererRepository.getSorcerersByEscuela(escuela);
    }

    //Obtener hechiceros por grado
    @Override
    public List<Sorcerer> getSorcerersByGrade(String grado){
        return sorcererRepository.getSorcerersByGrado(grado);
    }

    //Obtener hechiceros activos
    @Override
    public List<Sorcerer> getSorcerersActive(Boolean isActive){
        return sorcererRepository.getSorcerersByIsActiveEquals(true);
    }
}
