/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.funcion1;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        Map<String, Ciudad> ciudadesMasPobladasPorContinente = Pais.stream()
            .flatMap(pais -> pais.ciudades.stream()
                .map(ciudad -> new AbstractMap<Object, Object>.SimpleEntry<>(pais.nombreContinente, ciudad)))
            .collect(Collectors.groupingBy(Map.Entry::getKey,
                    Collectors.mapping(Map.Entry::getValue, Collectors.maxBy(Comparator.comparingInt(Ciudad::getNroPoblacion)))))
            .entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().orElse(null)));

        ciudadesMasPobladasPorContinente.forEach((continente, ciudad) -> 
            System.out.println("Continente: " + continente + ", Ciudad: " + ciudad.nombreCiudad));

        // Ejercicio 2: Ciudad más poblada
        Ciudad ciudadMasPoblada = Pais.stream()
            .flatMap(pais -> pais.ciudades.stream())
            .max(Comparator.comparingInt(Ciudad::getNroPoblacion))
            .orElse(null);

        System.out.println("Ciudad más poblada: " + (ciudadMasPoblada != null ? ciudadMasPoblada.nombreCiudad : "No hay ciudades"));

        // Ejercicio 3: Películas con géneros "Drama" y "Comedia"
        List<Pelicula> peliculasDramaYComedia = Pelicula.stream()
            .filter(pelicula -> {
                List<String> nombresGeneros = pelicula.generos.stream()
                    .map(Genero::getNombreGenero)
                    .collect(Collectors.toList());
                return nombresGeneros.contains("Drama") && nombresGeneros.contains("Comedia") && nombresGeneros.size() == 2;
            })
            .collect(Collectors.toList());

        peliculasDramaYComedia.forEach(pelicula -> 
            System.out.println("Película: " + pelicula.tituloPelicula));
    }
}
