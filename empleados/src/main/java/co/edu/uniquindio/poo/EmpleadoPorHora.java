package co.edu.uniquindio.poo;

public abstract class EmpleadoPorHora extends Empleado {

    /*
     * Atributos de la clase
     */
    public int horasTrabadas;
    public double salarioPorHora;
    public EmpleadoTiempoCompleto empleadoTiempoCompleto;

    /**
     * Constructor con los atributos de la clase
     *
     * @param nombre
     * @param id
     * @param horasTrabadas
     * @param salarioPorHora
     */
    public EmpleadoPorHora(String nombre, String id, int horasTrabadas, double salarioPorHora) {
        super(nombre, id);
        this.horasTrabadas = horasTrabadas;
        this.salarioPorHora = salarioPorHora;
    }

    /*get
    * Metodo para obtener un dato
     */
    public int getHorasTrabadas() {
        return horasTrabadas;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setHorasTrabadas(int horasTrabadas) {
        this.horasTrabadas = horasTrabadas;
    }

    /*get
    * Metodo para obtener un dato
     */
    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "EmpleadoPorHora [horasTrabadas=" + horasTrabadas + ", salarioPorHora=" + salarioPorHora + "]";
    }

    /*
     * Metodo para calcular pago por hora
     */
    @Override
    public void calcularPago() {
        operacion = (1500000 / 30) / 8;

    }

}
