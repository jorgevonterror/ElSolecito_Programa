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
public class DetalleVenta {
    public int id_detalleventa;
    public float cantidad;
    public float precio;
    public String folio;
    public int id_producto;
    public int id_venta;
    public int id_proveedor;
    public float PagaPorCantidad;
    public float TotalAPagar;
    public String Producto;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public float getPagaPorCantidad() {
        return PagaPorCantidad;
    }

    public void setPagaPorCantidad(float PagaPorCantidad) {
        this.PagaPorCantidad = PagaPorCantidad;
    }

    public float getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(float TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }
    public int producto_id_Producto;
    public int venta_id_Venta;

    public int getId_detalleventa() {
        return id_detalleventa;
    }

    public void setId_detalleventa(int id_detalleventa) {
        this.id_detalleventa = id_detalleventa;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getProducto_id_Producto() {
        return producto_id_Producto;
    }

    public void setProducto_id_Producto(int producto_id_Producto) {
        this.producto_id_Producto = producto_id_Producto;
    }

    public int getVenta_id_Venta() {
        return venta_id_Venta;
    }

    public void setVenta_id_Venta(int venta_id_Venta) {
        this.venta_id_Venta = venta_id_Venta;
    }
    
    
}
