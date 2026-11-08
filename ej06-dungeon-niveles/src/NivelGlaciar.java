public class NivelGlaciar extends NivelDungeon {
    public NivelGlaciar() { super("Glaciar"); }

    @Override
    protected Enemigo crearEnemigo() { return new Golem(); }
}
