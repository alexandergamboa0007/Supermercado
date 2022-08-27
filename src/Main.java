import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Funcionamiento del sistema
         */

        Factura laFactura = new Factura();
        Sucursal laSucursal[] = new Sucursal[1];
        for (int i = 0; i < laSucursal.length; i++) {
            laSucursal[i] =  new Sucursal("","",0);
            laSucursal[i].setNombreSucursal(JOptionPane.showInputDialog(null,"Ingrese el nombre de la sucursal"));
            laSucursal[i].setUbicacionSucursal(JOptionPane.showInputDialog(null,"Ingrese ubicacion de la sucursal"));
            laSucursal[i].setNumeroSucursal(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero de sucursal")));
            laSucursal[i].elSupervisor.setNombre(JOptionPane.showInputDialog(null,"Ingrese nombre del supervisor"));
            laSucursal[i].elEmpleado.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado"));

        }
        for (int i = 0; i < laSucursal.length; i++) {
            JOptionPane.showMessageDialog(null,"\n-------DATOS DEL SUPERMERCADO-------"+"\nSUCURSAL: "+laSucursal[i].getNombreSucursal()
            +"\nUBICACION: "+laSucursal[i].getUbicacionSucursal()+"\nNUMERO DE SUCURSAL: "+laSucursal[i].getNumeroSucursal()+"\nSUPERVISOR ENCARGADO: "+laSucursal[i].elSupervisor.getNombre()
            +"\nEMPLEADO ENCARGADO: "+laSucursal[i].elEmpleado.getNombre());

        }
        laFactura.compraSubtotal();
        laFactura.Total();

       Inventario elinventario [] = new Inventario[2];
        for (int i = 0; i < elinventario.length; i++) {
            elinventario[i]= new Inventario("",0,0,0.0);
            elinventario[i].setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del producto"));
            elinventario[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese codigo del producto")));
            elinventario[i].setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos")));
            elinventario[i].setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio del producto")));


        }
        for (int i = 0; i < elinventario.length; i++) {
            JOptionPane.showMessageDialog(null,"\n-------INVENTARIO-------"+"\nNombre producto: "+elinventario[i].getNombre()
            +"\nCodigo: "+elinventario[i].getCodigo()+"\nCantidad: "+elinventario[i].getCantidad()+"\nPrecio: "+elinventario[i].getPrecio());

        }
        int  codigoParaBuscar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo"));
        for (int i = 0; i < elinventario.length; i++) {
            if(codigoParaBuscar ==elinventario[i].getCodigo()){
                JOptionPane.showMessageDialog(null,"\n-------DESCRIPCION DEL PRODUCTO-------"+"\nNombre: "+elinventario[i].getNombre()+"\n" +
                        "\nCantidad: "+elinventario[i].getCantidad()+"\nPrecio: "+elinventario[i].getPrecio());

            }

        }




    }
}
