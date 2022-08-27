import javax.swing.*;

/**
 * Clase para los datos de la factura
 */

public class Factura {
    /**
     * Atributo para guardar el subtotal del precio
     */
    private double Subtotal;
    /**
     * Atributo para la cantidad de productos a comprar
     */
    private int cantidad;
    /**
     * Atributo para precio del producto
     */
    private double precio;
    /**
     * Atributo para pago del producto
     */
    private double pago;

    /**
     * Constructor para datos la compra y el subtotal del pago
     */

    public void compraSubtotal(){
        int opcion;
        do {

            precio = Double.parseDouble(JOptionPane.showInputDialog("cual es el precio del producto"));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades desea comprar"));
            pago = precio * cantidad;
            JOptionPane.showMessageDialog(null, "Precio: " + precio + "\ncantidad: " + cantidad +
                    "\nCantidad a pagar: " + pago);
            opcion = Integer.parseInt(JOptionPane.showInputDialog("desea seguir comprando?"
                    + "\n 1. si"
                    + "\n 2. no"));
            Subtotal = Subtotal + pago;
        }while (opcion!=2);
        JOptionPane.showMessageDialog(null,"Subtotal: \n"+Subtotal);
        }

    /**
     * Constructor para los datos finales de la compra y el total del pago
     */
    public void Total(){
        double Total=0,Descuento=0,Impuesto=0;
        Impuesto=Subtotal*0.18;
        Total=Subtotal+Impuesto;
        if(Total>1000){
            Descuento=Total*0.05;

        }
        else {
            if(Total>2500){
                Descuento=Total*0.08;
            }
            if(Total>5000){
                Descuento=Total*0.1;
            }
        }
        JOptionPane.showMessageDialog(null,"Subtotal: "+Subtotal+
                "\nImpuesto:  "+Impuesto+"\nDescuento: "+Descuento+"\nTotal: "+(Total-Descuento));
        }

    }





