/* 1. Distribucion de inventario en el local El Solecito.
    2. Omar Almaraz Cordova.
    3. Creacion 14/04/18.
    4. correcion de la clase base de datos en proveedores.
*/
package elsolecito_programa.PROVEEDORES;
import elsolecito_programa.PROVEEDORES.Proveedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
 /*
 * @author 8
 */
public class BaseDeDAtos {
 
    private Connection conexion;
    ResultSet rs= null;
    Statement statement = null;
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/bd_elsolecito", "", "");
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
            consulta.execute("INSERT INTO bd_elsolecito.provedorees (id_clientes, Folio, Marca, Nombre)" + 
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
            consulta.execute("update provedorees set " + "folio = '" + nProveedores.getFolio()+ "'," + "marca = '" + nProveedores.getMarca() + "'" + "WHERE folio = '" + aProveedores.getFolio()+ "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
