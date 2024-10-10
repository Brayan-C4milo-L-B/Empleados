package co.edu.uniquindio.poo;

public abstract class EmpleadoTiempoCompleto extends Empleado {

    /*
     * Atributos de la clase
     */
    public double salario;

    /**
     * Constructor con los atrubutos de la clase
     *
     * @param nombre
     * @param id
     * @param salario
     */
    public EmpleadoTiempoCompleto(String nombre, String id, double salario) {
        super(nombre, id);
        this.salario = salario;
    }

    /*get
    * Metodo para obtener un dato
     */
    public double getSalario() {
        return salario;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [salario=" + salario + "]";
    }

    /*
     * Metodo para mostrar el salario del empleado a tiempo completo
     */
    @Override
    public void calcularPago() {
        System.out.println("Salario $1.300.000");
    }

}
