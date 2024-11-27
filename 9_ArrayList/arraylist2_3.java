
package arraylist1;
import java.util.*;

public class arraylist3 {
    public static void main(String[] args){
        //Definir arraylist, establecer la condición de salida del bucle 6, iniciar scanner.
        ArrayList<String> list = new ArrayList<String>();
        boolean salida = false;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        //Muestra continuamente menu hasta elegir la opcion 6 para salir.
        while(salida == false){
            //Mostrar menu
            System.out.println("Empieza la lista de empleados...");
            System.out.println("1. Agregar Nombres.");
            System.out.println("2. Modificar nombre.");
            System.out.println("3. Borrar Nombres.");
            System.out.println("4. Visualizar un Nombre.");
            System.out.println("5. Visualizar todos Nombres.");
            System.out.println("6. Salir.");
            System.out.print("Elija una opción: ");
            int select = input1.nextInt();
            //Opcion1 Pedir por pantalla cantidad de nombres a introducir, preguntar los valores según cantidad.
            if(select == 1){
                System.out.print("Introduzca la cantidad de nombres a introducir: ");
                    int size = input1.nextInt();
                    for(int i = 0; i < size+1; i++){
                        String name = input1.nextLine();
                        list.add(name);
                    }
                    //BUG: al crearse el arraylist, existe ya un elemento en el arraylist, borrar.
                    list.remove(0);
                    System.out.println(list);
            } //Opcion2 Modificar datos, preguntar por nombre.
            else if(select == 2){
                System.out.print("Introduzca un nombre de la lista a cambiar: ");
                String name1 = input2.nextLine();
                int index = list.indexOf(name1);
                System.out.print("Nuevo nombre: ");
                String name2 = input2.nextLine();
                list.set(index, name2);
                System.out.println(list);
            } //Opcion3 Borrar por posición o nombre, preguntar por pantalla.
            else if(select == 3){
                System.out.print("Elija una opción de borrado 1.posición o 2.nombre: ");
                int election = input1.nextInt();
                if(election == 1){
                    System.out.print("Introduzca una posición de la lista para borrar: ");
                    int position = input1.nextInt();
                    list.remove(position - 1);
                    System.out.println(list);
                } else if(election == 2){
                    System.out.print("Introduzca un nombre de la lista para borrar: ");
                    String name = input2.nextLine();
                    list.remove(name);
                    System.out.println(list);
                } else {
                    System.out.println("Opción no válida.");
                }
            } //Opcion4 Mostrar valor según posición, asegurarse de que exista la posición.
            else if(select == 4){
                boolean run = true;
                while(run == true){
                    System.out.print("Introduzca una posición de la lista: ");
                    int position = input1.nextInt();
                    if(position <= list.size()){
                        System.out.println(list.get(position - 1));
                        run = false;
                    } else {
                        System.out.println("La posición no existe. Intenta de nuevo.");
                    }
                }
            } //Opcion5 Mostrar arraylist completo.
            else if(select == 5){
                System.out.println(list);
            } //Opcion6 Salida
            else if(select == 6){
                System.out.println("Fin del programa.");
                salida = true;
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
        input1.close();
        input2.close();
    }
}