package Codificador.Gestor;

import java.io.*;

import Codificador.Mensaje;

public class GestorDeMensajes {
    private String ArchivoEntrada = "Mensaje.txt"; //Archivo para ingresar el mensaje

    public void guardarMensaje(Mensaje msj){//Guardar mensaje

        try(FileWriter lapiz = new FileWriter("Mensaje.txt",false)){//false para sobre escribir
            lapiz.write(msj.getMsj());
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo");
        }

    }

    public void leerMensaje(){

        try (BufferedReader buffer = new BufferedReader(new FileReader(ArchivoEntrada))){
            String linea;
            System.out.println("🗣 Mensaje: ");

            while((linea = buffer.readLine())!= null){
                // lectura linea por linea
                if(!linea.isEmpty()) {
                    System.out.println(linea );// agrega linea + salto
                }
            }

 } catch (IOException e){
            System.out.println(" ");
        }
}
}
