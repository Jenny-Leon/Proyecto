package com.petWorld.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Rol;

public interface RolRepository extends JpaRepository<Rol,Integer> {
    
}
