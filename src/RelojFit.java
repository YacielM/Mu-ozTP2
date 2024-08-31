import java.util.Random;

class RelojFit extends Reloj {
    public RelojFit(String modelo, long numSerie) {
        super(modelo, numSerie);
    }

    public void cuentaPasos(int x, int y) {
        System.out.println("Contando pasos en coordenadas: (" + x + ", " + y + ")");
    }

    public void frecuenciaAleatoria() {
        Random rand = new Random();
        int frecuencia = rand.nextInt(101) + 70; 
        System.out.println("Frecuencia actual: " + frecuencia + " pulsaciones por minuto");
    }
}