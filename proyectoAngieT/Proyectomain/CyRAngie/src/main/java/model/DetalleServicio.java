package model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

@Entity
@Table(name="detalleservicio")

public class DetalleServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleServicio;

    @Column(name = "nombreServicio", length = 100)
    private String nombreServicio;

    @Column(name = "cantidadServicios")
    private int cantidadServicios;

    @Column(name = "precioTotal", length = 8)
    private String precioTotal;

    @Column(name = "idCitaFK")
    private int idCitaFK;

    @Column(name = "idServicioFK")
    private int idServicioFK;

    @Column(name = "idMedicamentoFK")
    private int idMedicamentoFK;

    @ManyToOne
    @JoinColumn(name = "idCitaFK",insertable = false, updatable = false)
    private Cita DetaServicio;

    @ManyToOne
    @JoinColumn(name = "idServicioFK",insertable = false, updatable = false)
    private Servicio ServicioDeta;

    public DetalleServicio() {
    }

    public DetalleServicio(int idDetalleServicio, String nombreServicio, int cantidadServicios, String precioTotal,
            int idCitaFK, int idServicioFK, int idMedicamentoFK) {
        this.idDetalleServicio = idDetalleServicio;
        this.nombreServicio = nombreServicio;
        this.cantidadServicios = cantidadServicios;
        this.precioTotal = precioTotal;
        this.idCitaFK = idCitaFK;
        this.idServicioFK = idServicioFK;
        this.idMedicamentoFK = idMedicamentoFK;
    }

    public int getIdDetalleServicio() {
        return idDetalleServicio;
    }

    public void setIdDetalleServicio(int idDetalleServicio) {
        this.idDetalleServicio = idDetalleServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getCantidadServicios() {
        return cantidadServicios;
    }

    public void setCantidadServicios(int cantidadServicios) {
        this.cantidadServicios = cantidadServicios;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getIdCitaFK() {
        return idCitaFK;
    }

    public void setIdCitaFK(int idCitaFK) {
        this.idCitaFK = idCitaFK;
    }

    public int getIdServicioFK() {
        return idServicioFK;
    }

    public void setIdServicioFK(int idServicioFK) {
        this.idServicioFK = idServicioFK;
    }

    public int getIdMedicamentoFK() {
        return idMedicamentoFK;
    }

    public void setIdMedicamentoFK(int idMedicamentoFK) {
        this.idMedicamentoFK = idMedicamentoFK;
    }
    
    
   
    
}
