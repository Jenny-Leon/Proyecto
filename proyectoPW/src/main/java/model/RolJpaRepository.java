package model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RolJpaRepository extends JpaRepository<Rol,Integer> {
    
  

    Rol findByidRol(int idRol);

    select *from Rol where idRol=?;
    
}
