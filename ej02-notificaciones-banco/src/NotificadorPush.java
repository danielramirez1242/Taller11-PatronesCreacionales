public class NotificadorPush extends ServicioNotificaciones {
    @Override
    protected CanalNotificacion crearCanal() {
        return new Push();
    }
}
