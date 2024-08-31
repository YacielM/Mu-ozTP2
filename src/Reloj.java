import java.time.LocalDate;

class Reloj {
    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;

    public Reloj(String modelo, long numSerie) {
        this.dia = LocalDate.now().toString();
        this.hora = "00:00";
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public void incrementarDia() {
        this.dia = LocalDate.parse(this.dia).plusDays(1).toString();
    }

    public void incrementarHora() {

        this.hora = "01:00";
    }

    public void limpiarPantalla() {
        System.out.println("Pantalla limpiada");
    }
}