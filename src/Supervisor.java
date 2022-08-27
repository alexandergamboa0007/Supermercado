/**
 * Clase para los datos del supervisor
 */

public class Supervisor {
    /**
     * Atributo para el nombre del supervisor
     */
    private String nombre;
    /**
     * Atributo para el horario del supervisor
     */
    private String horario;
    /**
     * Atributo para el numero de sucursal en la que trabaja el supervisor
     */
    private int numeroSucursal;

    /**
     * <p>Constructor para la clase sucursal</p>
     * @param nombre
     * @param horario
     * @param numeroSucursal
     */

    public Supervisor(String nombre, String horario, int numeroSucursal) {
        this.nombre = nombre;
        this.horario = horario;
        this.numeroSucursal = numeroSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }
}
