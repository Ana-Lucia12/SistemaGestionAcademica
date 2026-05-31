/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Estudiante extends Persona implements Evaluable {

    private String carrera;

    public Estudiante(String nombre, String identificacion,
            Direccion direccion, String carrera) {

        super(nombre, identificacion, direccion);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void describirRol() {
        System.out.println("Soy un estudiante de la carrera de " + carrera);
    }

    @Override
    public void evaluar() {
        System.out.println("El estudiante está siendo evaluado.");
    }
}
