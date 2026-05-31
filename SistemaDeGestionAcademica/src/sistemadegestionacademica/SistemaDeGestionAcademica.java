/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadegestionacademica;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class SistemaDeGestionAcademica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("**** BIENVENIDO AL SISTEMA ACADEMICO ****");

    do {

        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Registrar docente");
        System.out.println("3. Mostrar personas");
        System.out.println("4. Buscar persona");
        System.out.println("5. Describir roles");
        System.out.println("6. Evaluar");
        System.out.println("7. Salir");

        try {

            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(teclado.nextLine());
            
            switch (opcion) {
                
                // Opcion para registrar estudiantes
                case 1: 
                    
                    try {
                        
                        System.out.println("Nombre del estudiante: ");
                        String nombre = teclado.nextLine();
                        
                        System.out.println("Identidicacion: ");
                        String id = teclado.nextLine();
                       
                        System.out.println("Provincia: ");
                        String provincia = teclado.nextLine();
                        
                        System.out.println("Ciudad: ");
                        String ciudad = teclado.nextLine();
                        
                        System.out.println("Carrera: ");
                        String carrera = teclado.nextLine();
                        
                        // Validaciones
                        Validacion.procesarNombre(nombre);
                        Validacion.validarTexto(id);
                        Validacion.validarTexto(carrera);
                        
                        Direccion direccion = new Direccion (provincia, ciudad);
                        
                        Estudiante estudiante = new Estudiante (nombre, id, direccion, carrera);
                        
                        personas.add(estudiante);
                        
                        System.out.println("Estudante registrado correctamente");
                                                             
                    } catch (DatoInvalidoExcep e) {
                    System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                    // opcion para registrar profesores
                case 2: 
                    
                    try {
                        
                        System.out.println("Nombre del docente: ");
                        String nombre = teclado.nextLine();
                        
                        System.out.println("Identificacion: ");
                        String id = teclado.nextLine();
                        
                        System.out.println("Provincia: ");
                        String provincia = teclado.nextLine();
                        
                        System.out.println("Ciudad: ");
                        String ciudad = teclado.nextLine();
                        
                        System.out.println("Especialidad: ");
                        String especialidad = teclado.nextLine();
                        
                        Validacion.procesarNombre(nombre);
                        Validacion.validarTexto(id);
                        Validacion.validarTexto(especialidad);

                        Direccion direccion = new Direccion(provincia, ciudad);
                            
                        Docente docente = new Docente(nombre, id, direccion, especialidad);
                        
                        personas.add(docente);

                        System.out.println("Docente registrado correctamente.");
                        
                    } catch (DatoInvalidoExcep e) {
                    System.out.println("Error: " + e.getMessage());
                    }
                    break;

                    
                case 3: 
                    if(personas.isEmpty()) {
                    System.out.println("No hay personas registradas.");
                   
                    } 
                    
                    else {
                    
                        for (Persona p: personas) {
                            System.out.println("Nombre: " + p.getNombre());
                            
                            System.out.println("Identificacion: "+ p.getId));
                            
                            System.out.println("-------");
                        }                   
                    }
                    
                    break;
                    
                case 4: 
                    System.out.println("Ingrese la identificacion: ");
                    String id = teclado.nextLine();
                    boolean encontrado = false;
                    
                    for(Persona p: personas){
                        if(p.getId().equals(id)){
                            System.out.println("Persona encontrada: ");
                            System.out.println(p.getNombre());
                            encontrado = true;
                        }
                    }
                    
                    if(!encontrado) {
                        System.out.println("Persona no encontrada");
                    }
                    break;
                 
                    
                case 5: 
                    for(Persona p: personas){
                        p.describirRol();
                    }
                    break;
                    
                case 6: 
                    for(Persona p: personas){
                        if(p instanceof Evaluable){
                            ((Evaluable)p).evaluar();
                        }
                    }
                    break;
                    
                case 7: 
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    throw new IllegalArgumentException("Opcion invalida. Intente de nuevo");
            }
            
            // Captura errores cuando el usuario escribe letras
        } catch (NumberFormatException e) {

            System.out.println("Error: debe ingresar un numero.");
            
        } catch(IllegalArgumentException e) {
            
            System.out.println("Error: " + e.getMessage());
        }

    } while (opcion != 7);
    
        teclado.close();
    }
   
}
