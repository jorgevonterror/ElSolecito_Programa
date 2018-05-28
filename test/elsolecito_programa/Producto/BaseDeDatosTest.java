/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.Producto;

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
//     * Test of GuardarProducto method, of class BaseDeDatos.
//     */
//    @Test
//    public void testGuardarProducto() {
//        System.out.println("GuardarProducto");
//        Producto mProducto = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.GuardarProducto(mProducto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of ConsultarProductos method, of class BaseDeDatos.
     */
    @Test
    public void testConsultarProductos() {
        System.out.println("ConsultarProductos");
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList expResult = null;
        ArrayList result = instance.ConsultarProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of ConsultarEspecifica method, of class BaseDeDatos.
     */
//    @Test
//    public void testConsultarEspecifica() {
//        System.out.println("ConsultarEspecifica");
//        String Codigo = "";
//        BaseDeDatos instance = new BaseDeDatos();
//        ArrayList expResult = null;
//        ArrayList result = instance.ConsultarEspecifica(Codigo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of EliminarProducto method, of class BaseDeDatos.
//     */
//    @Test
//    public void testEliminarProducto() {
//        System.out.println("EliminarProducto");
//        Producto mProducto = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.EliminarProducto(mProducto);
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
//        Producto aProducto = null;
//        Producto bProducto = null;
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = false;
//        boolean result = instance.ModificarProductos(aProducto, bProducto);
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
    
}
