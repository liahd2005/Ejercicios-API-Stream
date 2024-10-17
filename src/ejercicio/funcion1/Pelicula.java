/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.funcion1;

import java.util.List;


public class Pelicula {
    int idPelicula;
    String tituloPelicula;
    int year;
    String ranking;
    List<Genero> generos;
    List<Director> directores;

    // Constructor y getters
    public Pelicula(int idPelicula, String tituloPelicula, int year, String ranking, List<Genero> generos, List<Director> directores) {
        this.idPelicula = idPelicula;
        this.tituloPelicula = tituloPelicula;
        this.year = year;
        this.ranking = ranking;
        this.generos = generos;
        this.directores = directores;
    }
    
    
}
