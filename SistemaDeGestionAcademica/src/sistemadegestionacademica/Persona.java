package sistemadegestionacademica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yarie
 */

//Clase Persona y sus atributos
public class Persona {
    private String nombre;
    private String id;
    private Direccion direccion; //Composición
    
    private static final String PAIS = "Costa Rica";

    //Constructor
    public Persona(String nombre, String id, Direccion direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion; //Composición
    }
    
    //Setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Direccion getDirección() {
        return direccion;
    }

    public void setDirección(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public String getPais() {
        return PAIS;
    }
    
}
