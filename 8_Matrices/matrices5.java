import java.lang.Math;

public class matriz {
    public static void main(String[] args){
        //Crear matriz e imprimir la visualización.
        int number[][] = new int[][]{
        {3,4,5,78}, 
        {0,0,0,0}, 
        {1,1,1,1},
        {6,6,6,-1} };
        for(int i = 0; i < 4; i++){
            System.out.print("{");
            for(int j = 0; j < 4; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
        //Mostrar mayor valor.
        int max = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                max = Math.max(max, number[i][j]);
            }
        }
        System.out.println("El mayor valor de la matriz es " + max);
        //Mostrar menor valor.
        int min = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                min = Math.min(min, number[i][j]);
            }
        }
        System.out.println("El menor valor de la matriz es " + min);
        //Imprimir valores de la primera y última fila.
        System.out.println("Valores de la primera línea:");
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(number[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Valores de la última línea:");
        for(int i = 3; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(number[i][j] + " ");
            }
        }
    }
}