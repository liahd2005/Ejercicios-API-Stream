/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.funcion1;

import java.util.List;


public class Pais {
     String codigo;
    String nombrePais;
    String nombreContinente;
    double areaPoblacion;
    int capital;
    int nroPoblacion;
    List<Ciudad> ciudades;

    // Constructor y getters
    public Pais(String codigo, String nombrePais, String nombreContinente, double areaPoblacion, int capital, int nroPoblacion, List<Ciudad> ciudades) {
        this.codigo = codigo;
        this.nombrePais = nombrePais;
        this.nombreContinente = nombreContinente;
        this.areaPoblacion = areaPoblacion;
        this.capital = capital;
        this.nroPoblacion = nroPoblacion;
        this.ciudades = ciudades;
    }
}

class Genero {
    int idGenero;
    String nombreGenero;

    // Constructor y getters
    public Genero(int idGenero, String nombreGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }
    
}
