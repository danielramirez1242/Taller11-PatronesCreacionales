public class Main {
    public static void main(String[] args) {
        TaquillaFisica taquilla = new TaquillaFisica();
        AppWeb app = new AppWeb();

        System.out.println("ej07-cinelibre-integrador");

        taquilla.vender(new Boleta.Builder("Amazonas Perdido", "F7")
                .en3D()
                .sillaVip()
                .combo("nachos")
                .build());

        app.comprar(new Boleta.Builder("Amazonas Perdido", "F8")
                .tarifaEstudiante()
                .build());

        app.comprar(new Boleta.Builder("Amazonas Perdido", "F7")
                .combo("crispetas")
                .build());
    }
}
