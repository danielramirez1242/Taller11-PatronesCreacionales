public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        System.out.println("ej06-dungeon-niveles");
        juego.jugarNivel(new NivelCripta(), 2);
        juego.jugarNivel(new NivelCastillo(), 1);
        juego.jugarNivel(new NivelGlaciar(), 1);
        juego.jugarNivel(new NivelVolcan(), 2);
    }
}
