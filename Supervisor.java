package Pregunta7;

public class Supervisor extends Administrativo {
    private double bono;

    public Supervisor(String nombre, double salarioBase, String categoria, double bono) {
        super(nombre, salarioBase, categoria);
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario() {
        // Cálculo del salario para supervisores
        return super.calcularSalario() + bono;
    }

    public double calcularPrima() {
        // Implementación del cálculo de prima para supervisores
        return bono * 0.1; // Ejemplo simple
    }
}