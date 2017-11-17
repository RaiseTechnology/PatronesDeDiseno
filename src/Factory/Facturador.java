/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

public class Facturador {

    public static Factura getFactura(String tipo) {

        if (tipo.equals("iva")) {

            return new FacturaIva();
        } else {
            return new FacturaIvaReducido();
        }

    }
}
