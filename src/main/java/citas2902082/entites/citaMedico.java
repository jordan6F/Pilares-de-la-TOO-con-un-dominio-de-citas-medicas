package citas2902082.entites;

import java.time.LocalDateTime;

import citas2902082.entites.enums.EstadoCita;

public class citaMedico extends Cita implements IAgendable {

    private String motivo;
    private Medico medico;
    private EstadoCita estado;

    public citaMedico(LocalDateTime fecha,
                      Paciente paciente,
                      String motivo,
                      Medico medico) {
        super(fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
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

    

}
