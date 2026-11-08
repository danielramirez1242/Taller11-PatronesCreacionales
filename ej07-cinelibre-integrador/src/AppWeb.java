public class AppWeb {

    private MapaSillas mapa = MapaSillas.getInstancia();

    public void comprar(Boleta boleta) {
        if (mapa.reservar(boleta.getSilla())) {
            System.out.println("App - Vendida: " + boleta);
        } else {
            System.out.println("App - Rechazada, silla ocupada: " + boleta.getSilla());
        }
    }
}
