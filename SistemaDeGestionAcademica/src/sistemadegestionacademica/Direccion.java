package sistemadegestionacademica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yarie
 */

//Clase Direccion y sus atributos
public class Direccion {
    public String provincia;
    public String ciudad;
    
    //Constructor
    public Direccion(String provincia, String ciudad) {
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    // Setter y Getter
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}



