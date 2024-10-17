/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.funcion1;

import java.util.List;
import java.util.function.Predicate;


public class FuncionLambda {

    
    public static void main(String[] args) {
        List<String> names=List.of("jonh","jhon", "alex", "Mohammado","Mohammado","Vincent","Alex","Alex");
        // Predicado para filtrar nombres que contienen la letra "o"
        Predicate predicate=name-> names.contains('o');

        // Opción usando predicado en el filtro
        names.stream()
             .filter(predicate)
             .forEach(System.out::println);
    }
    } 
//otra forma 
//Predicate predicate=name-> names.contains('o'); //predicate almacena una funcion, 

