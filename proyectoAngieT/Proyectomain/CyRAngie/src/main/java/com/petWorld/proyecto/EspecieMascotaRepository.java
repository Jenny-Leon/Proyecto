package com.petWorld.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;

import model.EspecieMascota;

public interface EspecieMascotaRepository extends JpaRepository<EspecieMascota,Integer> {
    
}
