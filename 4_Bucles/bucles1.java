import java.util.Scanner;

public class bubles1 {
    public static void main(String[] args) {
        int count = 0;
        int number;
        do {
            //Pedir numero y guardarlo.
            System.out.println("Introduce un número:");
            Scanner number1 = new Scanner(System.in);
            number = number1.nextInt();
            //Comprobar si es primo.
            if (number > 1) {
                for(int i = 1; i <= number; i++) {
                    if(number%i == 0) {
                        count++;
                    }
                }
                //Informar si el número es primo.
                if(count < 3){
                    System.out.println("Es primo.");
                }
                count = 0;
            }
        } while(number != 0);
    }
}

