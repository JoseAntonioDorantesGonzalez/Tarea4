package cuenta;

public class Main {

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

    private static void ingresaDineroDorantesGonzalezJoseAntonio(int x, CuentaDorantesGonzalezJoseAntonio2324T4 miCuentaDorantesGonzalezJoseAntonio2324T4) {
        try {

            System.out.println("Ingreso en cuenta de " + x + "€");
            miCuentaDorantesGonzalezJoseAntonio2324T4.ingresar(x, (ERROR));
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private static void retiraDineroDorantesGonzalezJoseAntonio(int x, CuentaDorantesGonzalezJoseAntonio2324T4 miCuentaDorantesGonzalezJoseAntonio2324T4) {
        try {
            System.out.println("Retirada en cuenta de " + x + "€");
            miCuentaDorantesGonzalezJoseAntonio2324T4.retirar(x);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }

}
