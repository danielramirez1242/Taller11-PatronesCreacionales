public abstract class ServicioNotificaciones {

    protected abstract CanalNotificacion crearCanal();

    public void notificarTransferencia(String usuario, double monto) {
        String mensaje = "Recibiste $" + monto + " en tu cuenta BancoPlata";
        crearCanal().enviar(usuario, mensaje);
    }

    public void notificarCodigoSeguridad(String usuario, String codigo) {
        String mensaje = "Tu codigo de seguridad es " + codigo + ". No lo compartas.";
        crearCanal().enviar(usuario, mensaje);
    }
}
