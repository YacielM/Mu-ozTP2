
public class TrabajoPractico2 {

    public static void main(String[] args) {
        RelojFit unReloj = new RelojFit("FitModel", 123456789);
        Persona unaPersona = new Persona("Juan", unReloj);

        
        unaPersona.getReloj().incrementarDia();
        unaPersona.getReloj().incrementarHora();
        unaPersona.getReloj().limpiarPantalla();
        ((RelojFit) unaPersona.getReloj()).cuentaPasos(10, 20);
        ((RelojFit) unaPersona.getReloj()).frecuenciaAleatoria();
    }
    
}
