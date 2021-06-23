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
import java.time.*;


@Entity
@Table(name="agenda")

public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgenda;
    @Column(name = "fechaInicioAgenda")
    private LocalDate fechaInicioAgenda;

    @Column(name = "fechaFinAgenda")
    private LocalDate fechaFinAgenda;

    @Column(name = "estadoAgenda", length = 20)
    private String estadoAgenda;

    @Column(name = "idUsuarioFK")
    private int idUsuarioFK;

    @ManyToOne
    @JoinColumn(name = "idUsuarioFK",insertable = false, updatable = false)
    private Usuario AgendUsu;

    @OneToMany(mappedBy = "AgendaCitas")
    private List<Cita> CitasAgen;

    public Agenda() {
    }

    public Agenda(int idAgenda, LocalDate fechaInicioAgenda, LocalDate fechaFinAgenda, String estadoAgenda,
            int idUsuarioFK) {
        this.idAgenda = idAgenda;
        this.fechaInicioAgenda = fechaInicioAgenda;
        this.fechaFinAgenda = fechaFinAgenda;
        this.estadoAgenda = estadoAgenda;
        this.idUsuarioFK = idUsuarioFK;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public LocalDate getFechaInicioAgenda() {
        return fechaInicioAgenda;
    }

    public void setFechaInicioAgenda(LocalDate fechaInicioAgenda) {
        this.fechaInicioAgenda = fechaInicioAgenda;
    }

    public LocalDate getFechaFinAgenda() {
        return fechaFinAgenda;
    }

    public void setFechaFinAgenda(LocalDate fechaFinAgenda) {
        this.fechaFinAgenda = fechaFinAgenda;
    }

    public String getEstadoAgenda() {
        return estadoAgenda;
    }

    public void setEstadoAgenda(String estadoAgenda) {
        this.estadoAgenda = estadoAgenda;
    }

    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }

    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }

   
    
}
