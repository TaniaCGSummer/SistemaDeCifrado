package Codificador.Atbash;

public class CifradoAtbash  {

    private static final String alfabetoMayuscula = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private static final String alfabetoMinuscula = "abcdefghijklmnñopqrstuvwxyz";

    public String proceso(String mensaje){
        StringBuilder  resultado = new StringBuilder();

        System.out.println("👀 Tranformando tu mensaje ");

        for(int i=0; i< mensaje.length(); i++){
            char letra = mensaje.charAt(i);//Devuelve la letra actual (por cada iteracion)

            int posicion = alfabetoMayuscula.indexOf(letra);//posicion en la que se encuentra la letra original en el alfabeto

            if (posicion != -1){
                resultado.append(alfabetoMayuscula.charAt(26-posicion));
                continue;
            }
            posicion = alfabetoMinuscula.indexOf(letra);

            if (posicion !=-1){
                resultado.append(alfabetoMinuscula.charAt(26-posicion));
                continue;
            }

            resultado.append(letra);// diferentes de letras
        }

        return resultado.toString();
    }
}
