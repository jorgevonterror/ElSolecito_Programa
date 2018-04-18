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
    private String folio;
    
    public Proveedores()
    {
        folio = "";
        marca = "";
        nombre = "";
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
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
