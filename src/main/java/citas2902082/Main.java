package citas2902082;

import java.time.LocalDateTime;
import java.time.Month;

import citas2902082.entites.Cita;
import citas2902082.entites.Consultorio;
import citas2902082.entites.Enfermeros;
import citas2902082.entites.Medico;
import citas2902082.entites.Paciente;
import citas2902082.entites.Usuario;
import citas2902082.entites.citaMedico;
import citas2902082.entites.enums.Especialidades;
import citas2902082.entites.enums.EstadoCita;
import citas2902082.entites.enums.TipoSangre;
import citas2902082.entites.enums.TipodeIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m1 = new Medico(1,
        "julian",
        "gonzalez",
        TipodeIdentificacion.CC ,
        1011201296L,
        203098456L,
        Especialidades.DERMATOLOGIA);
        
    System.out.println(m1.toString());
    
    

        Medico m2 = new Medico(1,
        "jose",
        "perez",
        TipodeIdentificacion.CC ,
        1019065478L,
        20412665456L,
        Especialidades.MEDICINA_GENERAL);
        
    System.out.println(m2.toString());
    

    

        Paciente p1 = new Paciente("rodrigo",
         "perez",
            TipodeIdentificacion.CC,
            0245013066L,
            "RODRI.PEREZ14@GMAIL.COM",
             310584623,
            LocalDateTime.of(2024, Month.APRIL, 4, 2, 30, 0),
            1.70,
             65.7,
             TipoSangre.A,
             "-");
                System.out.println(p1.toString());

                
                Paciente p2 = new Paciente("Sandra",
         "Hernandez",
            TipodeIdentificacion.CC,
        24524166L,
            "HERNANDEZ.sandra@GMAIL.COM",
             312541623,
            LocalDateTime.of(2004, Month.APRIL, 10, 5, 40, 0),
            1.55,
             60.5,
             TipoSangre.O,
             "+");
                System.out.println(p2.toString());

                Paciente p3 = new Paciente("Samantha",
         "Rodriguez",
            TipodeIdentificacion.CC,
            0245013066L,
            "RODRI.samantha@GMAIL.COM",
             310084623,
            LocalDateTime.of(2007, Month.APRIL, 12, 12, 15, 0),
            1.65,
             80.0,
             TipoSangre.B,
             "-");
                System.out.println(p3.toString());

                Paciente p4 = new Paciente("Julian",
         "Jordan",
            TipodeIdentificacion.CC,
            0245013066L,
            "JJordan@GMAIL.COM",
             310025623,
            LocalDateTime.of(1994, Month.APRIL, 18, 1, 30, 0),
            1.56,
             60.0,
             TipoSangre.AB,
             "+");
                System.out.println(p4.toString());

                Paciente p5 = new Paciente("Camilo",
         "Jimenez",
            TipodeIdentificacion.CC,
            0245013066L,
            "Jimenez.cam@GMAIL.COM",
             312584623,
            LocalDateTime.of(1999, Month.APRIL, 4, 2, 30, 0),
            1.70,
             80.7,
             TipoSangre.O,
             "+");
                System.out.println(p5.toString()); 


                Enfermeros e1 = new Enfermeros(
                    10, 
                    "Natalia", 
                    "Ladino", 
                    TipodeIdentificacion.CC, 
                    20304179L);

                    System.out.println(e1.toString()); 

                    Enfermeros e2 = new Enfermeros(
                    12, 
                    "Diego", 
                    "Ruiz", 
                    TipodeIdentificacion.CC, 
                    201654302L);

                    System.out.println(e2.toString()); 

                    Enfermeros e3 = new Enfermeros(
                    14, 
                    "Jaimito", 
                    "Ordoñez", 
                    TipodeIdentificacion.TI, 
                    15780065l);

                    System.out.println(e3.toString()); 

                    Consultorio co1 = new Consultorio(20, "calle 32H 15-00", 30520345L);
                    Consultorio co2 = new Consultorio(23, "calle 12H 45-00", 30520365L);

                  citaMedico c1 = new citaMedico(1, LocalDateTime.of(2024, 
                  Month.APRIL,
                  14,
                    11,
                     50,
                      0)
                      , p5,
                       "gripe",
                        m1,
                         co1,
                    EstadoCita.REAGENDAR);

                    System.out.println(c1.toString());

                    citaMedico c2 = new citaMedico(1, LocalDateTime.of(2024, 
                  Month.APRIL,
                  14,
                    11,
                     50,
                      0)
                      , p5,
                       "gripe",
                        m2,
                         co2
                         , EstadoCita.CANCELAR);

                    System.out.println(c2.toString()); 

                

    }

    

     
        
    
    

    
}