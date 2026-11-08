public class NotificadorWhatsApp extends ServicioNotificaciones {
    @Override
    protected CanalNotificacion crearCanal() {
        return new WhatsApp();
    }
}
