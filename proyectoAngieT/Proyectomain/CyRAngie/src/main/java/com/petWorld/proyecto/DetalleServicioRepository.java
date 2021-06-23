package com.petWorld.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;

import model.DetalleServicio;

public interface DetalleServicioRepository extends JpaRepository<DetalleServicio,Integer> {
    
}
