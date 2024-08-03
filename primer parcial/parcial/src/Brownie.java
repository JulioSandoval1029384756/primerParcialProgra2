public class Brownie extends Postre {
    private String tipoChocolate;

    public Brownie(String nombre, String tamaño, double precio, String tipoChocolate) {
        super(nombre, tamaño, precio);
        this.tipoChocolate = tipoChocolate;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando brownie con chocolate: " + tipoChocolate);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo brownie: " + nombre);
    }
}

