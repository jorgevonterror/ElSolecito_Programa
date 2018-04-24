/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elsolecito_programa.Recargas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author El Armandito
 */
public class BaseDatos {
    private Connection conexion;
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
            consulta.execute("insert into BD_ElSolecito.recargas "
                    + "(Monto, NumeroTelefonico, Compania)" + 
                    "values('" + mTiempoAire.getMonto() +
                    "'," + "'" + mTiempoAire.getnumeroT() + "'," 
                    +"'" +mTiempoAire.getCompañia() + "');");
            return true;
        }catch(Exception e){
             e.printStackTrace();
            return false;
        }
    }
    public ArrayList consultarRecargas() {
        ArrayList mListaRecargas = new ArrayList();
        TiempoAire mTiempo = null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from recargas;");
            
            while (resultado.next()) {
                mTiempo = new TiempoAire();
                mTiempo.setMonto(resultado.getDouble("Monto"));
                mTiempo.setLada(resultado.getString("NumeroTelefonico"));
                mTiempo.setnumeroT(resultado.getString("NumeroTelefonico"));
                mTiempo.setCompañia(resultado.getString("Compania"));
                mListaRecargas.add(mTiempo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaRecargas;
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
