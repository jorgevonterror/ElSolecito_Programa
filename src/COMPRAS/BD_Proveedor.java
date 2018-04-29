/* 1. Distribucion de inventario en el local El Solecito.
    2. Omar Almaraz Cordova.
    3. Creacion 14/04/18.
    4. correcion de la clase base de datos en proveedores.
*/
package COMPRAS;
import elsolecito_programa.PROVEEDORES.*;
import elsolecito_programa.CLIENTES.ClientesDeudores;
import elsolecito_programa.PROVEEDORES.Proveedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
 /*
 * @author 8
 */
public class BD_Proveedor {
 
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
    
    public boolean GuardarProveedores(Proveedores mProveedores){
        Statement consulta;
        try{
            consulta = conexion.createStatement();
            consulta.execute("INSERT INTO BD_ElSolecito.provedorees (id_proveedor, Folio, Marca, Nombre)" + 
                    "VALUES(null, '" + mProveedores.getFolio() + "'," + "'" + mProveedores.getMarca() + "'," +"'" +mProveedores.getNombre() + "');");
            return true;
        }catch(Exception e){
             e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList consultarProveedores() {
        ArrayList mListaProveedores = new ArrayList();
        Proveedores mProveedores = null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from provedorees;");
            
            while (resultado.next()) {
                mProveedores = new Proveedores();
                mProveedores.setFolio(resultado.getString("Folio"));
                mProveedores.setMarca(resultado.getString("Marca"));
                mProveedores.setNombre(resultado.getString("Nombre"));
                mListaProveedores.add(mProveedores);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaProveedores;
    }
    
    public boolean eliminarProveedores(Proveedores mProveedores) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from provedorees " + " where folio = '" + mProveedores.getFolio() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean modificarProveedores(Proveedores aProveedores, Proveedores nProveedores) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("update provedorees set " + "nombre = '" + nProveedores.getNombre()+ "'," + "marca = '" + nProveedores.getMarca() + "'" + "WHERE folio = '" + aProveedores.getFolio()+ "';");
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
    public ArrayList ConsultarEspecifica(String nombre)
    {
        ArrayList mProveedores =  new ArrayList();
        Proveedores Proveedores_c = null;
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from provedorees where folio = '" + nombre + "';");
            
            while(resultado.next())
            {
                Proveedores_c = new Proveedores();
                Proveedores_c.setNombre(resultado.getString("Nombre"));
                Proveedores_c.setMarca(resultado.getString("Marca"));
                Proveedores_c.setFolio(resultado.getString("Folio"));
                
                mProveedores.add(Proveedores_c);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return mProveedores;
    }
}
