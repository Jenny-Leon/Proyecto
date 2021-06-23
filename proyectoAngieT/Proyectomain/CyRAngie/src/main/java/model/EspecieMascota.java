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
@Table(name="especiemascota")

public class EspecieMascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecieMascota;

    @Column(name = "nombreEspecieMascota", length = 50)
    private String nombreEspecieMascota;

    @Column(name = "estadoEspecieMascota", length = 20)
    private String estadoEspecieMascota;

    @OneToMany(mappedBy = "EspeMascota")
    private List<Mascota> MascotaEspec;

    public EspecieMascota() {
    }

    public EspecieMascota(int idEspecieMascota, String nombreEspecieMascota, String estadoEspecieMascota) {
        this.idEspecieMascota = idEspecieMascota;
        this.nombreEspecieMascota = nombreEspecieMascota;
        this.estadoEspecieMascota = estadoEspecieMascota;
    }

    public int getIdEspecieMascota() {
        return idEspecieMascota;
    }

    public void setIdEspecieMascota(int idEspecieMascota) {
        this.idEspecieMascota = idEspecieMascota;
    }

    public String getNombreEspecieMascota() {
        return nombreEspecieMascota;
    }

    public void setNombreEspecieMascota(String nombreEspecieMascota) {
        this.nombreEspecieMascota = nombreEspecieMascota;
    }

    public String getEstadoEspecieMascota() {
        return estadoEspecieMascota;
    }

    public void setEstadoEspecieMascota(String estadoEspecieMascota) {
        this.estadoEspecieMascota = estadoEspecieMascota;
    }
 
  
    
}




