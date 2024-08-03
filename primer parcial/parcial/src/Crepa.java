public class Crepa extends Postre {
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, String tipoMasa) {
        super(nombre, tamaño, precio);
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando crepa con masa de tipo: " + tipoMasa);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo crepa: " + nombre);
    }
}
