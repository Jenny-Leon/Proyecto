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
@Table(name="cita")

public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;

    @Column(name = "diaAgenda")
    private LocalDate diaAgenda;

    @Column(name = "horaInicio")
    private LocalTime horaInicio;

    @Column(name = "horaFin")
    private LocalTime horaFin;

    @Column(name = "informacionAdicional", length = 200)
    private String informacionAdicional;

    @Column(name = "estadoCita", length = 20)
    private String estadoCita;

    @Column(name = "idAgendaFK")
    private int idAgendaFK;

    @Column(name = "idMascotaFK")
    private int idMascotaFK;

    @ManyToOne
    @JoinColumn(name = "idAgendaFK",insertable = false, updatable = false)
    private Agenda AgendaCitas;

    @ManyToOne
    @JoinColumn(name = "idMascotaFK",insertable = false, updatable = false)
    private Mascota citasMasco;

    @OneToMany(mappedBy = "DetaServicio")
    private List<DetalleServicio> CitaServicio;

    @OneToMany(mappedBy = "CitasCon")
    private List<Consulta> CitaConsulta;

    public Cita() {
    }

    public Cita(int idCita, LocalDate diaAgenda, LocalTime horaInicio, LocalTime horaFin, String informacionAdicional,
            String estadoCita, int idAgendaFK, int idMascotaFK) {
        this.idCita = idCita;
        this.diaAgenda = diaAgenda;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.informacionAdicional = informacionAdicional;
        this.estadoCita = estadoCita;
        this.idAgendaFK = idAgendaFK;
        this.idMascotaFK = idMascotaFK;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getDiaAgenda() {
        return diaAgenda;
    }

    public void setDiaAgenda(LocalDate diaAgenda) {
        this.diaAgenda = diaAgenda;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public int getIdAgendaFK() {
        return idAgendaFK;
    }

    public void setIdAgendaFK(int idAgendaFK) {
        this.idAgendaFK = idAgendaFK;
    }

    public int getIdMascotaFK() {
        return idMascotaFK;
    }

    public void setIdMascotaFK(int idMascotaFK) {
        this.idMascotaFK = idMascotaFK;
    }


    


    
}
