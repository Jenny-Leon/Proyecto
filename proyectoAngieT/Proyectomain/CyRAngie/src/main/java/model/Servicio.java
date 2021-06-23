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
@Table(name="servicio")

public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;

    @Column(name = "nombreServicio", length = 50)
    private String nombreServicio;

    @Column(name = "estadoServicio", length = 20)
    private String estadoServicio;

    @Column(name = "idTipoServicioFK")
    private int idTipoServicioFK;

    @ManyToOne
    @JoinColumn(name = "idTipoServicioFK",insertable = false, updatable = false)
    private TipoServicio ServiTipo;

    @OneToMany(mappedBy = "ServicioDeta")
    private List<DetalleServicio> ServiDetalle;

    public Servicio() {
    }

    public Servicio(int idServicio, String nombreServicio, String estadoServicio, int idTipoServicioFK) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.estadoServicio = estadoServicio;
        this.idTipoServicioFK = idTipoServicioFK;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(String estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public int getIdTipoServicioFK() {
        return idTipoServicioFK;
    }

    public void setIdTipoServicioFK(int idTipoServicioFK) {
        this.idTipoServicioFK = idTipoServicioFK;
    }

    
    
}
