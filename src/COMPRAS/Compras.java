/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import java.sql.Date;

/**
 *
 * @author jorgegarcia
 */
public class Compras {
    private int id_compras;
    private int id_provedor;
    private String folio;

    private String Fecha;   //Verificar si es el tipo de dato correcto.
    private double TotalCompras;


    
    public int getId_compras() {
        return id_compras;
    }

    public void setId_compras(int id_compras) {
        this.id_compras = id_compras;
    }

    public int getId_provedor() {
        return id_provedor;
    }

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getTotalCompras() {
        return TotalCompras;
    }

    public void setTotalCompras(double TotalCompras) {
        this.TotalCompras = TotalCompras;
    }
    
    
}
