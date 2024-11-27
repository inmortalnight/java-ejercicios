/*Para dos participantes, consigue dos números aleatorios que siga la siguiente fórmula 
(x*6)+0.5 siendo x el número. Asegúrate que sean números enteros y encuentra el mayor entre los dos.*/

public class math1_5 {
    public static void main(String[] args){
        System.out.println("Se presentan los participantes. A continuación, hará su lanzamiento el jugador 1");
        //Conseguir dos números aleatorios, hacer un cálculo y redondear el resultado a números enteros.
        double aux1 = (Math.random()*6)+0.5;
        double aux2 = (Math.random()*6)+0.5;
        double intento1 = Math.round(aux1);
        double intento2 = Math.round(aux2);
        int jugador1 = (int)intento1;
        int jugador2 = (int)intento2;
        //Imprimir los números, encontrar el mayor e informarlo.
        System.out.println("El jugador 1 ha sacado: " + jugador1 + " y el jugador 2 ha sacado" + jugador2);
        int ganador = Math.max(jugador1, jugador2);
        System.out.println("Quien sacó " + ganador + " es el ganador.");
    }
}