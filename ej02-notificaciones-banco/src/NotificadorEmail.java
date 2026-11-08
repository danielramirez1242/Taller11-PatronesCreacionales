public class NotificadorEmail extends ServicioNotificaciones {
    @Override
    protected CanalNotificacion crearCanal() {
        return new Email();
    }
}
