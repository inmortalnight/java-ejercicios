//Programa para convertir de euros a libras
import java.util.Scanner;

public class euroconversor {
    public static void main(String[] args) {
        //Crear  y definir objeto
        Double libra;
        Scanner importe = new Scanner(System.in);
        //Pedir importe en euros por pantalla
        System.out.println("Introduzca el importe(euro):");
        //Asignar importe a euro como valor
        Double euro = importe.nextDouble();
        //Conversión de euro a libra
        libra = 0.86*euro;
        //Imprimir resultado
        System.out.println(libra);
        importe.close();
    }

}