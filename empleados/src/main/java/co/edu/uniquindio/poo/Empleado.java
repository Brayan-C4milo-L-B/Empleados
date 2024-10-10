package co.edu.uniquindio.poo;

public abstract class Empleado {

    /*¨
     * Atributos de la clase
     */
    public String nombre, id;

    /**
     * Constructor con los atributos de la clase
     *
     * @param nombre
     * @param id
     */
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    /*get
    * Metodo para obtener un dato
     */
    public String getNombre() {
        return nombre;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*get
    * Metodo para obtener un dato
     */
    public String getId() {
        return id;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setId(String id) {
        this.id = id;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", id=" + id + "]";
    }

    /*
     * Metodo para calcular salario
     */
    public abstract void calcularPago();

}
