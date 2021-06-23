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
@Table(name="tiposervicio")

public class TipoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoServicio;

    @Column(name = "descripcionTipoServicio", length = 100)
    private String descripcionTipoServicio;

    @Column(name = "estadoTipoServicio", length = 20)
    private String estadoTipoServicio;

    @OneToMany(mappedBy = "ServiTipo")
    private List<Servicio> TipoDeServi;

    public TipoServicio() {
    }

    public TipoServicio(int idTipoServicio, String descripcionTipoServicio, String estadoTipoServicio) {
        this.idTipoServicio = idTipoServicio;
        this.descripcionTipoServicio = descripcionTipoServicio;
        this.estadoTipoServicio = estadoTipoServicio;
    }

    public int getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getDescripcionTipoServicio() {
        return descripcionTipoServicio;
    }

    public void setDescripcionTipoServicio(String descripcionTipoServicio) {
        this.descripcionTipoServicio = descripcionTipoServicio;
    }

    public String getEstadoTipoServicio() {
        return estadoTipoServicio;
    }

    public void setEstadoTipoServicio(String estadoTipoServicio) {
        this.estadoTipoServicio = estadoTipoServicio;
    }
    
   
}
