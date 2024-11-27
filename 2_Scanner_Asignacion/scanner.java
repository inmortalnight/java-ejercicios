//Código básico para introducir valores por pantalla.
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //Crear objetos, pedir valor por pantalla, asignar valores: nombre.
        Scanner nameIn = new Scanner(System.in);
        System.out.println("Ingrese su nombre/s:");
        String nameOut = nameIn.next();
        //Crear objetos, pedir valor por pantalla, asignar valores: apellido.
        Scanner surnameIn = new Scanner(System.in);
        System.out.println("Ingrese su apellido/s:");        
        String surnameOut = surnameIn.next();
        //Imprimir saludo
        System.out.println("Buenos días " + nameOut + " " + surnameOut);

        nameIn.close();
        surnameIn.close();
    }
}