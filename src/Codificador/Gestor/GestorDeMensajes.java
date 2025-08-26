package Codificador.Gestor;

import  java.io.FileWriter;
import Codificador.Mensaje;

import java.io.IOException;

public class GestorDeMensajes {
    private String ArchivoEntrada = "Mensaje.txt"; //Archivo para ingresar el mensaje

    public void guardarMensaje(Mensaje msj){//Guardar mensaje

        try(FileWriter lapiz = new FileWriter("Mensaje.txt",false)){//false para sobre escribir
            lapiz.write(msj.getMsj());
            System.out.println("Mensaje guardado");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo");
        }

    }

    public void leerMensaje(){

    }


}
