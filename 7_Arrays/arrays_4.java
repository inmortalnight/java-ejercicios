public class arrays_4 {
    public static void main(String[] args){
        //Array con números del 1 al 57. Añadir identificador y contador de números pares.
        int[] numbers = new int[57];
        int even = 0;
        for(int count=0; count<57; count++){
            numbers[count] = count + 1;
            if(numbers[count]%2 == 0){
                even++;
            }
        }
        //Números pares del array.
        System.out.println("El array tiene " + even + " celdas con números pares.");
        //Números impares del array.
        System.out.println("El array tiene " + (numbers.length - even) + " celdas con números impares.");
    }
}