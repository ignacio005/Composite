import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuIterm {
    private String nombre;
    // List<MenuIterm> para agregar cualquier cosa que implemente la interfaz
    private List<MenuIterm> items = new ArrayList<>();
    public Menu(String nombre){
        this.nombre = nombre;
    }
    public void agregar(MenuIterm iterm){
        items.add(iterm);
    }
    public void eliminar(MenuIterm iterm){
        items.remove(iterm);
    }
    @Override
    public void mostrar(){
        System.out.println("Menú " + nombre);
        for (MenuIterm iterm : items){
            iterm.mostrar();
        }
    }
}
