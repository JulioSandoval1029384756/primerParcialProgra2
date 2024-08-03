public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa("Masa fermentada", 7.0);
        Relleno relleno = new Relleno("chocolate", 0.5);
        Cobertura cobertura = new Cobertura("melocoton", 0.7);

        Crepa crepa = new Crepa("Crepa de fresa", "grande", 25.0, "Masa de panpizza");
        Pastel pastel = new Pastel("pastel de frutas", "grande", 125.0, "frutas");
        Cheesecake cheesecake = new Cheesecake("Cheesecake ", "mediano", 15.0, "Queso crema");
        Brownie brownie = new Brownie("Brownie de Chocolate", "Pequeño", 3.0, "Chocolate blanco");

        Empleado empleado1 = new Empleado("Alejandro Pineda Figueria", "chef", 2800.0);
        Empleado empleado2 = new Empleado("Willian Perez", "guardia", 3200.0);

        Equipo equipo1 = new Equipo("esrtufa", "apagado");
        Equipo equipo2 = new Equipo("cafetera", "fuera de sevicio");

        Sucursal sucursal = new Sucursal("Sucursal de Guatemala", "Calle la democracia");

        sucursal.agregarEmpleado(empleado1);
        sucursal.agregarEmpleado(empleado2);

        sucursal.agregarIngrediente(masa);
        sucursal.agregarIngrediente(relleno);
        sucursal.agregarIngrediente(cobertura);

        sucursal.agregarEquipo(equipo1);
        sucursal.agregarEquipo(equipo2);

        sucursal.agregarEspecialidad(crepa);
        sucursal.agregarEspecialidad(pastel);
        sucursal.agregarEspecialidad(cheesecake);
        sucursal.agregarEspecialidad(brownie);

        crepa.preparar();
        crepa.servir();

        pastel.preparar();
        pastel.servir();

        empleado1.trabajar();
        empleado2.tomarOrden();

        equipo1.encender();
        equipo2.reparar();
    }
}
