package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;

@Entity
@Table(name="rol") 
public class Rol {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idRol;
@Column(name = "nombreRol",length = 50)
private String nombreRol; 
@Column(name = "estadoRol",length = 20)
private String estadoRol;

@OneToMany(mappedBy = "Roles")
private List<Usuario> usuarios; 

public Rol() {
}
public Rol(int idRol, String nombreRol, String estadoRol) {
    this.idRol = idRol;
    this.nombreRol = nombreRol;
    this.estadoRol = estadoRol;
}
public int getIdRol() {
    return idRol;
}
public void setIdRol(int idRol) {
    this.idRol = idRol;
}
public String getNombreRol() {
    return nombreRol;
}
public void setNombreRol(String nombreRol) {
    this.nombreRol = nombreRol;
}
public String getEstadoRol() {
    return estadoRol;
}
public void setEstadoRol(String estadoRol) {
    this.estadoRol = estadoRol;
}


    
}
