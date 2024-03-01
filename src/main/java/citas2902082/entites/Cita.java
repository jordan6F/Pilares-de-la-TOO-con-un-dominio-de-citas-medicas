package citas2902082.entites;

import java.time.LocalDateTime;

public class Cita {

   public Integer id;

   public LocalDateTime fecha;


   //relaciones

   public Medico medico;

   public Consultorio consultorio;

   public Paciente paciente;

public Cita(LocalDateTime fecha, Medico medico, Consultorio consultorio, Paciente paciente) {
    this.fecha = fecha;
    this.medico = medico;
    this.consultorio = consultorio;
    this.paciente = paciente;
} 

}
