public class Main {
    public static void main(String[] args) {
        PanelAdmin admin = new PanelAdmin();
        CalculadoraDomicilio calculadora = new CalculadoraDomicilio();
        AppRepartidor repartidor = new AppRepartidor();

        System.out.println("ej01-domicilios-rappi");
        admin.activarModoLluvia(2000);

        double precio = calculadora.calcular(3);
        System.out.println("Cliente: Precio domicilio 3 km: $" + precio);
        repartidor.mostrarGanancia(3);
    }
}
