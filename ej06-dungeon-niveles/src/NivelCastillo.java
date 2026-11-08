public class NivelCastillo extends NivelDungeon {
    public NivelCastillo() { super("Castillo"); }

    @Override
    protected Enemigo crearEnemigo() { return new Fantasma(); }
}
