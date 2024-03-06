package cuenta;

/**
 * La clase CuentaDorantesGonzalezJoseAntonio2324T4 representa una cuenta
 * bancaria con funcionalidades básicas como asignar un nombre, obtener el
 * saldo, ingresar y retirar dinero, y obtener información sobre la cuenta.
 * 
 * @author Jose Antonio Dorantes Gonzalez
 */
public class CuentaDorantesGonzalezJoseAntonio2324T4 {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase
     * CuentaDorantesGonzalezJoseAntonio2324T4. Crea una instancia de cuenta con
     * valores por defecto.
     */
    
    public CuentaDorantesGonzalezJoseAntonio2324T4() {
    }

    /**
     * Constructor parametrizado de la clase
     * CuentaDorantesGonzalezJoseAntonio2324T4. Crea una instancia de cuenta con
     * los valores especificados.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tasa de interés de la cuenta.
     */
    
    public CuentaDorantesGonzalezJoseAntonio2324T4(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Asigna un nombre al titular de la cuenta.
     *
     * @param nom Nombre del titular de la cuenta.
     */
    
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad  Cantidad de dinero a ingresar.
     * @param concepto  Concepto o descripción de la operación.
     * @throws Exception Si la cantidad a ingresar es negativa.
     */
    
    public void ingresar(double cantidad, String concepto) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

     /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad  Cantidad de dinero a retirar.
     * @throws Exception Si la cantidad a retirar es negativa o si no hay suficiente saldo.
     */
    
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() <= cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

     /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre Nombre del titular de la cuenta.
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Número de cuenta.
     */
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    
    public double getSaldo() {
        return saldo;
    }

   /**
     * Establece el saldo actual de la cuenta.
     *
     * @param saldo Saldo actual de la cuenta.
     */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene la tasa de interés de la cuenta.
     *
     * @return Tasa de interés de la cuenta.
     */
    
    public double getTipoInteres() {
        return tipoInteres;
    }

     /**
     * Establece la tasa de interés de la cuenta.
     *
     * @param tipoInteres Tasa de interés de la cuenta.
     */
    
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    void ingresar(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
