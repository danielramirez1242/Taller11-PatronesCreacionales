public class Push implements CanalNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("Push al celular de " + usuario + ": " + mensaje);
    }
}
