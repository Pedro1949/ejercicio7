package Pregunta7;

public class Operario extends Empleado {
    private boolean accesoPublico;

    public Operario(String nombre, double salarioBase, String categoria) {
        super(nombre, salarioBase, categoria);
        accesoPublico = true;
    }

    public boolean tieneAccesoPublico() {
        return accesoPublico;
    }
    
    public void obtenerInformacionPublica() {
        // Implementación para obtener información pública
    }
}
