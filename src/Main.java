import Codificador.Atbash.CifradoAtbash;
import Codificador.Mensaje;
import Codificador.Gestor.GestorDeMensajes;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //obj
        GestorDeMensajes gestor = new GestorDeMensajes();
        CifradoAtbash cifrar = new CifradoAtbash();
        StringBuilder msj = new StringBuilder();

        System.out.println("✍ Ingrese el mensaje (〜￣▽￣)〜");//Pedir mensaje

        while(true){
            String linea = sn.nextLine();// lectura linea por linea
            if(linea.isEmpty())break;//rompemos ciclo
            msj.append(linea).append("\n");// agrega linea + salto
        }

        String obj= cifrar.proceso(msj.toString());

        Mensaje objguardar = new Mensaje(obj);//instanciando mensaje
        gestor.guardarMensaje(objguardar);//guardo mensaje

        System.out.println("🐱‍💻 Mensaje: ");
       // System.out.println(mensaje.txt);

    }
}
