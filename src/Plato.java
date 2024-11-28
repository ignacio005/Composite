public class Plato implements MenuIterm{
    private String nombre;
    private double precio;
    public Plato(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public void mostrar(){
        System.out.println("Plato: " + nombre + "\n- Precio: " + precio + " €");
    }
}
