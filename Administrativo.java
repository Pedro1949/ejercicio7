package Pregunta7;

public class Administrativo extends Empleado {
    private boolean accesoTotal;

    public Administrativo(String nombre, double salarioBase, String categoria) {
        super(nombre, salarioBase, categoria);
        accesoTotal = false;
    }

    public void habilitarAccesoTotal() {
        accesoTotal = true;
    }

    public void deshabilitarAccesoTotal() {
        accesoTotal = false;
    }
    
    public boolean tieneAccesoTotal() {
        return accesoTotal;
    }
}
