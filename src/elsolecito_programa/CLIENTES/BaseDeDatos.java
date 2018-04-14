package elsolecito_programa.CLIENTES;

import elsolecito_programa.CLIENTES.ClientesDeudores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
                    "jdbc:mysql://localhost:8889/BD_ElSolecito", "root", "root");
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
    
    public boolean GuardarClientes(ClientesDeudores mClientesDeudores){
        Statement consulta;
        try{
            consulta = conexion.createStatement();
            consulta.execute("INSERT INTO BD_ElSolecito.clientes (id_clientes, Nombre, Monto)" + 
                    "VALUES(null, '" + mClientesDeudores.getNombre() + "'," + "'" + mClientesDeudores.getMonto() + "');");
            return true;
        }catch(Exception e){
             e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList consultarClientes() {
        ArrayList mListaClientes = new ArrayList();
        ClientesDeudores mClientes = null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from clientes;");
            
            while (resultado.next()) {
                mClientes = new ClientesDeudores();
                mClientes.setNombre(resultado.getString("Nombre"));
                mClientes.setMonto(resultado.getInt("Monto"));
                mListaClientes.add(mClientes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaClientes;
    }
    
    public boolean eliminarClientes(ClientesDeudores mClientesDeudores) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from clientes " + " where folio = '" + mClientesDeudores.getFolio() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
