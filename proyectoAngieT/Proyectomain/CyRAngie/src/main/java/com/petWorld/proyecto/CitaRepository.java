package com.petWorld.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Cita;

public interface CitaRepository extends JpaRepository<Cita,Integer> {
    
}
