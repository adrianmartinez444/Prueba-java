
import java.util.List;
import  java.util.ArrayList;


public class Main_Producto {
    public static void main (String[] args){
        List<String> productos = new ArrayList<>();

        // Crear nuevos productos
        //productos.add ("Laptop");
        //productos.add ("Mouse");
        //productos.add ("Teclado");

        //Crear productos nuevos

        Producto laptop = new Producto(1L, "Laptop Asus", 25000,00);
        Producto mouse = new Producto(1L, "Mouse logitech", 25.00,00);
        Producto teclado = new Producto(1L, "Teclado Ajaxxx", 300,00);

        //imprimir cantidad de productos
        //System.out.println("Total de productos: "+ productos.size());
        //imprimir productos por aparte
        //System.out.println("El primer producto es: " + productos.get(0));

        // Usar los metodos

        laptop.mostrarInfo();
        System.out.println();
        laptop.aplicarDescuento(10);

        System.out.println();

        List<Producto> catalogo = new ArrayList<>();
        catalogo.add(laptop);
        catalogo.add(teclado);
        catalogo.add(mouse);

        System.out.println ("\n ----- Catalogo completado -----");
        for(Producto P : catalogo) {
            System.out.println( P.getNombre() + " - $" + P.getPrecio());
        }

        //Recorrido de lista (Se hace todo el tiempo)

        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }
}


