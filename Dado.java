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