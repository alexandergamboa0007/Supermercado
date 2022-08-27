import javax.swing.*;

/**
 * Clase para los datos del inventario
 */

public class Inventario {
    /**
     * Atributo para el nombre del producto
     */
    private String nombre;
    /**
     * Atributo para el codigo del producto
     */
    private int codigo;
    /**
     * Atributo para la cantidad de productos
     */
    private int cantidad;
    /**
     * Atributo para el precio del producto
     */

    private double precio;

    /**
     * <p>Constructor para la clase inventario</p>
     * @param nombre
     * @param codigo
     * @param cantidad
     * @param precio
     */

    public Inventario(String nombre, int codigo, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}





















