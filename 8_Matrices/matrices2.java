import java.util.Scanner;

public class matrices2 {
    public static void main(String[] args) {
        //Pedir por pantalla la cantidad de filas y columnas. Declarar matrices.
        System.out.println("Introduzca la cantidad de filas: ");
        Scanner input1 = new Scanner(System.in);
        int row = input1.nextInt();
        System.out.println("Introduzca la cantidad de columnas: ");
        Scanner input2 = new Scanner(System.in);
        int column = input2.nextInt();
        int matrix1[][] = new int[row][column];
        int matrix2[][] = new int[row][column];
        //Obtener valores para el primer matriz.
        System.out.println("Primer matriz. Introduzca el valor después de la columna");
        for(int i = 0; i < row; i++){
            System.out.println("Fila " + (i+1));
            for(int j = 0; j < column; j++){
                System.out.println("Columna " + (j+1));
                Scanner input3 = new Scanner(System.in);
                int valor = input3.nextInt(); 
                matrix1[i][j] = valor;
            }
        }
        //Obtener valores para el segundo matriz.
        System.out.println("Segundo matriz. Introduzca el valor después de la columna");
        for(int i = 0; i < row; i++){
            System.out.println("Fila " + (i+1));
            for(int j = 0; j < column; j++){
                System.out.println("Columna " + (j+1));
                Scanner input4 = new Scanner(System.in);
                int valor = input4.nextInt(); 
                matrix2[i][j] = valor;
            }
        }
        //Sumar valores de las dos matrices en un nuevo matriz e imprimir.
        int matrix3[][] = new int[row][column];
        System.out.println("El resultado de la suma de los dos matrices es...");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix1[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println("+");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix2[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println("=");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j] + " ");
            }
        System.out.println();
        }
    }
}