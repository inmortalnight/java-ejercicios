import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        //Pedir oracíón por pantalla.
        System.out.println("Introduzca una oración: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        input.close();
        //Imprimir palabras de la oración.
        int length = text.length();
        do {
            length = text.length();
            int space = text.indexOf(" ");
            //condición de salida y fin.
            if (space > -1) {
                System.out.println(text.substring(0, space));
                text = text.substring(space+1, length);
            } else { 
                System.out.println(text);
                break; 
            }
        } while(length > 0);
    }
}