package org.ficha2902082.maven.parking.kathydayis.entities;

public class Cupo {
    public char letra;
    public double largo;
    public double ancho;

    //constructor por defecto//

    //definicion de contructor: metodo especial en una entidad o clase. se ejecuta automaticamente cuandose crea un objeto//
    public Cupo() {
    }

    public Cupo(char letra, double largo, double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
        
    }

    
    
}

