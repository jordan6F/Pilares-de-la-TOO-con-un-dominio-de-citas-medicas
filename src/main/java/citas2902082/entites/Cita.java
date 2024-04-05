package citas2902082.entites;

import java.time.LocalDateTime;

public class Cita {


   protected LocalDateTime fecha;
   protected Integer id;
   protected Paciente paciente;
   protected Consultorio consultorio;

public Cita(Integer id,LocalDateTime fecha, Paciente paciente) {
    this.fecha = fecha;
    this.paciente = paciente;
    this.id=id;
}

public LocalDateTime getFecha() {
    return fecha;
}

public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
}

public Paciente getPaciente() {
    return paciente;
}

public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
}



public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public Consultorio getConsultorio() {
    return consultorio;
}

public void setConsultorio(Consultorio consultorio) {
    this.consultorio = consultorio;
}

public Cita(LocalDateTime fecha, Integer id, Paciente paciente, Consultorio consultorio) {
    this.fecha = fecha;
    this.id = id;
    this.paciente = paciente;
    this.consultorio = consultorio;
}






} 


