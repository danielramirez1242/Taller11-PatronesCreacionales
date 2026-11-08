public class NivelVolcan extends NivelDungeon {
    public NivelVolcan() { super("Volcan"); }

    @Override
    protected Enemigo crearEnemigo() { return new Dragon(); }
}
