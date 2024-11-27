public class arrays_3 {
    public static void main(String[] args){
        //Arrays con los valores preestablecidos.
        String[] first = {"a","e","r","t","y","u"};
        int[] second = {1,2,3,4,5,6};
        //Total del número de celdas de los arrays anteriores.
        int total = first.length + second.length;
        //Array que tiene el total como el número de celdas.
        String[] third = new String[total];
        System.out.println("El tercer array tiene " + third.length + " celdas.");
    }
}