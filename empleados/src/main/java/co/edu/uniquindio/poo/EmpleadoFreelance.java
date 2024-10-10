package co.edu.uniquindio.poo;

public abstract class EmpleadoFreelance extends Empleado {

    /*
     * Atributos de la clase
     */
    public int proyectosCompletados;
    public double pagoPorProyecto;

    /**
     * Constructor con los atributos de la clase
     *
     * @param nombre
     * @param id
     * @param proyectosCompletados
     * @param pagoPorProyecto
     */
    public EmpleadoFreelance(String nombre, String id, int proyectosCompletados, double pagoPorProyecto) {
        super(nombre, id);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    /*get
    * Metodo para obtener un dato
     */
    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    /*get
    * Metodo para obtener un dato
     */
    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "EmpleadoFreelance [proyectosCompletados=" + proyectosCompletados + ", pagoPorProyecto="
                + pagoPorProyecto + "]";
    }

}
