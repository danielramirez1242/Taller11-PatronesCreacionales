public class Main {
    public static void main(String[] args) {
        System.out.println("ej04-viajes-andinos");

        PaqueteViaje p1 = new PaqueteViaje.Builder("Cartagena", 4)
                .conVuelo()
                .hotel("Decameron")
                .conDesayuno()
                .tour("Islas del Rosario")
                .build();

        PaqueteViaje p2 = new PaqueteViaje.Builder("Villa de Leyva", 2)
                .hotel("Posada del Sol")
                .conSeguro()
                .build();

        System.out.println(p1);
        System.out.println(p2);

        try {
            PaqueteViaje p3 = new PaqueteViaje.Builder(null, 3)
                    .tour("Cafe en Salento")
                    .build();
            System.out.println(p3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            PaqueteViaje p4 = new PaqueteViaje.Builder("San Andres", 0).build();
            System.out.println(p4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
