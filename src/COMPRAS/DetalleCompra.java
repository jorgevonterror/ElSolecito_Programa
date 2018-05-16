/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMPRAS;

/**
 *
 * @author jorgegarcia
 */
public class DetalleCompra {
    private int id_detalle;
    private String Folio;

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
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
    private String producto;
    private float cantidad;
    private float precio;
    private float PagaPorCantidad;
    private float TotalAPagar;
    private int id_producto;
    private int id_proveedor;
    private int id_compras;

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
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

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_compras() {
        return id_compras;
    }

    public void setId_compras(int id_compras) {
        this.id_compras = id_compras;
    }
    
    
}
