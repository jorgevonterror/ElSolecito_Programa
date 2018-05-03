/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import elsolecito_programa.PROVEEDORES.Proveedores;
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
    private Connection conexion;
    ResultSet rs= null;
    Statement statement = null;
    Proveedores proveedor = new Proveedores();
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/BD_ElSolecito", "root", "root"); //LA RUTA CAMBIA, YO LO HAGO EN MAC.
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
    
    public boolean GuardarCompras(Compras mCompras){
        Statement consulta;
        try{
            consulta = conexion.createStatement();
            consulta.execute("INSERT INTO BD_ElSolecito.compras (id_compras, folio, Fecha, TotalCompras)" + 
                    "VALUES(null, '" + mCompras.getFolio() + "','" + mCompras.getFecha()+ "'," + "'" + mCompras.getTotalCompras() + "');");
            return true;
        }catch(Exception e){
             e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList consultarCompras() {
        ArrayList mListaClientes = new ArrayList();
        Compras mCompras = null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from compras;");
            
            while (resultado.next()) {
                mCompras = new Compras();
                mCompras.setFolio(resultado.getString("Folio"));
                mCompras.setTotalCompras(resultado.getDouble("TotalCompras"));
                mCompras.setFecha(resultado.getString("Fecha"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaClientes;
    }
    
    public boolean eliminarCompras(Compras mCompras) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from compras " + " where folio = '" + mCompras.getFolio() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean modificarCompras(Compras aCompras, Compras nCompras) {
        Statement consulta;
        //Folio, Descripcion, cantidadProductos, fecha, precioUnitario
        try {
            consulta = conexion.createStatement();
            //consulta.execute("update compras set " + "descripcion= '" + nCompras.getDescripcion() + "'," + "monto = '" + nClientesDeudores.getMonto() + "'" + "WHERE folio = '" + aClientesDeudores.getFolio()+ "';");
            return true;
        } catch (Exception e) {
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
    public Producto ConsultarEspecifica(String codigo)
    {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from productos where Codigo = '" + codigo + "';");
            
            while(resultado.next())
            {
                mProducto = new Producto();
                mProducto.setCodigo(resultado.getString("Codigo"));
                mProducto.setNombre(resultado.getString("Nombre"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("Precio")));
                mProducto.setDesc_Prod(resultado.getString("Desc_Producto"));
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return mProducto;
    }
    
    public Producto consultarProducto(int Codigo) {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from productos where Codigo = '" + Codigo + "';");
            if (resultado.next()) {
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
    
    public boolean ModificarProductos(Producto aProducto, Producto bProducto)
    {
        Statement consulta;
        try 
        {
            consulta = conexion.createStatement();
            consulta.execute("update productos set " 
                    + "Desc_producto ='" + bProducto.getDesc_Prod() + "'," 
                    + "Nombre ='" + bProducto.getNombre() + "'," 
                    + "Precio =" + bProducto.getPrecio() 
                    + "where Codigo = '" + aProducto.getCodigo() + "';" );
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public Compras ConsultaTodaCompra(String folio) {
        Compras mCompra=null;
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from compras " +
                        "where folio = " + folio + ";");
            if (resultado.next()) {
                mCompra = new Compras();
                mCompra.setFecha(resultado.getString("fecha"));
                mCompra.setFecha(resultado.getString("folio"));
                mCompra.setTotalCompras(Float.parseFloat(resultado.getString("TotalCompras")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mCompra;
      }  
    
    public boolean AltaDetalleCompra(DetalleCompra mDetalleCompra) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into detalle_compra " + 
                        "(id_detalle, producto, cantidad, precio) " +
                        "values (null,'" + mDetalleCompra.getProducto()+ "','" 
                                        + mDetalleCompra.getCantidad()+ "','" 
                                        + mDetalleCompra.getPrecio() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
    }
    
    public ArrayList ConsultaTodoProveedor() {
        ArrayList mLista = new ArrayList();
        Proveedores mProveedor=null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from provedorees;");
            while (resultado.next()) {
                mProveedor = new Proveedores();
                mProveedor.setFolio(resultado.getString("Folio"));
                mProveedor.setMarca(resultado.getString("Marca"));
                mProveedor.setNombre(resultado.getString("Nombre"));
                mLista.add(mProveedor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mLista;
      }
    public Proveedores ConsultaProveedor(int codigo) {
        Proveedores mProveedor = null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from provedorees " +
                        "where codigo = " + codigo + ";");
            if (resultado.next()) {
                mProveedor = new Proveedores();
                mProveedor.setNombre(resultado.getString("Nombre"));             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return mProveedor;       
    }
    public boolean AltaCompra(Compras mCompra) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("INSERT INTO compras "  +
                        "VALUES(null, '" + mCompra.getFecha()+ "', '" 
                    + mCompra.getTotalCompras() + "', '" + mCompra.getFolio() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public int ConsultaFolioCompra() {
        ArrayList mLista = new ArrayList();
        Compras mCompra=null;
        Statement consulta;
        ResultSet resultado;
        int RegistroUltimo=0;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT MAX(id_compras) FROM compras;");
            while (resultado.next()) {
                RegistroUltimo = resultado.getInt("MAX(id_compras)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return RegistroUltimo;
      }
    
    public boolean CambiosCompra(Compras mCompra, Compras nCompra) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update compras set " + 
                        "TotalCompras = '" + nCompra.getTotalCompras() +"'," +
                        "folio = '"+ nCompra.getFolio() + "'" +" WHERE id_compras = '" + mCompra.getId_compras() + "';");          
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }     
 
    }
    public Proveedores ConsultaProveedor_Prueba(String folio) {
        Proveedores mProveedor = null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from provedorees.nombre " +
                        "where codigo = " + folio + ";");
            if (resultado.next()) {
                mProveedor = new Proveedores();
                mProveedor.setNombre(resultado.getString("Nombre"));             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return mProveedor;       
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
}
