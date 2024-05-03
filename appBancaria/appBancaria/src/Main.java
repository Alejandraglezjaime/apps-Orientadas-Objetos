import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Newt";
        String tipoDeCuenta = "Debito";
        double saldo = 3550.00;
        int opcion=0;

        System.out.println("*************************************");
        System.out.println("\nCliente"+nombre);
        System.out.println("Tipo de cuenta : tarjeta de "+tipoDeCuenta);
        System.out.println("Su saldo disponible es: "+saldo+"$");
        System.out.println("\n*************************************");

        String menu = """
                *** Escriba el número de la opción deseada:
                1.- Consultar saldo
                2.- Retirar
                3.- Depositar
                9.- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Su saldo es : "+saldo+"$");
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    double valorARetirar = teclado.nextDouble();
                    if(valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("Tome su dinero");
                        System.out.println("Su saldo final es : "+saldo+"$");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Su saldo es: "+saldo+"$");
                    break;
                case 9:
                    System.out.println("NO OLVIDE RETIRAR SU TARJETA");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }


        }
    }
}