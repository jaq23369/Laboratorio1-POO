'''
Alumno: Joel Antonio Jaquez Lopez
Carné: 23369
Materia: Programación Orientada a Objetos (POO)
Carrera: Ingeniería en Ciencias de la computación
Descripción de la clase: Esta es la clase Jugador la cual posee atributos y funciones propias
de los jugadore y les permiten poseer nombre y poner nombre, tambien les permiten llevar el
conteo de los puntos que ambos han acumulado con el pasar de las rondas.
Fecha de Creación: 4/8/2023
Última fecha de modificación: 5/8/2023
'''
class Jugador{
    private String nombre;
    private int puntos;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntos = 0;
    }

    public void agregarPuntos(int puntos){
        this.puntos += puntos;
    }

    public void resetearPuntos(){
        this.puntos = 0;
    }

    public int getPuntos(){
        return puntos;
    }

    public String getNombre(){
        return nombre;
    }
}