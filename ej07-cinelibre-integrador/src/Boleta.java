public class Boleta {

    private final String pelicula;
    private final String silla;
    private final boolean es3D;
    private final boolean sillaVip;
    private final String combo;
    private final boolean estudiante;

    private Boleta(Builder b) {
        this.pelicula = b.pelicula;
        this.silla = b.silla;
        this.es3D = b.es3D;
        this.sillaVip = b.sillaVip;
        this.combo = b.combo;
        this.estudiante = b.estudiante;
    }

    public String getSilla() { return silla; }

    public static class Builder {
        private final String pelicula;
        private final String silla;
        private boolean es3D;
        private boolean sillaVip;
        private String combo;
        private boolean estudiante;

        public Builder(String pelicula, String silla) {
            this.pelicula = pelicula;
            this.silla = silla;
        }

        public Builder en3D() {
            this.es3D = true;
            return this;
        }

        public Builder sillaVip() {
            this.sillaVip = true;
            return this;
        }

        public Builder combo(String combo) {
            this.combo = combo;
            return this;
        }

        public Builder tarifaEstudiante() {
            this.estudiante = true;
            return this;
        }

        public Boleta build() {
            if (pelicula == null || pelicula.isBlank()) {
                throw new IllegalArgumentException("La pelicula es obligatoria");
            }
            if (silla == null || silla.isBlank()) {
                throw new IllegalArgumentException("La silla es obligatoria");
            }
            return new Boleta(this);
        }
    }

    @Override
    public String toString() {
        return pelicula + ", silla " + silla
             + (es3D ? ", 3D" : "")
             + (sillaVip ? ", VIP" : "")
             + (combo != null ? ", combo " + combo : "")
             + (estudiante ? ", tarifa estudiante" : "");
    }
}
