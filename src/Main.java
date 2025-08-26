import Codificador.Mensaje;
import Codificador.Gestor.GestorDeMensajes;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        GestorDeMensajes gestor = new GestorDeMensajes();

        //Pedir mensaje
        System.out.println("Ingrese el mensaje");
        String msj = sn.nextLine();

        //instanciando mensaje
        Mensaje obj = new Mensaje(msj);
        gestor.guardarMensaje(obj);//mandar mensaje


    }
}
