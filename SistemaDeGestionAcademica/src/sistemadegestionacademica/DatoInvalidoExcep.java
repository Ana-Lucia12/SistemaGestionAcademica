package sistemadegestionacademica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */


/*
 * Jerarquía de excepciones en Java:
 *
 * Throwable: clase padre de todos los errores y excepciones.
 *
 * Exception: representa problemas que pueden ocurrir durante
 * la ejecución de un programa.
 *
 * RuntimeException: excepciones que ocurren en tiempo de ejecución.
 *
 * Ejemplos:
 * - NumberFormatException
 * - IllegalArgumentException
 * - NullPointerException
 *
 * DatoInvalidoExcep es una excepción personalizada creada
 * para validar los datos ingresados por el usuario.
 */

public class DatoInvalidoExcep extends Exception{
    public DatoInvalidoExcep(String mensaje) {
        super(mensaje);
    }
}
