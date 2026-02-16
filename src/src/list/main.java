
import java.util.List;
import  java.util.ArrayList;


public class main {
    public static void main (String[] args){
        List<String> productos = new ArrayList<>();

        // Crear nuevos productos
        productos.add ("Laptop");
        productos.add ("Mouse");
        productos.add ("Teclado");

        //imprimir cantidad de productos
        System.out.println("Total de productos: "+ productos.size());
        //imprimir productos por aparte
        System.out.println("El primer producto es: " + productos.get(0));

        //Recorrido de lista (Se hace todo el tiempo)

        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }
}
