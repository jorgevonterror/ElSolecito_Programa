/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import elsolecito_programa.Producto.Producto;
import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author El Armandito
 */
public class BaseDeDatosTest {
    
    public BaseDeDatosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class BaseDeDatos.
     */
//    @Test
//    public void testConectar() {
//        System.out.println("conectar");
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.conectar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of conectarWindows method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConectarWindows() {
//        System.out.println("conectarWindows");
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.conectarWindows();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of desconectar method, of class BaseDeDatos.
//     */
//    @Test
//    public void testDesconectar() {
//        System.out.println("desconectar");
//        BaseDeDatos instance = new BaseDeDatos();
//        instance.desconectar();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaTodoProducto method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaTodoProducto() {
//        System.out.println("ConsultaTodoProducto");
//        BaseDeDatos instance = new BaseDeDatos();
//        ArrayList expResult = null;
//        ArrayList result = instance.ConsultaTodoProducto();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ModificarProductos method, of class BaseDeDatos.
//     */
//    @Test
//    public void testModificarProductos() {
//        System.out.println("ModificarProductos");
//        Producto mProducto = null;
//        Producto nProducto = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.ModificarProductos(mProducto, nProducto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaTodaVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaTodaVenta() {
//        System.out.println("ConsultaTodaVenta");
//        String folio = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        Venta expResult = null;
//        Venta result = instance.ConsultaTodaVenta(folio);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of AltaDetalleVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testAltaDetalleVenta() {
//        System.out.println("AltaDetalleVenta");
//        Ventas.DetalleVenta mDetalleVenta = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.AltaDetalleVenta(mDetalleVenta);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CambiosVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testCambiosVenta() {
//        System.out.println("CambiosVenta");
//        Venta mVenta = null;
//        Venta nVenta = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.CambiosVenta(mVenta, nVenta);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of AltaVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testAltaVenta() {
//        System.out.println("AltaVenta");
//        Venta mVenta = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.AltaVenta(mVenta);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaIDVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaIDVenta() {
//        System.out.println("ConsultaIDVenta");
//        BaseDeDatos instance = new BaseDeDatos();
//        int expResult = 0;
//        int result = instance.ConsultaIDVenta();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of conectare method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConectare() {
//        System.out.println("conectare");
//        BaseDeDatos instance = new BaseDeDatos();
//        Connection expResult = null;
//        Connection result = instance.conectare();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of VentasFecha method, of class BaseDeDatos.
//     */
    @Test
    public void testVentasFecha() {
        System.out.println("VentasFecha");
        String FechaInicio = "";
        String FechaFinal = "";
        BaseDeDatos instance = new BaseDeDatos();
        //ArrayList expResult = null;
        //ArrayList result = instance.VentasFecha(FechaInicio, FechaFinal);
        //assertEquals(expResult, result);
         
        if (instance.conectar()) {
            ArrayList expRes = instance.VentasFecha(FechaInicio, FechaFinal);
            ArrayList resul = instance.VentasFecha(FechaInicio, FechaFinal);
            expRes.equals(resul);
            
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
