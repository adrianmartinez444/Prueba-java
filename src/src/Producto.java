public class Producto {

    // atributos - caracteristicas de los productos
    private long id;
    private String Nombre;
    private double Precio;
    private int Stock;
    private boolean Disponible;

    // como crear un nuevo producto

    public Producto(Long id, String Nombre, double Precio, int Stock) {
        this.id = id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Disponible = Stock > 0;
    }

    // metodo de imprimir los nuevos productos

    public void mostrarInfo(){
        System.out.println("-----Productos-----");
        System.out.println("El id es: " + id);
        System.out.println("El nombre es: " + Nombre);
        System.out.println("El precio es: $ " + Precio);
        System.out.println("El stock es: " + Stock);
        System.out.println("Hay esta cantidad de productos disponibles: " + Disponible);
    }

    public void aplicarDescuento(double porcentaje){
        double descuento = Precio * ( porcentaje / 100);
        Precio = Precio - descuento;
        System.out.println("Nuevo precio con: " + porcentaje + "% descuento: $" + Precio);
    }

    public long getId(){return id; }
    public String getNombre(){return Nombre; }
    public double getPrecio(){return Precio; }
    public int getStock(){ return Stock; }



}
