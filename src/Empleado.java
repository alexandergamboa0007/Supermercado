/**
 *Clase para los datos del empleado
 */
public class Empleado {
    /**
     * Atributo para el nombre del empleado
     */
    private String nombre;
    /**
     * Atributo para la cedula del empleado
     */
    private int cedula;
    /**
     * Atributo para el codigo del trabajador
     */
    private  int  codTrabajador;
    /**
     * Atributo para horario del trabajador
     */
    private String horario;

    /**
     * <p>Constructor para la clase empleado</p>
     * @param nombre
     * @param cedula
     * @param codTrabajador
     * @param horario
     */

    public Empleado(String nombre, int cedula, int codTrabajador, String horario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codTrabajador = codTrabajador;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodTrabajador() {
        return codTrabajador;
    }

    public void setCodTrabajador(int codTrabajador) {
        this.codTrabajador = codTrabajador;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
