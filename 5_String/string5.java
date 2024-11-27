import java.util.Scanner;

public class string5 {
    public static void main(String[] args) {
        //Pedir email por pantalla.
        System.out.println("Introduzca su correo electrónico: ");
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        input.close();
        //Comprobar si tiene @
        int sign1 = email.indexOf("@");
        if(sign1 < 0) {
            System.out.println("A tu correo le falta el signo @.");
        }
        //Comprobar si tiene .
        int sign2 = email.indexOf(".");
        if(sign2 < 0) {
            System.out.println("A tu correo le falta el signo .");
        }
    } 
}