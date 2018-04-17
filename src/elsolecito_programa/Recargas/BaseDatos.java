/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elsolecito_programa.Recargas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author El Armandito
 */
public class BaseDatos {
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
    
    public boolean GuardarRecarga(TiempoAire mTiempoAire){
        Statement consulta;
        try{
            consulta = conexion.createStatement();
            consulta.execute("INSERT INTO BD_ElSolecito.clientes (id_clientes, Nombre, Monto, folio)" + 
                    "VALUES(null, '" + mTiempoAire.getCompañia() + "'," + "'" + mTiempoAire.getnumeroT() + "'," +"'" +mTiempoAire.getMonto() + "');");
            return true;
        }catch(Exception e){
             e.printStackTrace();
            return false;
        }
    }
}
