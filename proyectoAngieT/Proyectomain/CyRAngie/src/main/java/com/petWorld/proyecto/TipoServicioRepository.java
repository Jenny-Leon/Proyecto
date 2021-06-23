package com.petWorld.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;

import model.TipoServicio;

public interface TipoServicioRepository extends JpaRepository<TipoServicio,Integer> {
    
}
