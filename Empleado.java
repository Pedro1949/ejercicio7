package Pregunta7;

public class Empleado {
    private String nombre;
    private double salarioBase;
    private String categoria;

    public Empleado(String nombre, double salarioBase, String categoria) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
    }

    public double calcularSalario() {
        // Implementación del cálculo de salario
        return salarioBase;
    }

    public void calcularAumentoSalario(double aumento) {
        salarioBase += aumento;
    }

    public void promover(String nuevaCategoria) {
        categoria = nuevaCategoria;
    }

    public void despedir() {
        // Implementación de despido
    }

    public void darDeAlta() {
        // Implementación de dar de alta
    }

    public void jubilacion() {
        // Implementación de jubilación
    }

    public String obtenerCategoria() {
        return categoria;
    }

    public void establecerCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String obtenerNombre() {
        return nombre;
    }
}