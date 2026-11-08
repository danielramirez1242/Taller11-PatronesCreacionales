public class Email implements CanalNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("Email a " + usuario + "@correo.com: " + mensaje);
    }
}
