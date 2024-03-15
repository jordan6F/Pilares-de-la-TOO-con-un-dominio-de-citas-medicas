package citas2902082.entites;

import java.time.LocalDateTime;

public class citaEnfermero extends Cita {

       private String procedimiento;
       private Enfermeros enfermeros;

    public citaEnfermero(LocalDateTime fecha, Paciente paciente, String procedimiento, Enfermeros enfermeros) {
        super(fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermeros = enfermeros;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermeros getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(Enfermeros enfermeros) {
        this.enfermeros = enfermeros;
    }

    
       
        
    }





