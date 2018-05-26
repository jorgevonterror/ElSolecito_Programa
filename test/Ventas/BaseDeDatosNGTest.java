/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import elsolecito_programa.Producto.Producto;
import java.sql.Connection;
import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author jorgegarcia
 */
public class BaseDeDatosNGTest {

    public BaseDeDatosNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of conectar method, of class BaseDeDatos.
     */
//    @Test
//    public void testConectar() {
//        System.out.println("conectar");
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//        boolean result = instance.conectar();
//        assertEquals(result, expResult);
//    }
//    /**
//     * Test of conectarWindows method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConectarWindows() {
//        System.out.println("conectarWindows");
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.conectarWindows();
//        assertEquals(result, expResult);
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
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaEspecificaProducto method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaEspecificaProducto() {
//        System.out.println("ConsultaEspecificaProducto");
//        String codigo = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        Producto expResult = null;
//        Producto result = instance.ConsultaEspecificaProducto(codigo);
//        assertEquals(result, expResult);
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
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaTodaVenta method, of class BaseDeDatos.
//     */
    @Test
    public void testConsultaTodaVenta() {
        System.out.println("ConsultaTodaVenta");
        String folio = "001";
        BaseDeDatos instance = new BaseDeDatos();

        if (instance.conectar()) {
            Venta expResult = instance.ConsultaTodaVenta(folio);
            Venta result = instance.ConsultaTodaVenta(folio);
            expResult.equals(result);
        }

    }
//
//    /**
//     * Test of AltaDetalleVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testAltaDetalleVenta() {
//        System.out.println("AltaDetalleVenta");
//        DetalleVenta mDetalleVenta = new DetalleVenta();
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//
//        mDetalleVenta.setCantidad(100);
//        mDetalleVenta.setFolio("100");
//        mDetalleVenta.setId_detalleventa(1);
//        mDetalleVenta.setId_producto(1);
//        mDetalleVenta.setId_proveedor(1);
//        mDetalleVenta.setId_venta(1);
//        mDetalleVenta.setPagaPorCantidad(200);
//        mDetalleVenta.setPrecio(100);
//        mDetalleVenta.setProducto("Pepsi Pack");
//        mDetalleVenta.setTotalAPagar(220);
//        
//        if (instance.conectar()) {
//            boolean result = instance.AltaDetalleVenta(mDetalleVenta);
//            assertEquals(result, expResult);
//        }
//    }
//
//    /**
//     * Test of CambiosVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testCambiosVenta() {
//        System.out.println("CambiosVenta");
//        Venta mVenta = new Venta();
//        Venta nVenta = new Venta();
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//        
//        mVenta.setFecha_venta("2018/01/25");
//        mVenta.setFolio("001");
//        mVenta.setId_venta(1);
//        mVenta.setPrecioTotalVenta(100);
//        
//        nVenta.setFecha_venta("2018/01/30");
//        nVenta.setFolio("001");
//        nVenta.setId_venta(1);
//        nVenta.setPrecioTotalVenta(1000);
//        
//        if (instance.conectar()) {
//            boolean result = instance.CambiosVenta(mVenta, nVenta);
//            assertEquals(result, expResult);
//        }
//    }
//
//    /**
//     * Test of AltaVenta method, of class BaseDeDatos.
//     */
//    @Test
//    public void testAltaVenta() {
//        System.out.println("AltaVenta");
//        Venta mVenta = new Venta();
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//
//        mVenta.setFecha_venta("2018/01/25");
//        mVenta.setFolio("001");
//        mVenta.setId_venta(1);
//        mVenta.setPrecioTotalVenta(900);
//        
//        if (instance.conectar()) {
//            boolean result = instance.AltaVenta(mVenta);
//            assertEquals(result, expResult);
//        }
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
//        assertEquals(result, expResult);
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
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of VentasFecha method, of class BaseDeDatos.
//     */
//    @Test
//    public void testVentasFecha() {
//        System.out.println("VentasFecha");
//        String FechaInicio = "2018/01/25";
//        String FechaFinal = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        ArrayList expResult = null;
//        ArrayList result = instance.VentasFecha(FechaInicio, FechaFinal);
//        assertEquals(result, expResult);
//        
//    }

}
