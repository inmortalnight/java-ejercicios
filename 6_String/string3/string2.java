import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
    //Pedir 2-3 palabras por pantalla.
    System.out.println("Introduce sus palabras: ");
    Scanner input = new Scanner(System.in);
    String words = input.nextLine();

    //Imprimir la primera mitad de los caracteres de la cadena.
    int length = words.length();
    System.out.println("Primera mitad de la cadena " + words.substring(0, length/2));
    
    //Imprimir el último carácter.
    System.out.println("Último carácter " + words.charAt(length - 1));

    //Imprimir la cadena de forma inversa.
    StringBuilder word = new StringBuilder(words);
    System.out.println("Cadena invertida " + word.reverse());

    //Verificar si la cadena se lee igual sin importar la dirección de lectura.
    StringBuilder word2 = new StringBuilder(words);
    if(word2 == word.reverse()){
        System.out.println("Su cadena se lee igual sin importar la dirección de lectura.");
    }

    //Imprimir cada carácter del String separado por un guión.
    StringBuilder word3 = new StringBuilder(word);
    int add = 0;
    for(int count=0; count<length-1; count++){
        add++;
        int space = count + add;
        word3 = word3.insert(space, "-");
        if(count == length-2){
        System.out.println("String con guión " + word3);
        }
    }

    //Imprimir la cantidad de vocales almacenadas.
    int vocal = 0;
    for(int count = 0; count < length; count++){
        char character = word.charAt(count);
        String letter = String.valueOf(character);
        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
            vocal++;
        }
        if(count == length - 1) {
            System.out.println("Número de vocales " + vocal);
        }
    } 
    }
}
