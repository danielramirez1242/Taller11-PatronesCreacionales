public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones sms = new NotificadorSms();
        ServicioNotificaciones email = new NotificadorEmail();
        ServicioNotificaciones push = new NotificadorPush();
        ServicioNotificaciones whatsapp = new NotificadorWhatsApp();

        System.out.println("ej02-notificaciones-banco");
        sms.notificarTransferencia("laura", 150000);
        email.notificarTransferencia("andres", 80000);
        push.notificarCodigoSeguridad("sofia", "482913");
        whatsapp.notificarTransferencia("camilo", 50000);
    }
}
