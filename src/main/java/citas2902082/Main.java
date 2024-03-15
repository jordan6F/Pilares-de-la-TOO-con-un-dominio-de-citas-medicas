package citas2902082;

import citas2902082.entites.Medico;
import citas2902082.entites.Usuario;
import citas2902082.entites.enums.Especialidades;
import citas2902082.entites.enums.TipodeIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(1,
        "julian",
        "gonzalez",
        TipodeIdentificacion.CC ,
        1011201296L,
        203098456L,
        Especialidades.DERMATOLOGIA);
        
    System.out.println(m.toString());

     
        
    
    }

    
}