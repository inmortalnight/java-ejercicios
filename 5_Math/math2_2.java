/*Imprime las siguientes operaciones:
- Un número random
- Valor absoluto de -123
- Redondear 123.567
- Potencia de 2 elevado al 4
- El mayor entre 1e10 y 3e9. Tiene que ser float.
*/

public class math2_2 {
   public static void main( String args[] ) { 
      //Definir variables.
      int x; 
      double rand,y,z; 
      float max; 

      //Conseguir un número random.
      rand = Math.random(); 
      //Calcular valor absoluto de -123.
      x = Math.abs( -123 ); 
      //Redondear 123.567
      y = Math.round( 123.567 ); 
      //Potencia de 2^4
      z = Math.pow( 2,4 ); 
      //Conseguir el mayor entre 1e10 y 3e9
      max = Math.max( (float)1e10,(float)3e9 ); 

      //Imprimir resultados.
      System.out.println( rand ); 
      System.out.println( x ); 
      System.out.println( y ); 
      System.out.println( z ); 
      System.out.println( max ); 
   }   
}