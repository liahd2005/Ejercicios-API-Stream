/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.funcion1;

import java.util.*;
import java.util.stream.Collectors;

class Funcionamiento {
    
     

    // Método para encontrar las ciudades más pobladas por continente
    public Map<String, Ciudad> ciudadesMasPobladasPorContinente(List<Pais> paises) {
        return paises.stream()
            .flatMap(pais -> pais.ciudades.stream()
                .filter(ciudad -> ciudad.NPoblacion > 1000000) // Filtro de población
                .map(ciudad -> new AbstractMap.SimpleEntry<>(pais.nombreContinente, ciudad)))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (ciudad1, ciudad2) -> ciudad1.NPoblacion > ciudad2.NPoblacion ? ciudad1 : ciudad2));
    }

    // Método para encontrar la ciudad más poblada de todos los continentes
    public Ciudad ciudadMasPobladaDeTodosLosContinentes(List<Pais> paises) {
        return paises.stream()
            .flatMap(pais -> pais.ciudades.stream())
            .max(Comparator.comparingInt(ciudad -> ciudad.NPoblacion))
            .orElse(null); // Retorna null si no hay ciudades
    }

    // Método para encontrar películas que solo tienen los géneros Drama y Comedia
    public List<Pelicula> peliculasDramaYComedia(List<Pelicula> peliculas) {
        return peliculas.stream()
            .filter(pelicula -> {
                List<String> nombresGeneros = pelicula.generos.stream()
                    .map(Genero::getNombre)
                    .collect(Collectors.toList());
                return nombresGeneros.contains("Drama") && nombresGeneros.contains("Comedia") && nombresGeneros.size() == 2;
            })
            .collect(Collectors.toList());
    }
}
