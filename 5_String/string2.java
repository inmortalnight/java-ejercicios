import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        //Pedir String por teclado.
        System.out.println("Introduzca su texto (minúscula): ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        input.close();
        //Imprimir la primera mitad de los caracteres de la cadena.
        int length = text.length();
        int middle = length/2;
        System.out.println("Primera mitad del texto: " + text.substring(0, middle));
        //Imprimir el último carácter. 
        System.out.println("Último carácter del texto: " + text.charAt(length - 1));
        //Imprimirlo en forma inversa. 
        StringBuilder text2 = new StringBuilder(text);
        StringBuilder reverse = text2.reverse();
        String reverse2 = reverse.toString();
        System.out.println("El texto inverso: " + reverse2);
        //Imprimir cada carácter del String separado con un guión. 
        StringBuilder text3 = new StringBuilder(text);
        int position = 1;
        for(int count = length -1; count > 0; count--){
            text3 = text3.insert(position, "-");
            position += 2;
        }
        System.out.println("El texto con guiones: " + text3);
        //Imprimir la cantidad de vocales almacenadas. 
        int quantity = 0;
        int position2 = 0;
        for(int count = length; count > 0; count--) {
            char letterChar = text.charAt(position2);
            String letter = String.valueOf(letterChar);
            if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
                quantity += 1;
            }
            position2 += 1;
        }
        System.out.println("La cantidad de vocales de su texto: " + quantity);
        //Implementar un método que verifique si la cadena se lee igual desde ambas direcciones.
        if (text.equalsIgnoreCase(reverse2)) {
            System.out.println("Tu texto se lee igual sin importar la dirección.");
        } else {
            System.out.println("Su texto se lee diferente desde diferentes direcciones.");
        }
    }
}