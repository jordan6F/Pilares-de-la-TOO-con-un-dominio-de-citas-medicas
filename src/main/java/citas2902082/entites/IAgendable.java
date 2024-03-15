package citas2902082.entites;

import java.time.LocalDateTime;

public interface IAgendable {

    public void agendarCita(LocalDateTime fecha);

    public void cancelarCita();

    public void reagendarCita(LocalDateTime fecha);


}
