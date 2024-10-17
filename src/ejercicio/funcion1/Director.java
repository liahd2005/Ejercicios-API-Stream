/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.funcion1;

import java.util.List;


public class Director {
     int idDirector;
    String nombreDirector;
    List<String> premios;

    // Constructor y getters
    public Director(int idDirector, String nombreDirector, List<String> premios) {
        this.idDirector = idDirector;
        this.nombreDirector = nombreDirector;
        this.premios = premios;
    }
     
}
