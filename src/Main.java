/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // Crear direcciones
        Direccion direccion1 = new Direccion("San José", "Desamparados");
        Direccion direccion2 = new Direccion("Alajuela", "Grecia");

        // Crear objetos
        Estudiante estudiante1 = new Estudiante(
                "Carlos", "12345",
                direccion1, "Ingeniería en Sistemas"
        );

        Docente docente1 = new Docente(
                "María", "67890",
                direccion2, "Programación"
        );

        // Agregar a la lista
        listaPersonas.add(estudiante1);
        listaPersonas.add(docente1);

        // Recorrer lista (Polimorfismo)
        for (Persona persona : listaPersonas) {

            System.out.println("-------------------");
            System.out.println("Nombre: " + persona.getNombre());

            persona.mostrarIdentificacion();

            // Método polimórfico
            persona.describirRol();

            // Ejecutar evaluar si corresponde
            if (persona instanceof Evaluable) {
                Evaluable evaluable = (Evaluable) persona;
                evaluable.evaluar();
            }
        }
    }
}
