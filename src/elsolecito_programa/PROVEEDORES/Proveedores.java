/* 1. Distribucion de inventario en el local El Solecito.
    2. Omar Almaraz Cordova.
    3. Creacion 14/04/18.
    4. Creacion de la clase Proveedores..
*/
package elsolecito_programa.PROVEEDORES;
import javax.swing.JTextField;
/**
 *
 * @author 8
 */
public class Proveedores {
    private String marca;
    private String nombre;
    
    public Proveedores()
    {
        marca = "";
        nombre = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
