import java.util.Scanner;

public class string3 {
    public static void main(String[] args){
        //Conseguir texto
        System.out.println("Introduce su texto");
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        
        //Bucle que localiza espacios e imprime la palabra en ese intervalo y actualiza la frase cortando las partes ya impresas.
        int length = 1;
        int position = 1;
        do {
            length = words.length();
            position = words.indexOf(" ");
            if(position == -1){
                //Condición para la última palabra.
                System.out.println(words.substring(0, length));
            } else {
                //Imprimir palabra y actualizar indicadores.
                System.out.println(words.substring(0, position));
                words = words.substring(position+1, length);
            }
        } while(position > -1);
    }
}