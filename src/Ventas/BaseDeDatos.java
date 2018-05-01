/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import elsolecito_programa.Producto.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jorgegarcia
 */
public class BaseDeDatos {

    Producto mProducto = new Producto();
    private Connection conexion;
    ResultSet rs = null;
    Statement statement = null;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/BD_ElSolecito", "root", "root");
            //conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_elsolecito", "root", "");
            if (conexion != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void desconectar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList ConsultaTodoProducto() {

        ArrayList mListaProducto = new ArrayList();
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from productos;");
            while (resultado.next()) {
                mProducto = new Producto();
                mProducto.setCodigo(resultado.getString("Codigo"));
                mProducto.setNombre(resultado.getString("Nombre"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("Precio")));
                mProducto.setDesc_Prod(resultado.getString("Desc_Producto"));

                mListaProducto.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaProducto;
    }

    public Producto ConsultaEspecificaProducto(String codigo) {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from productos where Codigo = '" + codigo + "';");

            while (resultado.next()) {
                mProducto = new Producto();
                mProducto.setCodigo(resultado.getString("Codigo"));
                mProducto.setNombre(resultado.getString("Nombre"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("Precio")));
                mProducto.setDesc_Prod(resultado.getString("Desc_Producto"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mProducto;
    }

    public boolean ModificarProductos(Producto aProducto, Producto bProducto) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update productos set "
                    + "Desc_producto ='" + bProducto.getDesc_Prod() + "',"
                    + "Nombre ='" + bProducto.getNombre() + "',"
                    + "Precio =" + bProducto.getPrecio()
                    + "where Codigo = '" + aProducto.getCodigo() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Venta ConsultaTodaVenta(String folio) {
        Venta mVenta = null;
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from ventas "
                    + "where folio = " + folio + ";");
            if (resultado.next()) {
                mVenta = new Venta();
                mVenta.setId_venta(resultado.getShort("folio"));
                mVenta.setFecha_venta(resultado.getString("Fecha"));
                mVenta.setPrecioTotalVenta(Float.parseFloat(resultado.getString("Total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mVenta;
    }
    
    public boolean AltaDetalleVenta(DetalleVenta mDetalleVenta) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into detalle_venta " + 
                        "(id_detalle_venta, Cantida, Precio, id_producto, id_venta) " +
                        "values (null,'" + mDetalleVenta.getCantidad() + "','" 
                                        + mDetalleVenta.getPrecio() + "','" 
                                        + mDetalleVenta.getProducto_id_Producto() + "','"
                                        + mDetalleVenta.getVenta_id_Venta() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    } 
    public boolean CambiosVenta(Venta mVenta, Venta nVenta) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update ventas set " + 
                        "Total = '" + nVenta.getPrecioTotalVenta() +"'," +
                        "folio = '" + nVenta.getFolio() + "'," +" Fecha = '" + nVenta.getFecha_venta()+ "'"
                                +" WHERE folio = '" + mProducto.getCodigo() + "';");  
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }     
    } 
    public boolean AltaVenta(Venta mVenta) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("INSERT INTO ventas "  +
                        "VALUES(null, '" + mVenta.getFecha_venta() + "', '" 
                    + mVenta.getPrecioTotalVenta() + "', '" + mVenta.getFolio() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public int ConsultaIDVenta() {
        ArrayList mLista = new ArrayList();
        Venta mVenta=null;
        Statement consulta;
        ResultSet resultado;
        int RegistroUltimo=0;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT MAX(id_venta) FROM ventas;");
            while (resultado.next()) {
                RegistroUltimo = resultado.getInt("MAX(id_venta)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return RegistroUltimo;
      }
}
