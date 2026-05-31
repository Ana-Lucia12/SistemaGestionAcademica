package sistemadegestionacademica;


import sistemadegestionacademica.DatoInvalidoExcep;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
// valida los datos ingresados por el usuario
public class Validacion {
    
    // Verifica que un texto no este vacio
    public static void validarTexto(String texto)
            throws DatoInvalidoExcep {
       
        // Si el texto es nulo o esta vacio
        if (texto == null || texto.trim(). isEmpty()) {
            
            // se lanza una excepcion personalizada
            throw new DatoInvalidoExcep("El campo no puede estar vacio");
            }
    }
    
    // Propagacion de excepciones

    public static void procesarNombre(String nombre)
            throws DatoInvalidoExcep {
        try{
            validarTexto(nombre);
        } catch (DatoInvalidoExcep e){
            
            // Se captura la excepcion y se devuelve con un mensaje mas claro
            throw new DatoInvalidoExcep ("Error al procesar el nombre: " + e.getMessage());
        }
    }
}

