public class Pastel extends Postre {
    private String sabor;

    public Pastel(String nombre, String tamaño, double precio, String sabor) {
        super(nombre, tamaño, precio);
        this.sabor = sabor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pastel de sabor: " + sabor);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo pastel: " + nombre);
    }
}
