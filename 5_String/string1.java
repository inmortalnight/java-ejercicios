import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        //Pedir email por pantalla
        System.out.println("Introduce su correo electrónico: ");
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        input.close();
        //Comprobar si tiene @
        int sign = email.indexOf("@");
        if(sign < 0) {
            System.out.println("Tu email no tiene el signo @.");
        }
        //Comprobar que no tiene más de una @
        int length = email.length();
        String email2 = email.substring(sign + 1, length);
        int sign2 = email2.indexOf("@");
        if(sign2 >= 0) {
            System.out.println("Tu email tiene un signo @ de más.");
        }
        //Comprobar si aparece un punto al final
        int point = email.indexOf(".");
        if(point < 0) {
            System.out.println("A tu correo le falta un punto al final.");
        }
        //Longitud mínima de 20 carácteres
        if (length <= 20) {
            System.out.println("Tu correo no llega el mínimo de 20 carácteres.");
        }
        //Texto en minúscula
        String lowerCase = email.toLowerCase();
        if(email.equals(lowerCase)){
        } else {
            System.out.println("El texto de tu correo no está en minúscula.");
        }
    }
}
