/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

/**
 *
 * @author jorgegarcia
 */
public class Venta {

    public int id_venta;
    public String Fecha_venta;
    public float PrecioTotalVenta;
    public String folio;

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha_venta() {
        return Fecha_venta;
    }

    public void setFecha_venta(String Fecha_venta) {
        this.Fecha_venta = Fecha_venta;
    }

    public float getPrecioTotalVenta() {
        return PrecioTotalVenta;
    }

    public void setPrecioTotalVenta(float PrecioTotalVenta) {
        this.PrecioTotalVenta = PrecioTotalVenta;
    }

}
