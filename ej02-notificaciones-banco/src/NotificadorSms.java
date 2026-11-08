public class NotificadorSms extends ServicioNotificaciones {
    @Override
    protected CanalNotificacion crearCanal() {
        return new Sms();
    }
}
