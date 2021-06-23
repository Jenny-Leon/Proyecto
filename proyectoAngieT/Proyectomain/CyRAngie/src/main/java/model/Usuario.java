package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;


@Entity
@Table(name="usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombreUsuario",length = 20)
    private String nombreUsuario;
    @Column(name = "contraUsuario",length = 15)
    private String contraUsuario;
    @Column(name = "nombre",length = 50)
    private String nombre;
    @Column(name = "apellido",length = 50)
    private String apellido;
    @Column(name = "telefono",length = 20,nullable = false)
    private String telefono;
    @Column(name = "direccion",length = 80,nullable  = false)
    private String direccion;
    @Column(name = "correo",length = 50,nullable = false)
    private String correo;
    @Column(name = "idRolFK",nullable = false)
    private int idRolFK;

@ManyToOne
@JoinColumn(name = "idRolFK",insertable = false, updatable = false)
private Rol Roles;

@OneToMany(mappedBy = "AgendUsu")
private List<Agenda> AgendaUsuario;

@OneToMany(mappedBy = "UsuMascota")
private List<Mascota> MascoUsu;

    public Usuario() {
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContraUsuario() {
        return contraUsuario;
    }
    public void setContraUsuario(String contraUsuario) {
        this.contraUsuario = contraUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getIdRolFK() {
        return idRolFK;
    }
    public void setIdRolFK(int idRolFK) {
        this.idRolFK = idRolFK;
    }

    
    
}
