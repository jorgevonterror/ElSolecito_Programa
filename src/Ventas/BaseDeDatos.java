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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    public boolean conectarWindows() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/bd_elsolecito", "root", "");
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
                mProducto.setId_producto(resultado.getInt("id_producto"));
                mProducto.setCodigo(resultado.getString("Codigo"));
                mProducto.setNombre(resultado.getString("Nombre"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("Precio")));
                mProducto.setDesc_Prod(resultado.getString("Desc_Producto"));
                mProducto.setCantidadProducto(Integer.parseInt(resultado.getString("Cantidad")));
                mProducto.setId_proveedor(resultado.getString("id_proveedor"));

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
                mProducto.setId_producto(resultado.getInt("id_producto"));
                mProducto.setCodigo(resultado.getString("Codigo"));
                mProducto.setNombre(resultado.getString("Nombre"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("Precio")));
                mProducto.setDesc_Prod(resultado.getString("Desc_Producto"));
                mProducto.setId_proveedor(resultado.getString("id_proveedor"));
                mProducto.setCantidadProducto(Integer.parseInt(resultado.getString("cantidad")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mProducto;
    }

    public boolean ModificarProductos(Producto mProducto, Producto nProducto) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update productos set "
                    + "cantidad = '" + nProducto.getCantidadProducto() + "'"
                    + "where Codigo = '" + mProducto.getCodigo() + "';");
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
            consulta.execute("insert into detalle_venta "
                    + "(id_detalle_venta, Folio, Producto, Cantida, id_producto, Precio, PagaPorCantidad, TotalAPagar, id_venta, id_proveedor) "
                    + "values (null,'" + mDetalleVenta.getFolio() + "','"
                    + mDetalleVenta.getProducto() + "','"
                    + mDetalleVenta.getCantidad() + "','"
                    + mDetalleVenta.getId_producto() + "','"
                    + mDetalleVenta.getPrecio() + "','"
                    + mDetalleVenta.getPagaPorCantidad() + "','"
                    + mDetalleVenta.getTotalAPagar() + "','"
                    + mDetalleVenta.getId_venta() + "','"
                    + mDetalleVenta.getId_proveedor() + "');");
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
            consulta.execute("update ventas set "
                    + "Total = '" + nVenta.getPrecioTotalVenta() + "',"
                    + "folio = '" + nVenta.getFolio() + "'," + " Fecha = '" + nVenta.getFecha_venta() + "'"
                    + " WHERE folio = '" + mVenta.getFolio() + "';");
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
            consulta.execute("INSERT INTO ventas "
                    + "VALUES(null, '" + mVenta.getFecha_venta() + "', '"
                    + mVenta.getPrecioTotalVenta() + "', '" + mVenta.getFolio() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int ConsultaIDVenta() {
        ArrayList mLista = new ArrayList();
        Venta mVenta = null;
        Statement consulta;
        ResultSet resultado;
        int RegistroUltimo = 0;

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
    public String url = "jdbc:mysql://localhost:8889/BD_ElSolecito";
    public String user = "root";
    public String pass = "root";

    public Connection conectare() {
        Connection link = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }
        return link;
    }

public ArrayList VentasFecha(String FechaInicio, String FechaFinal) {
        Venta mVenta = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaVentas = new ArrayList();
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select sum(total), Fecha, Total from ventas where Fecha >= "
                    + "'" + FechaInicio + "' and fecha  <= '" + FechaFinal + "' group by Fecha;");
            while (resultado.next()) {
                mVenta = new Venta();
                mVenta.setFecha_venta(resultado.getString("fecha"));
                mVenta.setPrecioTotalVenta(resultado.getFloat("total"));
                mListaVentas.add(mVenta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaVentas;
    }

}
