public class Cobertura implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Cobertura(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }
}
