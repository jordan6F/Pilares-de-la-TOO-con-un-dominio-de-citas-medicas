package citas2902082.entites;

import java.time.LocalDateTime;

public class citaEnfermero extends Cita implements IAgendable {

       public String procedimiento;
       public Enfermeros enfermeros;

   

    public citaEnfermero(Integer id, LocalDateTime fecha, Paciente paciente, String procedimiento,
            Enfermeros enfermeros) {
        super(id, fecha, paciente);
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


    @Override
    public void agendarCita(LocalDateTime fecha) {
       super.setFecha(fecha);
    }


    @Override
    public void cancelarCita() {
      System.out.println("CITA DE ENFERMERIA CANCELADA");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }

    
       
        
    }





