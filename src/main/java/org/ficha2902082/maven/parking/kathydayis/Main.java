package org.ficha2902082.maven.parking.kathydayis;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.ficha2902082.maven.parking.kathydayis.entities.Carro;
import org.ficha2902082.maven.parking.kathydayis.entities.Cliente;
import org.ficha2902082.maven.parking.kathydayis.entities.Cupo;
import org.ficha2902082.maven.parking.kathydayis.entities.Registro;
import org.ficha2902082.maven.parking.kathydayis.entities.TipoDocumento;
import org.ficha2902082.maven.parking.kathydayis.entities.TipoVehiculo;

//importar dependencias


public class Main {
    public static void main(String[] args) {
          // crear dos instancias
           // de la clase carro
             //instanciar dos cupos//
        Cupo Cupito1 = new Cupo();
        Cupito1.ancho =1.0;
        Cupito1.largo =4.5;
        Cupito1.letra ='A';
        
        Cupo Cupito2 = new Cupo('B', 2.5, 2.5);
        System.out.println();
                            

    Carro carrito1 = new Carro("xxa-123", TipoVehiculo.TAXI);
    Carro carrito2= new Carro("jda-356", TipoVehiculo.BUS);
    

    Cliente clientecito1 = new Cliente( "dayana", "aguilar", TipoDocumento.CC, 1673612735L, 61365657138L);
    Cliente clientecito2 = new Cliente("juan", "Arias", TipoDocumento.CE, 63176473877213L, 6736814871L);

    clientecito1.addCar(carrito2);
    clientecito1.addCar("xxa-123", TipoVehiculo.TAXI);
    

    clientecito2.addCar(carrito1);


    
    
    Cupito2.letra='B';

    List <Registro> misRegistros = new ArrayList<>();
    


    Registro registro1 = new Registro(LocalDate.of(24, 03, 23), LocalTime.of(16, 04, 43), LocalDate.of(24, 03, 24), "45000", clientecito1.misCarros.get(0));
    Registro registro2 = new Registro(LocalDate.of(24, 04, 03), LocalTime.of(12, 54, 45), LocalDate.of(24, 04, 05), "45000", clientecito2.misCarros.get(0));
      

    System.out.println("Placa" + r.Carro.Placa + "|" + "Cupo:" + r.cupo.letra);

   
}
}
//recorrer la lista de registros//
//for(   Registro :  misRegistros )