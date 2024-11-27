import java.util.Scanner;

public class matrices3 {
    public static void main(String[] args){
        //Establecer bucle para mostrar constantemente el menu de inicio. 
        int matrix[][] = new int[4][4];
        int x = 1;
        int one = 0; //Condición especial (pide realizar paso 1 para acceder a otros pasos)
        while(x == 1){
            //Pedir por pantalla una elección basada en las siguientes funciones descritas.
            System.out.println("Tiene las siguientes opciones para una matriz de 4x4: ");
            System.out.println("1. Rellenar los valores de la matriz.");
            System.out.println("2. Sumar valores de una fila.");
            System.out.println("3. Sumar valores de una columna.");
            System.out.println("4. Sumar valores de la diagonal.");
            System.out.println("5. Sumar valores de la diagonal inversa.");
            System.out.println("6. Media de todos los valores de la matriz.");
            System.out.println("7. Salir.");
            System.out.print("Introduzca su elección: ");
            Scanner input1 = new Scanner(System.in);
            int option = input1.nextInt();
            if(option == 1){
                //1. Rellenar valores por pantalla e imprimir matriz completa.
                System.out.println("Vaya introduciendo los valores:");
                for(int i = 0; i < 4; i++){
                    System.out.println("Línea " + (i + 1));
                    for(int j = 0; j < 4; j++){
                        Scanner input2 = new Scanner(System.in);
                        matrix[i][j] = input2.nextInt();
                    }
                }
                System.out.println("Su matriz es la siguiente: ");
                for(int i = 0; i < 4; i++){
                    for(int j = 0; j < 4; j++){
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                //Condición para que el paso 1 se cumpla.
                one = 1;
            } else if(option == 2 && one == 1){
                //2. Suma de filas pedir por pantalla cual.
                int sumRow = 0;
                System.out.print("Introduzca la fila deseada: ");
                Scanner input = new Scanner(System.in);
                int row = input.nextInt();
                for(int i = (row-1); i < row; i++){
                    for(int j = 0; j < 4; j++){
                        sumRow = sumRow + matrix[i][j];
                    }
                }
                System.out.println("La suma de todos los valores de la fila es " + sumRow);
            }else if(option == 3 && one == 1){
                //3. Suma de columnas a pedir por pantalla cual.
                int sumColumn = 0;
                System.out.println("Introduzca la columna deseada: ");
                Scanner input = new Scanner(System.in);
                int column = input.nextInt();
                for(int i = 0; i < 4; i++){
                    for(int j = (column-1); j < column; j++){
                        sumColumn = sumColumn + matrix[i][j];
                    }
                }
                System.out.println("La suma de todos los valores de la columna es " + sumColumn);
            }else if(option == 4 && one == 1){
                //4. Sumar valores diagonal.
                int sumDiagonal1 = 0;
                int j = 0;
                for(int i = 0; i < 4; i++){
                    sumDiagonal1 = sumDiagonal1 + matrix[i][j];
                    j++;
                }
                System.out.println("La suma de los valores de la diagonal es " + sumDiagonal1);
            }else if(option == 5 && one == 1){
                //5. Sumar valores diagonal inversa.
                int sumDiagonal2 = 0;
                int j = 3;
                for(int i = 0; i < 4; i++){
                    sumDiagonal2 = sumDiagonal2 + matrix[i][j];
                    j--;
                }
                System.out.println("La suma de los valores de la diagonal inversa es " + sumDiagonal2);
            }else if(option == 6 && one == 1){
                //6. Media de todos los valores de la matriz.
                int sumAll = 0;
                for(int i = 0; i < 4; i++){
                    for(int j = 0; j < 4; j++){
                        sumAll = sumAll + matrix[i][j];
                    }
                }
                float media = (float)sumAll/16;
                System.out.println("La media de todos los valores es " + media);
            } else if(option == 7){
                //7. Opción de salida.
                break;
            } else {
                System.out.println("Opción no válida. Puede que se haya olvidado de completar el paso 1.");
            }
            //Restricción para que el bucle no se repita por sí solo.
            System.out.println("¿Seguir? (s/n)");
            Scanner input2 = new Scanner(System.in);
            String answer = input2.nextLine();
            if(answer.equalsIgnoreCase("s")){
                continue;
            } else if(answer.equalsIgnoreCase("n")){
                break;
            } else {
                System.out.println("Respuesta inválida. Continuará.");
                continue;
            }
        }
    }
}