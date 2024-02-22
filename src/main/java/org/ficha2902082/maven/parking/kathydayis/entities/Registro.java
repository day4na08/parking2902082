package org.ficha2902082.maven.parking.kathydayis.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public double valor;
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, String string, Carro carro) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = String;
        this.valor = carro;
    }
    
    
}
