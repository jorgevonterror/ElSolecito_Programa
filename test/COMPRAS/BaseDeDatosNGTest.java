/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMPRAS;

import elsolecito_programa.PROVEEDORES.Proveedores;
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
//        
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of desconectar method, of class BaseDeDatos.
     */
//    @Test
//    public void testDesconectar() {
//        System.out.println("desconectar");
//        BaseDeDatos instance = new BaseDeDatos();
//        instance.desconectar();
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of GuardarCompras method, of class BaseDeDatos.
     */
//    @Test
//    public void testGuardarCompras() {
//        System.out.println("GuardarCompras");
//        Compras mCompras = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//        boolean result = instance.GuardarCompras(mCompras);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

//    /**
//     * Test of consultarCompras method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultarCompras() {
//        System.out.println("consultarCompras");
//        BaseDeDatos instance = new BaseDeDatos();
//        ArrayList expResult = null;
//        ArrayList result = instance.consultarCompras();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of eliminarCompras method, of class BaseDeDatos.
//     */
//    @Test
//    public void testEliminarCompras() {
//        System.out.println("eliminarCompras");
//        Compras mCompras = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.eliminarCompras(mCompras);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of modificarCompras method, of class BaseDeDatos.
//     */
//    @Test
//    public void testModificarCompras() {
//        System.out.println("modificarCompras");
//        Compras aCompras = null;
//        Compras nCompras = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.modificarCompras(aCompras, nCompras);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultarProductos method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultarProductos() {
//        System.out.println("ConsultarProductos");
//        BaseDeDatos instance = new BaseDeDatos();
//        ArrayList expResult = null;
//        ArrayList result = instance.ConsultarProductos();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consultarProducto method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultarProducto() {
//        System.out.println("consultarProducto");
//        String ID = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        Producto expResult = null;
//        Producto result = instance.consultarProducto(ID);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultarEspecifica method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultarEspecifica() {
//        System.out.println("ConsultarEspecifica");
//        String codigo = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        Producto expResult = null;
//        Producto result = instance.ConsultarEspecifica(codigo);
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
//        Producto aProducto = null;
//        Producto bProducto = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.ModificarProductos(aProducto, bProducto);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaTodaCompra method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaTodaCompra() {
//        System.out.println("ConsultaTodaCompra");
//        String folio = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        Compras expResult = null;
//        Compras result = instance.ConsultaTodaCompra(folio);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of AltaDetalleCompra method, of class BaseDeDatos.
//     */
//    @Test
//    public void testAltaDetalleCompra() {
//        System.out.println("AltaDetalleCompra");
//        DetalleCompra mDetalleCompra = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.AltaDetalleCompra(mDetalleCompra);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaTodoProveedor method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaTodoProveedor() {
//        System.out.println("ConsultaTodoProveedor");
//        BaseDeDatos instance = new BaseDeDatos();
//        ArrayList expResult = null;
//        ArrayList result = instance.ConsultaTodoProveedor();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaProveedor method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaProveedor() {
//        System.out.println("ConsultaProveedor");
//        int codigo = 0;
//        BaseDeDatos instance = new BaseDeDatos();
//        Proveedores expResult = null;
//        Proveedores result = instance.ConsultaProveedor(codigo);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of AltaCompra method, of class BaseDeDatos.
//     */
//    @Test
//    public void testAltaCompra() {
//        System.out.println("AltaCompra");
//        Compras mCompra = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.AltaCompra(mCompra);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaFolioCompra method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaFolioCompra() {
//        System.out.println("ConsultaFolioCompra");
//        BaseDeDatos instance = new BaseDeDatos();
//        int expResult = 0;
//        int result = instance.ConsultaFolioCompra();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CambiosCompra method, of class BaseDeDatos.
//     */
//    @Test
//    public void testCambiosCompra() {
//        System.out.println("CambiosCompra");
//        Compras mCompra = null;
//        Compras nCompra = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.CambiosCompra(mCompra, nCompra);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultaProveedor_Prueba method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultaProveedor_Prueba() {
//        System.out.println("ConsultaProveedor_Prueba");
//        String folio = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        Proveedores expResult = null;
//        Proveedores result = instance.ConsultaProveedor_Prueba(folio);
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
}
