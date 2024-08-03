import java.util.ArrayList;
import java.util.List;

public abstract class Postre {
    protected String nombre;
    protected String tamaño;
    protected double precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Postre(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public abstract void preparar();
    public abstract void servir();
}
