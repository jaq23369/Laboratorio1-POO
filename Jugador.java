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