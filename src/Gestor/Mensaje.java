package Gestor;

public class Mensaje {
    private String MensajeDeEntrada = "Gestor.Mensaje"; //Archivo para ingresar el mensaje

    public Mensaje(String texto){
        this.MensajeDeEntrada = texto;
    }

    public String getMensajeDeEntrada() {
        return MensajeDeEntrada;
    }

    public void setMensajeDeEntrada(String mensajeDeEntrada) {
        MensajeDeEntrada = mensajeDeEntrada;
    }
}
