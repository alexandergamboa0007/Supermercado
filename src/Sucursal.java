/**
 * Clase para los datos de la sucursal
 * @author GamboaRivera
 */
public class Sucursal {
    /**
     * Atributo para el nombre de la sucursal
     */
    private String nombreSucursal;
    /**
     * Atributo para la ubicacion de la sucursal
     */
    private String ubicacionSucursal;
    /**
     * Atributo para el numero de sucursales en el pais
     */
    private int numeroSucursal;
    /**
     * Atributo para los datos del empleado
     */

    public Empleado elEmpleado;
    /**
     * Atributo para datos de los productos
     */

    public Inventario elInventario;
    /**
     * Atributo para datos de la factura
     */

    public Factura laFactura;
    /**
     * Atributo para datos del supervisor
     */

    public Supervisor elSupervisor;

    /**
     * <p>Constructor para la clase sucursal</p>
     * @param nombreSucursal
     * @param ubicacionSucursal
     * @param numeroSucursal
     */
    public Sucursal(String nombreSucursal, String ubicacionSucursal, int numeroSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.ubicacionSucursal = ubicacionSucursal;
        this.numeroSucursal = numeroSucursal;
        this.elEmpleado = new Empleado("",0,0,"");
        this.elInventario = new Inventario("",0,0,0.0);
        this.laFactura = new Factura();
        this.elSupervisor = new Supervisor("","",0);
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getUbicacionSucursal() {
        return ubicacionSucursal;
    }

    public void setUbicacionSucursal(String ubicacionSucursal) {
        this.ubicacionSucursal = ubicacionSucursal;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }
}

