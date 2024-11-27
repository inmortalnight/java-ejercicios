import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        System.out.println("Please enter a password:");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        //Comprobar si supera los 25 carácteres.
        int length = password.length();
        if(length >= 25){
            System.out.println("Maximun length of 25 surpassed.");
        }

        //Comprobar si tiene carácteres especiales @,.,$,#,&,/
        int special1 = password.indexOf("@");
        int special2 = password.indexOf(".");
        int special3 = password.indexOf("$");
        int special4 = password.indexOf("&");
        int special5 = password.indexOf("/");
        if(special1 > -1 || special2 > -1 || special3 > -1 || special4 > -1 || special5 > -1) {
            System.out.println("Your password has a special character.");
        }

        //Comprobar si la primera y la última letra están en mayúsculas.
        char first = password.charAt(0);
        char last = password.charAt(length - 1);
        String upperPassword = password.toUpperCase();
        char upperFirst = upperPassword.charAt(0);
        char upperLast = upperPassword.charAt(length - 1);
        if(first == upperFirst || last == upperLast){
            System.out.println("First and last characters are in upper case.");
        } else if (first == upperFirst && last == upperLast) {
            System.out.println("One of the first or last is in upper case.");
        }
    }
}