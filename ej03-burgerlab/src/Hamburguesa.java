public class Hamburguesa {

    private final String proteina;
    private final int porciones;
    private final String pan;
    private final boolean queso;
    private final boolean tocineta;
    private final boolean cebollaCaramelizada;
    private final boolean pepinillos;
    private final String salsa;
    private final boolean papasAgrandadas;

    private Hamburguesa(Builder b) {
        this.proteina = b.proteina;
        this.porciones = b.porciones;
        this.pan = b.pan;
        this.queso = b.queso;
        this.tocineta = b.tocineta;
        this.cebollaCaramelizada = b.cebollaCaramelizada;
        this.pepinillos = b.pepinillos;
        this.salsa = b.salsa;
        this.papasAgrandadas = b.papasAgrandadas;
    }

    public static class Builder {
        private final String proteina;
        private final int porciones;
        private String pan = "brioche";
        private boolean queso;
        private boolean tocineta;
        private boolean cebollaCaramelizada;
        private boolean pepinillos;
        private String salsa = "ninguna";
        private boolean papasAgrandadas;

        public Builder(String proteina, int porciones) {
            this.proteina = proteina;
            this.porciones = porciones;
        }

        public Builder pan(String pan) {
            this.pan = pan;
            return this;
        }

        public Builder conQueso() {
            this.queso = true;
            return this;
        }

        public Builder conTocineta() {
            this.tocineta = true;
            return this;
        }

        public Builder conCebollaCaramelizada() {
            this.cebollaCaramelizada = true;
            return this;
        }

        public Builder conPepinillos() {
            this.pepinillos = true;
            return this;
        }

        public Builder salsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public Builder conPapasAgrandadas() {
            this.papasAgrandadas = true;
            return this;
        }

        public Hamburguesa build() {
            if (proteina == null || proteina.isBlank()) {
                throw new IllegalArgumentException("La proteina es obligatoria");
            }
            if (porciones < 1 || porciones > 3) {
                throw new IllegalArgumentException("Pedido rechazado: maximo 3 porciones (solicitadas: " + porciones + ")");
            }
            return new Hamburguesa(this);
        }
    }

    @Override
    public String toString() {
        return "Hamburguesa de " + proteina + " x" + porciones
             + ", pan: " + pan
             + (queso ? ", queso" : "")
             + (tocineta ? ", tocineta" : "")
             + (cebollaCaramelizada ? ", cebolla caramelizada" : "")
             + (pepinillos ? ", pepinillos" : "")
             + ", salsa: " + salsa
             + (papasAgrandadas ? ", papas agrandadas" : "");
    }
}
