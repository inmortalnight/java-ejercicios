import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        //Pedir números por pantalla y guardarlo en variables diferentes.
        System.out.println("Introduce tu número: ");
        Scanner number_1 = new Scanner(System.in);
        int number1 = number_1.nextInt();
        System.out.println("Introduce tu número: ");
        Scanner number_2 = new Scanner(System.in);
        int number2 = number_2.nextInt();
        System.out.println("Introduce tu número: ");
        Scanner number_3 = new Scanner(System.in);
        int number3 = number_3.nextInt();

        //Comparar números, conseguir el orden y mostrarlo por pantalla.
        if(number1 > number2) {
            if(number1 > number3) {
                if(number2 > number3) {
                    System.out.println("Orden: " + number1 + ">" + number2 + ">" + number3);
                }
                else if(number2 < number3) {
                    System.out.println("Orden: " + number1 + ">" + number3 + ">" + number2);
                }
            }
            else if(number1 < number3) {
                System.out.println("Orden: " + number3 + ">" + number1 + ">" + number2);
            }
        }
        else if(number1 < number2) {
            if(number1 < number3) {
                if(number2 > number3) {
                    System.out.println("Orden: " + number2 + ">" + number3 + ">" + number1);
                }
                else if(number2 < number3) {
                    System.out.println("Orden: " + number3 + ">" + number2 + ">" + number1);
                }
            }
            else if(number1 > number3) {
                System.out.println("Orden: " + number2 + ">" + number1 + ">" + number3);
                }
            }
        number_1.close();
        number_2.close();
        number_3.close();
        }
}