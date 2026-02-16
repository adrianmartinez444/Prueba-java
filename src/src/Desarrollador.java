public class Desarrollador implements  Trabajador {

    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public Desarrollador(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override

    public void trabajar() {
        System.out.println(nombre + "esta escribiendo codigo en Java");
    }

    @Override

    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }

    @Override
    public String obtenerCargo() {
        return "Desarrollador Backend";
    }
}
