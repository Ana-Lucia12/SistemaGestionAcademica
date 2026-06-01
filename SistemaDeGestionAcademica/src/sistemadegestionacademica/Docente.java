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
public class Docente extends Persona{
    public String especialidad; //Atributo especialidad 
        
    //Constructor que utiliza super
    public Docente(String nombre, String id, Direccion direccion, String especialidad) {
        super(nombre, id, direccion);
        this.especialidad = especialidad;
    }
    //Setter y getter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
