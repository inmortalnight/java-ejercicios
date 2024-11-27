import java.util.Scanner;

public class arrays_5 {
    public static void main(String[] args){
        //Pedir por pantalla la calificación e ir consiguiendo el total para luego calcular la media.
        double[] calification = new double[6];
        double total = 0;
        for(int count = 0; count < 6; count++){
            System.out.println("Introduzca una calificación (6 en total):");
            Scanner input = new Scanner(System.in);
            calification[count] = input.nextDouble();
            total = total + calification[count];
        }
        double media = total/6;
        //Clasificar la calificación.
        if(media>=5){
            System.out.println("La nota " + media + " es aprobado.");
        } else{
            System.out.println("La nota " + media + " es suspenso.");
        }
        if(media>5 && media <=6.5){
            System.out.println("La nota " + media + " es bien.");
        }
        if(media >6.5 && media<=8.5){
            System.out.println("La nota " + media + " es notable.");
        }
        if(media >8.5 && media>=9){
            System.out.println("La nota " + media + " es sobresaliente.");
        }
    }
}