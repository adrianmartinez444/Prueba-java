import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main (String[] args) {
        List<Trabajador> equipo = new ArrayList<>();
        equipo.add (new Desarrollador ("Adrian ", 15.0, 160));
        equipo.add (new Diseñador("Maria ", 20000.0));

        System.out.println("-----Equipo de trabajo-----");
        for (Trabajador t : equipo) {
            t.trabajar();
            System.out.println("Cargo: " + t.obtenerCargo());
            System.out.println("Salario: " + t.calcularSalario());
            System.out.println();
        }
    }
}
