//Simular el saldo de una cuenta bancaria y cambiar el importe según el flujo de datos.
public class OperadoresAsignacion {
    public static void main(String[] args) {
        //Crear e imprimir saldo = 100.50 euros
        Double saldo = 100.50;
        System.out.println("Su saldo: " + saldo + " euros");
        //Saldo + abono de 27.5
        saldo = saldo + 27.5;
        //Promoción bancaria, saldo*2
        saldo = saldo*2;
        //Avería, -saldo/2
        saldo = saldo/2;
        //Ingreso 250.38
        saldo = saldo + 250.38;
        //Compra -55.37
        saldo = saldo - 55.37;
        //Abono nómina, 1200.96
        saldo = saldo + 1200.96;
        //Imprimir saldo.
        System.out.println("Saldo actual: " + saldo);
        //Cena, -85.23
        saldo = saldo - 85.23;
        //Imprimir saldo.
        System.out.println("Saldo actual: " + saldo);
    }
}