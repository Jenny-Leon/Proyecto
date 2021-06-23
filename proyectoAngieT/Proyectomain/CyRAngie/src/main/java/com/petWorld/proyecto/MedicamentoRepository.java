package com.petWorld.proyecto;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento,Integer>  {
    
}
