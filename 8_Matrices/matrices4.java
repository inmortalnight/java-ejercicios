import java.util.Arrays;

public class matrices4 {
    public static void main(String[] args){ 
        //Declaración de variables.
        int matrix[][] = new int[3][3];
        int random;
        //Generar matriz con números sin repetirse.
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                boolean exits;
                int search;
                //Seguir generando números hasta que sea el único mismo valor existente.
                do {
                    random = (int)Math.floor(Math.random()*(10-0+1)+0);
                    exits = false;
                    //Comprobar si el número existe en la matriz.
                    for(int x = 0; x < 3; x++){
                        for(int y = 0; y < 3; y++){
                            if(random == matrix[x][y]){
                                exits = true;
                            }
                        }
                        search = Arrays.binarySearch(matrix[x], random);
                    }
                    
                } while (exits);
                //Guardar valor e imprimir.
                matrix[i][j] = random;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}