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
@Table(name="medicamento")

public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedicamento;

    @Column(name = "nombreMedicamento", length = 100)
    private String nombreMedicamento;

    @Column(name = "estadoMedicamento", length = 20)
    private String estadoMedicamento;

    @OneToMany(mappedBy = "DiagnosticoMed")
    private List<DiagnosticoMedicamento> DetalleMedica;

    public Medicamento() {
    }

    public Medicamento(int idMedicamento, String nombreMedicamento, String estadoMedicamento) {
        this.idMedicamento = idMedicamento;
        this.nombreMedicamento = nombreMedicamento;
        this.estadoMedicamento = estadoMedicamento;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getEstadoMedicamento() {
        return estadoMedicamento;
    }

    public void setEstadoMedicamento(String estadoMedicamento) {
        this.estadoMedicamento = estadoMedicamento;
    }

   
    
}
