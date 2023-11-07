package Pregunta7;

public class RecursosHumanos extends Administrativo {
    private boolean accesoConfidencial;

    public RecursosHumanos(String nombre, double salarioBase, String categoria) {
        super(nombre, salarioBase, categoria);
        accesoConfidencial = false;
    }

    public void habilitarAccesoConfidencial() {
        accesoConfidencial = true;
    }

    public void deshabilitarAccesoConfidencial() {
        accesoConfidencial = false;
    }
    
     public boolean tieneAccesoConfidencial() {
        return accesoConfidencial;
    }
}
