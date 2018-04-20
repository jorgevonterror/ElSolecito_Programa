/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.Producto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MARIA NOELDA MARIANO
 */
public class BaseDeDatos {
    private Connection conexion;
    ResultSet rs= null;
    Statement statement = null;
    
    public boolean conectar(){
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
    
    public boolean GuardarProducto(Producto mProducto)
    {
        Statement consulta;
        try
        {
            consulta = conexion.createStatement();
            consulta.execute("insert into productos (Codigo, Desc_producto, Nombre, Precio)" +
                    "values('" + mProducto.getCodigo() + "'," + "'" + mProducto.getDesc_Prod() + "'," + "'" + mProducto.getNombre() + "'," + "'" + mProducto.getPrecio() + "');");
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList ConsultarProductos()
    {
        ArrayList mListaProductos = new ArrayList();
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from productos;");
            
            while(resultado.next())
            {
                mProducto = new Producto();
                mProducto.setCodigo(resultado.getString("Codigo"));
                mProducto.setNombre(resultado.getString("Nombre"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("Precio")));
                mProducto.setDesc_Prod(resultado.getString("Desc_Producto"));
                
                mListaProductos.add(mProducto);
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return mListaProductos;
    }
    public boolean EliminarProducto(Producto mProducto)
    {
        Statement consulta;
        try
        {
            consulta = conexion.createStatement();
            consulta.execute("delete from productos " + " where Codigo = '" + mProducto.getCodigo() + "';");
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean ModificarProductos(Producto aProducto, Producto bProducto)
    {
        Statement consulta;
        try 
        {
            consulta = conexion.createStatement();
            consulta.execute("update productos set " + "Nombre ='" + bProducto.getNombre() + "Precio ='" + bProducto.getPrecio() + "Desc_prod ='" + bProducto.getDesc_Prod() + "'" + "where Codigo = '" + aProducto.getCodigo() + "';" );
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
