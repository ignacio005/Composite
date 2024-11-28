public class Main {
    public static void main(String[] args) {
        Plato plato1 = new Plato("Ensalada César", 10.99);
        Plato plato2 = new Plato("Sopa de Tomate", 6.99);
        Plato plato3 = new Plato("Hamburguesa", 12.99);
        Plato plato4 = new Plato("Tostadas", 8.99);

        Menu desayuno = new Menu("desayuno:");
        desayuno.agregar(plato4);

        Menu comida = new Menu("comida:");
        comida.agregar(plato1);
        comida.agregar(plato2);
        comida.agregar(plato3);

        Menu menuPrincipal = new Menu("restaurante:");
        menuPrincipal.agregar(desayuno);
        menuPrincipal.agregar(comida);
        menuPrincipal.mostrar();
    }
}