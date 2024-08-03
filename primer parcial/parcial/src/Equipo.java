public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("El equipo " + tipo + " está encendido.");
    }

    public void apagar() {
        System.out.println("El equipo " + tipo + " está apagado.");
    }

    public void reparar() {
        System.out.println("El equipo " + tipo + " está siendo reparado.");
    }
}
