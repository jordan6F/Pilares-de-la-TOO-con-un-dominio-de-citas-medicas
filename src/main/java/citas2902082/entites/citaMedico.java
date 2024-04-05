package citas2902082.entites;

import java.time.LocalDateTime;

import citas2902082.entites.enums.EstadoCita;

public class citaMedico extends Cita implements IAgendable {

    public String motivo;
    public Medico medico;
    public EstadoCita estado;

    public citaMedico(Integer id,
        LocalDateTime fecha,
                      Paciente paciente,
                      String motivo,
                      Medico medico, 
                      Consultorio consultorio,
                      EstadoCita estado) {
                        
        super( id, fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estado = estado;
    }

    





    @Override
    public String toString() {
        return "citaMedico [motivo=" + motivo + ", medico=" + medico + ", estado=" + estado + ", getfecha()=" + getFecha() + ", getMotivo()=" + getMotivo() + ", Paciente()=" +
        getPaciente() + "nombre :" + getPaciente().nombres + "apellido :" + getPaciente().apellidos + ",getMedico" + "Consultorio :" + getConsultorio() + "Estado :" + getEstado() + "]";
    }



    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
       super.setFecha(fecha);
        
    }

    @Override
    public void cancelarCita() {
        
        this.estado = EstadoCita.CANCELAR;
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        
        super.setFecha(fecha);
    }



    public EstadoCita getEstado() {
        return estado;
    }



    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    
}