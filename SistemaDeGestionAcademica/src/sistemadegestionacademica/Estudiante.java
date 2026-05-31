package sistemadegestionacademica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yarie
 */

// Creación de la clase estudiante que hereda de persona
public class Estudiante extends Persona{
    public String carrera; // Atributo carrera
    
    //Constructor que utiliza super
    public Estudiante(String nombre, String id, Direccion direccion, String carrera) {
        super(nombre, id, direccion);
        this.carrera = carrera;
    }

    //Setter y getter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
