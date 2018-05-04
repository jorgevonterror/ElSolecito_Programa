/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.Producto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIA NOELDA MARIANO
 */
public class BaseDeDatos {

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

    public boolean GuardarProducto(Producto mProducto) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into BD_ElSolecito.productos (id_producto, Desc_producto, Codigo , Nombre, Precio, cantidad)"
                    +"values(null,'" + mProducto.getDesc_Prod() + "',"
                    + "'" + mProducto.getCodigo() + "',"
                    + "'" + mProducto.getNombre() + "',"
                    + "'" + mProducto.getPrecio() + "'," 
                    + "'" + mProducto.getCantidadProducto()+"');");
            //consulta.execute("INSERT into BD_ElSolecito.existencia(id_existencia, id_producto, cantidad)" + "values (null,'" + mProducto.getId_producto() +"', 0);");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList ConsultarProductos() {
        ArrayList mListaProductos = new ArrayList();
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
                
                mListaProductos.add(mProducto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaProductos;
    }

    public ArrayList ConsultarEspecifica(String Codigo) {
        ArrayList mListaProductos = new ArrayList();
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from productos where codigo = '" + Codigo + "';");

            while (resultado.next()) {
                mProducto = new Producto();
                mProducto.setId_producto(resultado.getInt("id_producto"));
                mProducto.setCodigo(resultado.getString("Codigo"));
                mProducto.setNombre(resultado.getString("Nombre"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("Precio")));
                mProducto.setDesc_Prod(resultado.getString("Desc_Producto"));
                mProducto.setCantidadProducto(Integer.parseInt(resultado.getString("Cantidad")));
                
                mListaProductos.add(mProducto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaProductos;
    }

    public boolean EliminarProducto(Producto mProducto) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from productos " + " where Codigo = '" + mProducto.getCodigo() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean ModificarProductos(Producto aProducto, Producto bProducto) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update productos set "
                    + "Desc_producto ='" + bProducto.getDesc_Prod() + "',"
                    + "Nombre ='" + bProducto.getNombre() + "',"
                    + "Precio ='" + bProducto.getPrecio() + "',"
                    + "cantidad ='" + bProducto.getCantidadProducto() + "'"
                    + "where Codigo = '" + aProducto.getCodigo() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //PARA GENERAR LOS REPORTES:

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
}
