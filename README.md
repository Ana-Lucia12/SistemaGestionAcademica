

# Sistema de Gestión Académica

## Integrantes del proyecto
- Ana Lucia Vargas  
- Yariela Matarrita  
- Veronica Amador  
- Denison Gutierrez 

## Descripción del sistema
El Sistema de Gestión Académica es una aplicación de consola desarrollada en Java que permite administrar estudiantes y docentes dentro de una institución educativa.

El sistema está basado en Programación Orientada a Objetos (POO) y permite registrar personas, almacenar información personal y académica, buscar registros por identificación y ejecutar ciertas tareas específicas según el tipo de persona.

Además, implementa manejo de excepciones para evitar que el programa finalice de forma inesperada si hay datos inválidos ingresados por el usuario.


## Temas aplicados
Durante el desarrollo del proyecto se aplicaron los siguientes conceptos:

- Clases y objetos  
- Encapsulación  
- Composición (Persona - Dirección)  
- Enum (TipoPersona)  
- Herencia (Estudiante y Docente)  
- Polimorfismo  
- Métodos abstractos  
- Interfaces (Evaluable)  
- Método final  
- ArrayList  
- Manejo de errores  
- Excepciones en Java:
  - NumberFormatException  
  - IllegalArgumentException  
  - Excepción personalizada (DatoInvalidoExcep)  
- Validaciones de datos con clase utilitaria  
- Propagación de excepciones (throws)  
- Uso de Git y GitHub (ramas, commits y control de versiones)  


## Instrucciones para ejecutar el programa

1. Clonar el repositorio:
      git clone URL_DEL_REPOSITORIO
2. Abrir el proyecto en NetBeans o cualquier IDE compatible con Java.
3. Verificar que Java esté correctamente configurado.
4. Ejecutar la clase principal:
      SistemaDeGestionAcademica.java
5. Usar el menú en consola para interactuar con el sistema.

## Ramas utilizadas
- main: rama principal del proyecto con la versión final estable.  
- develop: rama de integración donde se unieron las funcionalidades del sistema antes de pasar a main.  
- feature/herencia-y-clases-base: rama utilizada para la creación de las clases base y la implementación de herencia.  
- feature/polimorfismo_y_interfas_evaluable: rama utilizada para implementar el polimorfismo y la interfaz Evaluable.  
- feature/validaciones: rama utilizada para el manejo de validaciones y excepciones del sistema.

## Resumen del aporte realizado por cada integrante

- Ana Lucia Vargas: desarrollo del menú principal del sistema, registro de estudiantes y docentes, implementación de validaciones de entrada, manejo de excepciones (try-catch y excepción personalizada), búsqueda de personas por identificación y uso de ArrayList con polimorfismo.
  
- Verónica Isabel Amador Miranda: Participó en el desarrollo de la estructura base del sistema, creando las clases Persona y Direccion, la enumeración TipoPersona y la clase Utilidades. Además, implementó los atributos, constructores, getters, setters, la constante PAIS y la relación de composición entre Persona y Direccion.

- Yariela Julieth Matarrita Arias: Participó en la implementación de la herencia del sistema mediante la creación de las clases Estudiante y Docente, incorporando los atributos específicos de cada una, sus constructores con el uso de super y la relación entre la superclase Persona y sus subclases.
