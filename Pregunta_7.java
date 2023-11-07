package Pregunta7;

public class Pregunta_7 {
     public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 2000.0, "Nivel 1");
        Supervisor supervisor1 = new Supervisor("Carlos", 3000.0, "Nivel 2", 500.0);
        RecursosHumanos rrhh1 = new RecursosHumanos("Ana", 2500.0, "Nivel 2");
        Administrativo sunat1 = new Administrativo("Miguel", 2200.0, "Nivel 1");
        Operario publico1 = new Operario("Laura", 1800.0, "Nivel 1");

        empleado1.calcularAumentoSalario(200.0);
        supervisor1.promover("Nivel 3");
        rrhh1.habilitarAccesoConfidencial();
        sunat1.habilitarAccesoTotal();

        System.out.println("Información de los empleados:");
        System.out.println("Empleado: " + empleado1.obtenerNombre() + ", Salario: " + empleado1.calcularSalario());
        System.out.println("Supervisor: " + supervisor1.obtenerNombre() + ", Salario: " + supervisor1.calcularSalario());
        System.out.println("RRHH: " + rrhh1.obtenerNombre() + ", Acceso Confidencial: " + rrhh1.tieneAccesoConfidencial());
        System.out.println("Administrativo: " + sunat1.obtenerNombre() + ", Acceso Total: " + sunat1.tieneAccesoTotal());
        System.out.println("Operario: " + publico1.obtenerNombre() + ", Acceso Público: " + publico1.tieneAccesoPublico());
    }
}
