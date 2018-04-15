/* 1. Distribucion de inventario en el local El Solecito.
    2. Omar Almaraz Cordova.
    3. Creacion 14/04/18.
    4. Avance de la creacion de la clase base de datos para el catalogo de proveedores
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
    ResultSet res = null;
    Statement stat = null;
    
    public boolean conectar()
    {
        try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:8889/BD_ElSolecito", "root", "root");
                if (conexion != null) {
                return true;
                }
                else
                {
                return false;
                }
        }catch(Exception e){
                e.printStackTrace();
                return false;
        }
    }
    public void desconectar()
    {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public boolean GuardarProveedores(Proveedores mProveedores)
    {
        Statement consulta;
        try
        {
            consulta = conexion.createStatement();
            consulta.execute("INSERT INTO BD_ElSolecito.provedorees (id_proveedor, Marca, Nombre)" +
                    "VALUES(null, '" + mProveedores.getMarca() + "'," + "'" + mProveedores.getNombre() + "');");
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList ConsultarProveedores()
    {
        ArrayList mListaProveedores = new ArrayList();
        Proveedores mProveedores = null;
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from provedorees;");
            
            while(resultado.next())
            {
                mProveedores = new Proveedores();
                mProveedores.setMarca(resultado.getString("Marca"));
                mProveedores.setNombre(resultado.getString("Nombre"));
                mListaProveedores.add(mProveedores);
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return mListaProveedores;
    }
    public boolean EliminarProveedores(Proveedores mProveedores)
    {
        Statement consulta;
        try
        {
            consulta = conexion.createStatement();
            consulta.execute("delete from provedorees " + " where Marca = '" + mProveedores.getMarca() + "';");
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean ModificarProveedores(Proveedores aProveedores, Proveedores nProveedores)
    {
        Statement consulta;
        try 
        {
            consulta = conexion.createStatement();
            consulta.execute("update proveedores set " + "marca = '" + nProveedores.getMarca() + "'," + "nombre ='" + nProveedores.getNombre() + "';" );
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
}
