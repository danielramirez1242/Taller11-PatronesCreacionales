public abstract class NivelDungeon {

    private final String nombre;

    public NivelDungeon(String nombre) {
        this.nombre = nombre;
    }

    protected abstract Enemigo crearEnemigo();

    public void recorrer(int cantidadEnemigos) {
        System.out.println("Entrando a: " + nombre);
        for (int i = 0; i < cantidadEnemigos; i++) {
            Enemigo enemigo = crearEnemigo();
            enemigo.atacar();
        }
    }
}
