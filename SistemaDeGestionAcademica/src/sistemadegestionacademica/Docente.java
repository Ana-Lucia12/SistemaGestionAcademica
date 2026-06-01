package sistemadegestionacademica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yarie
 */

//Clase docente heredada de persona
public class Docente extends Persona {

    private String especialidad;

    public Docente(String nombre, String identificacion,
            Direccion direccion, String especialidad) {

        super(nombre, identificacion, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void describirRol() {
        System.out.println("Soy un docente especializado en " + especialidad);
    }
} 


