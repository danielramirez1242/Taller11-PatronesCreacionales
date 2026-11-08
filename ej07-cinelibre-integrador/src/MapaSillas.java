import java.util.ArrayList;

public class MapaSillas {

    private static final MapaSillas INSTANCIA = new MapaSillas();
    private ArrayList<String> ocupadas = new ArrayList<>();

    private MapaSillas() { }

    public static MapaSillas getInstancia() {
        return INSTANCIA;
    }

    public boolean reservar(String silla) {
        if (ocupadas.contains(silla)) {
            return false;
        }
        ocupadas.add(silla);
        return true;
    }
}
