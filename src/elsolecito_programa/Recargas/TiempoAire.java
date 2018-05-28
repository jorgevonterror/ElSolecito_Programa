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
    private String Compania;
    private double Monto;
    private String numeroT,Lada;
    
 public TiempoAire(){
        Compania = "";
        Lada = "";
        Monto = 0;
        numeroT = "";
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String Compania) {
        this.Compania = Compania;
    }
     public String getLada() {
        return Lada;
    }

    public void setLada(String Lada) {
        this.Lada = Lada;
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
