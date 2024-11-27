package arraylist2;
import java.util.*;

public class arraylist3 {
    public static void main(String[] args){
        //Crear arraylist para una lista de asignaturas, iniciar scanner.
        ArrayList<String> list = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        //Añadir nuevos valores por pantalla.
        boolean out = false;
        while(out == false){
            System.out.println("Introduzca asignaturas hasta escribir (salir):");
            String subject = input.nextLine();
            if(subject.equals("salir")){
                out = true;
            } else {
                list.add(subject);
            }
        }
        //Mostrar valores.
        System.out.println("Lista de asignaturas: " + list);
        //Buscar valores por nombre.
        System.out.println("Puedes buscar si existe una asignatura en la lista. Introduzca la asignatura: ");
        String subject = input.nextLine();
        if(list.contains(subject) == true){
            System.out.println("La asignatura " + subject + " existe en la lista.");
        } else {
            System.out.println("La asignatura " + subject + " no existe en la lista.");
        }
        input.close();
    }
}
