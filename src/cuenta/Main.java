package cuenta;

/**
 * Clase main del programa, que define un objeto cuenta bancaria con unos
 * parámetros y realiza acciones de ingresar y retirar dinero de dicha cuenta.
 *
 * @author Jose Antonio Dorantes Gonzalez
 */
public class Main {

    /**
     * Método main.
     *
     * Este método es el principal de ejecución del programa. Crea una cuenta
     * bancaria, realiza algunas operaciones de ingreso y retiro de dinero, y
     * muestra el saldo actual de la cuenta.
     *
     */
    public static void main(String[] args) {
        CuentaDorantesGonzalezJoseAntonio2324T4 miCuentaDorantesGonzalezJoseAntonio2324T4;
        double saldoActual;
        int x;

        miCuentaDorantesGonzalezJoseAntonio2324T4 = new CuentaDorantesGonzalezJoseAntonio2324T4("Antonio Sánchez", "ES55-3058-2365-8522-1234-5678", 2500, 0);
        System.out.println("Saldo inicial de la cuenta: " + miCuentaDorantesGonzalezJoseAntonio2324T4.estado() + "€");

        x = 1500;               //Declaración dinero a retirar

        retiraDineroDorantesGonzalezJoseAntonio(x, miCuentaDorantesGonzalezJoseAntonio2324T4);

        x = 100;                //Declaración dinero a ingresar
        ingresaDineroDorantesGonzalezJoseAntonio(x, miCuentaDorantesGonzalezJoseAntonio2324T4);

        saldoActual = miCuentaDorantesGonzalezJoseAntonio2324T4.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
     * Método ingresaDineroDorantesGonzalezJoseAntonio.
     *
     * En este método se va a realizar la acción de ingresar cierta cantidad de
     * dinero en la cuenta bancaria.
     *
     * @param x Cantidad de dinero a ingresar.
     * @param miCuentaDorantesGonzalezJoseAntonio2324T4 La cuenta bancaria en la
     * que se realizará el ingreso.
     */
    private static void ingresaDineroDorantesGonzalezJoseAntonio(int x, CuentaDorantesGonzalezJoseAntonio2324T4 miCuentaDorantesGonzalezJoseAntonio2324T4) {
        try {

            System.out.println("Ingreso en cuenta de " + x + "€");
            miCuentaDorantesGonzalezJoseAntonio2324T4.ingresar(x);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     * Método retiraDineroDorantesGonzalezJoseAntonio.
     *
     * En este método se va a realizar la acción de retirar cierta cantidad de
     * dinero de la cuenta bancaria.
     *
     * @param x Cantidad de dinero a retirar.
     * @param miCuentaDorantesGonzalezJoseAntonio2324T4 La cuenta bancaria de la
     * que se retirará el dinero.
     */
    private static void retiraDineroDorantesGonzalezJoseAntonio(int x, CuentaDorantesGonzalezJoseAntonio2324T4 miCuentaDorantesGonzalezJoseAntonio2324T4) {
        try {
            System.out.println("Retirada en cuenta de " + x + "€");
            miCuentaDorantesGonzalezJoseAntonio2324T4.retirar(x);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }

}
