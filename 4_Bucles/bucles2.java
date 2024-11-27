public class bucles2 {
    public static void main(String[] args) {
        //Establecer los valores iniciales.
        int number1 = 0;
        int number2 = 1;
        //Realizar calculos para sacar los números Fibonacci (cada número es la suma del los dos últimos). 
        //Como cada bucle muestra 2 números, solo se repite 5 veces.
        for(int count = 0; count < 5; count++){
            System.out.println(number1);
            System.out.println(number2);
            number1 = number1 + number2;
            number2 = number2 + number1;
        }
    }
}
