/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.Producto;

/**
 *
 * @author MARIA NOELDA MARIANO
 */
public class Producto {
    private String id_proveedor;
    private int id_producto;
    private String Codigo;
    private String Desc_Prod;
    private String Nombre;
    private float Precio;
    private int cantidadProducto;

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Producto() {
        Codigo = "";
        Desc_Prod = "";
        Nombre = "";
        Precio = 0;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDesc_Prod() {
        return Desc_Prod;
    }

    public void setDesc_Prod(String Desc_Prod) {
        this.Desc_Prod = Desc_Prod;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    
    
    
    
}
