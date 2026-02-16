
public class Diseñador implements Trabajador{
    private String nombre;
    private double salarioFijo;

    public Diseñador(String nombre, double salarioFijo){
        this.nombre = nombre;
        this.salarioFijo = salarioFijo;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + "esta diseñando una interfaz");
    }

    @Override
    public double calcularSalario (){
        return salarioFijo;
    }
    @Override
    public String obtenerCargo(){
        return "Diseñador UI/UX";
    }
}
