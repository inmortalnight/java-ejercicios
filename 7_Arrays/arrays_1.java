public class arrays_1 {
    public static void main(String[] args){
        //Crear array con números 1 al 10.
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        //Imprimir números del array en sentido inverso.
        for(int count = 9; count >= 0; count--){
            System.out.println(number[count]);
        }
    }
}