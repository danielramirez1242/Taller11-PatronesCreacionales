public class TaquillaFisica {

    private MapaSillas mapa = MapaSillas.getInstancia();

    public void vender(Boleta boleta) {
        if (mapa.reservar(boleta.getSilla())) {
            System.out.println("Taquilla - Vendida: " + boleta);
        } else {
            System.out.println("Taquilla - Rechazada, silla ocupada: " + boleta.getSilla());
        }
    }
}
