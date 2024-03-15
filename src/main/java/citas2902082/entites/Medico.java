package citas2902082.entites;

import citas2902082.entites.enums.TipodeIdentificacion;
import citas2902082.entites.enums.Especialidades;

public class Medico extends Usuario {

   

   private Long registroMedic;
   private Especialidades especialidades;
   
public Medico(Integer id, String nombres, String apellidos, TipodeIdentificacion tipoIdent, Long numeroIdentificacion,
        Long registroMedic, Especialidades especialidades) 
        {

            //contructor de la clase padre
            //Es un contructor de la clsae hija
            // Es lo primero que debe aparecer
    super(id, nombres, apellidos, tipoIdent, numeroIdentificacion);
    //inicializar los atributos propios de la clase padre
    this.registroMedic = registroMedic;
    this.especialidades = especialidades;
}

public Long getRegistroMedic() {
    return registroMedic;
}

public void setRegistroMedic(Long registroMedic) {
    this.registroMedic = registroMedic;
}

public Especialidades getEspecialidades() {
    return especialidades;
}

public void setEspecialidades(Especialidades especialidades) {
    this.especialidades = especialidades;
}

@Override
public String toString() {
    return super.toString() + "Medico [registroMedic=" + registroMedic + ", especialidades=" + especialidades + "]";
}






   



}

   

    


