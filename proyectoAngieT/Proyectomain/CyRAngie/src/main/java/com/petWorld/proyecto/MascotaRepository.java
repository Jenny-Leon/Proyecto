package com.petWorld.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota,Integer> {
    
}
