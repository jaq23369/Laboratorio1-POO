'''
Alumno: Joel Antonio Jaquez Lopez
Carné: 23369
Materia: Programación Orientada a Objetos (POO)
Carrera: Ingeniería en Ciencias de la computación
Descripción de la clase: Esta es la clase Dado la cual posee las funciones y atributos de
la clase dado la cual permite que el jugador y la computadora puedan competir hasta que
uno de ellos alcance los 100 puntos.
Fecha de Creación: 4/8/2023
Última fecha de modificación: 5/8/2023
'''
import java.util.Random;

class Dado{
    private int maxValor;
    private Random random;

    public Dado(int maxValor){
        this.maxValor = maxValor;
        this.random = new Random();
}

public int lanzar(){
    return random.nextInt(maxValor) + 1;
}
}