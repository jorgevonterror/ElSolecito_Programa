/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMPRAS;

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
    private Connection conexion;
    ResultSet rs= null;
    Statement statement = null;
    
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
            consulta.execute("INSERT INTO BD_ElSolecito.compras (id_compras, folio, descripcion, cantidadProductos, Fecha, TotalCompras, id_provedor)" + 
                    "VALUES(null, '" + mCompras.getId_compras() + "'," + "'" + mCompras.getFolio() + "'," + "'" + mCompras.getDescripcion() + "'," +"'" + mCompras.getCantidadProductos() + "'," 
                            + "'"+ mCompras.getFecha()+ "'," + "'" + mCompras.getTotalCompras() + "',"+ "'" + mCompras.getId_provedor() + "');");
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
                mCompras.setDescripcion(resultado.getString("Descripcion"));
                mCompras.setCantidadProductos(resultado.getInt("Cantidad Productos"));
                mCompras.setFecha(resultado.getDate("Fecha"));
                mCompras.setPrecioUnitario(resultado.getFloat("Precio Unitario"));
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
            consulta.execute("update compras set " + "descripcion= '" + nCompras.getDescripcion() + "'," + "monto = '" + nClientesDeudores.getMonto() + "'" + "WHERE folio = '" + aClientesDeudores.getFolio()+ "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
