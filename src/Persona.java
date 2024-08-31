class Persona {
    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }

    public Reloj getReloj() {
        return reloj;
    }
}

