import java.util.Scanner;

public class matrices3_1 {
    public static void main(String[] args){
        //Pedir por pantalla una palabra y decidir las dimensiones del array.
        System.out.println("Introduzca una palabra: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        //Crear la array y rellenarla con la palabra.
        char matriz[] = new char[text.length()];
        int indicator = 0;
        boolean doubled = false;
        for(int i = 0; i < text.length(); i++){
            matriz[i] = text.charAt(indicator);
            System.out.print(matriz[i] + " ");
            indicator++;
            //Ver si hay alguna letra repetida.
            for(int x = i; x >= 0; x--){
                if(matriz[i] == matriz[x]){
                    if(i==x){
                    } else {
                        doubled = true;
                    }
                }
            }
        }
        System.out.println();
        //Confirmar si la letra se repite.
        if(doubled == true){
            System.out.println("Hay alguna letra repetida.");
        } else {
            System.out.println("No hay ninguna letra repetida.");
        }
        input.close();
    }
}

/* VERSIÓN ABORTADA POR LIMITACIONES
import java.util.Scanner;

public class matrices3_1 {
    public static void main(String[] args){
        //Pedir por pantalla una palabra y decidir las dimensiones del matriz.
        System.out.println("Introduzca una palabra: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int row = text.length()/2;
        int column = text.length() - row;
        //Crear la matriz y rellenarla con la palabra.
        char matriz[][] = new char[row][column];
        int indicator = 0;
        boolean doubled = false;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matriz[i][j] = text.charAt(indicator);
                System.out.println(matriz[i][j] + " ");
                indicator++;
                //Ver si hay alguna letra repetida.
                //NO ES POSIBLE PORQUE CONTAR HACIA ATRAS DENTRO DE UNA MATRIZ SIN QUE OCURRA UN BUG.
                for(int x = row; x - 1>= 0; x--){
                    for(int y = j - 1; y >= 0; y--){
                        System.out.println("ij = " +  i + j + " " + matriz[i][j]);
                        System.out.println("xy = " +  x + y + " " + matriz[x][y]);
                        if(matriz[i][j] == matriz[x][y]){
                            if((i+j)==(x+y)){
                            } else {
                                System.out.println("igual");
                                doubled = true;
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
        if(doubled == true){
            System.out.println("Hay una letra repetida.");
        } else {
            System.out.println("No hay ninguna letra repetida.");
        }
        input.close();
    }
} */