public class KioscoDigital {

    public void pedirTurno(String paciente) {
        GeneradorTurnos generador = GeneradorTurnos.getInstancia();
        System.out.println("Kiosco - " + paciente + ": " + generador.siguienteTurno());
    }
}
