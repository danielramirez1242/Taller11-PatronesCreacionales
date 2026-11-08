public class NivelCripta extends NivelDungeon {
    public NivelCripta() { super("Cripta"); }

    @Override
    protected Enemigo crearEnemigo() { return new Esqueleto(); }
}
