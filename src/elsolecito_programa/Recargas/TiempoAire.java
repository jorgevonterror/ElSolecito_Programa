/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elsolecito_programa.Recargas;

/**
 *
 * @author El Armandito
 */
public class TiempoAire {
    private String Compañia;
    private double Monto;
    private String numeroT;
    
 public TiempoAire(){
        Compañia = "";
        Monto = 0;
        numeroT = "";
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String Compañia) {
        this.Compañia = Compañia;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    } 

    public String getnumeroT() {
        return numeroT;
    }

    public void setnumeroT(String numeroT) {
        this.numeroT = numeroT;
    }
}