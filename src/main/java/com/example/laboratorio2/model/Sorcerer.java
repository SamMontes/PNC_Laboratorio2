package com.example.laboratorio2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Table(name = "Sorcerer")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sorcerer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nameSorcerer")
    private String nombre;

    @Column(name = "grade")
    private String grado;

    @Column(name = "cursedTechnique")
    private String tecnica;

    @Column(name = "school")
    private String escuela;

    @Column(name = "cursedEnergy")
    private Double energia;

    @Column(name = "isActive")
    private Boolean isActive;
}
