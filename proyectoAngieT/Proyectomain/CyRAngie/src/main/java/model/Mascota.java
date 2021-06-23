package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import java.time.*;


@Entity
@Table(name="mascota")

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMascota;

    @Column(name = "nombreMascota", length = 50)
    private String nombreMascota;

    @Column(name = "tamañoMascota", length = 10)
    private String tamañoMascota;

    @Column(name = "pesoMascota", length = 10)
    private String pesoMascota;

    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "estadoMascota", length = 20)
    private String estadoAgenda;

    @Column(name = "idEspecieMascotaFK")
    private int idEspecieMascotaFK;

    @Column(name = "idUsuarioFK")
    private int idUsuarioFK;

    @ManyToOne
    @JoinColumn(name = "idEspecieMascotaFK",insertable = false, updatable = false)
    private EspecieMascota EspeMascota;

    @ManyToOne
    @JoinColumn(name = "idUsuarioFK",insertable = false, updatable = false)
    private Usuario UsuMascota;

    @OneToMany(mappedBy = "CitasCon")
    private List<Cita> citasMasco;


    public Mascota() {
    }

    public Mascota(int idMascota, String nombreMascota, String tamañoMascota, String pesoMascota,
            LocalDate fechaNacimiento, String estadoAgenda, int idEspecieMascotaFK, int idUsuarioFK) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.tamañoMascota = tamañoMascota;
        this.pesoMascota = pesoMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoAgenda = estadoAgenda;
        this.idEspecieMascotaFK = idEspecieMascotaFK;
        this.idUsuarioFK = idUsuarioFK;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getTamañoMascota() {
        return tamañoMascota;
    }

    public void setTamañoMascota(String tamañoMascota) {
        this.tamañoMascota = tamañoMascota;
    }

    public String getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(String pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoAgenda() {
        return estadoAgenda;
    }

    public void setEstadoAgenda(String estadoAgenda) {
        this.estadoAgenda = estadoAgenda;
    }

    public int getIdEspecieMascotaFK() {
        return idEspecieMascotaFK;
    }

    public void setIdEspecieMascotaFK(int idEspecieMascotaFK) {
        this.idEspecieMascotaFK = idEspecieMascotaFK;
    }

    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }

    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }

    
    
}
