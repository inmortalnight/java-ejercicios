/*Consigue un número con un entero y 300 decimales. Luego divide el factor entre otro factor 
de 200 decimales redondeado hacia abajo. Añade otro factor con un decimal. Finalmente, consigue 
el factorial de e. Imprime el resultado por pantalla.*/

import java.math.BigDecimal;

public class math2_3 {
    public static void main( String args[] ) { 
        //Determinar variables.
        BigDecimal e; 
        BigDecimal factor; 
        //Definir los decimales a 300 y redondea hacia abajo los varibles.
        e = new BigDecimal( "1" ).setScale( 300, BigDecimal.ROUND_DOWN ); 
        factor = new BigDecimal( "1" ).setScale( 300, BigDecimal.ROUND_DOWN ); 
        //Se obtiene el factor al dividir.
        factor = factor.divide( new BigDecimal( 200 ), BigDecimal.ROUND_DOWN ); 
        factor = factor.add( new BigDecimal( 1 ) ); 
        //Se multiplica la expresión para obtener la potencia adecuada. 
        for( int i=1; i < 200; i++ ) {
            e = e.multiply( factor ); 
        }   
        //Imprimir resultado.
        System.out.println( e );   
    } 
}