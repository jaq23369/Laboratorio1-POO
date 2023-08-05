'''
Alumno: Joel Antonio Jaquez Lopez
Carné: 23369
Materia: Programación Orientada a Objetos (POO)
Carrera: Ingeniería en Ciencias de la computación
Descripción de la clase: Esta es la clase Juego, esta clase es como lo el medio principal
entre las 2 clases establecidad con anterioridad, esta clase arrastra lo establecido con anterioridad
y agrega las ultimas funciones necesarias para el optimo funcionamiento del juego y
por su puesto incluye el main para poder correr el juego
Fecha de Creación: 4/8/2023
Última fecha de modificación: 5/8/2023
'''
public class JuegoPig{
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActual;
    private Dado dado1;
    private Dado dado2;
    private int meta;

    public JuegoPig(String nombreJugador1, String nombreJugador2, int maxValorDado, int meta){
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
        jugadorActual = jugador1;
        dado1 = new Dado(maxValorDado);
        dado2 = new Dado(maxValorDado);
        this.meta = meta;
    }

    public void jugar(){
        while(jugador1.getPuntos() < meta && jugador2.getPuntos() < meta){
            int puntosRonda = 0;
            boolean pierdeTurno = false;

            while(puntosRonda < 20 && !pierdeTurno){
                int valorDado1 = dado1.lanzar();
                int valorDado2 = dado2.lanzar();
                System.out.println(jugadorActual.getNombre() + "lanza los dados: " + valorDado1 + ", " + valorDado2);

                if(valorDado1 == 1 || valorDado2 == 1){
                    pierdeTurno = true;
                    System.out.println(jugadorActual.getNombre() + "Ha perdido su turno");
                }else{
                    puntosRonda += valorDado1 + valorDado2;
                }
            }

            if(!pierdeTurno){
                jugadorActual.agregarPuntos(puntosRonda);
                System.out.println(jugadorActual.getNombre() + "Ha ganado" + puntosRonda + "puntos en esta ronda");
            }

            System.out.println("El puntaje actual: " + jugador1.getNombre() + ": " + jugador1.getPuntos() + ", " + jugador2.getNombre() + ": " + jugador2.getPuntos());
            jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
        }

        System.out.println((jugador1.getPuntos() >= meta ? jugador1.getNombre() : jugador2. getNombre()) + "Ha ganado el juego");
    }

    public static void main(String[] args){
        JuegoPig juego = new JuegoPig("Jugador 1", "Computadora", 6, 100);
        juego.jugar();
    }
}
