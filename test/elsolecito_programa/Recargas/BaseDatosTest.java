/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.Recargas;


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
public class BaseDatosTest {
    
    public BaseDatosTest() {
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
     * Test of conectar method, of class BaseDatos.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        BaseDatos instance = new BaseDatos();
        boolean expResult = false;
        boolean result = instance.conectar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class BaseDatos.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        BaseDatos instance = new BaseDatos();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarRecarga method, of class BaseDatos.
     */
    @Test
    public void testGuardarRecarga() {
        System.out.println("GuardarRecarga");
        TiempoAire mTiempoAire = null;
        BaseDatos instance = new BaseDatos();
        boolean expResult = false;
        boolean result = instance.GuardarRecarga(mTiempoAire);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarRecargas method, of class BaseDatos.
     */
    @Test
    public void testConsultarRecargas() {
        System.out.println("consultarRecargas");
        BaseDatos instance = new BaseDatos();
        ArrayList expResult = null;
        ArrayList result = instance.consultarRecargas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectare method, of class BaseDatos.
     */
    @Test
    public void testConectare() {
        System.out.println("conectare");
        BaseDatos instance = new BaseDatos();
        Connection expResult = null;
        Connection result = instance.conectare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectar method, of class BaseDatos.
     */
//    @Test
//    public void testConectar() {
//        System.out.println("conectar");
//        BaseDatos instance = new BaseDatos();
//        boolean expResult = false;
//        boolean result = instance.conectar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of desconectar method, of class BaseDatos.
//     */
//    @Test
//    public void testDesconectar() {
//        System.out.println("desconectar");
//        BaseDatos instance = new BaseDatos();
//        instance.desconectar();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of GuardarRecarga method, of class BaseDatos.
     */
//    @Test
//    public void testGuardarRecarga() {
//        System.out.println("GuardarRecarga");
//        BaseDatos instance = new BaseDatos();
//        boolean expResult = true;
//        TiempoAire mTiempoAire = new TiempoAire();
//        
//        mTiempoAire.setMonto(50);
//        mTiempoAire.setnumeroT("4981123013");
//        mTiempoAire.setCompania("Telcel");
//        if(instance.conectar()){
//        boolean result = instance.GuardarRecarga(mTiempoAire);
//        assertEquals(expResult, result);
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of consultarRecargas method, of class BaseDatos.
     */
//    @Test
//    public void testConsultarRecargas() {
//        System.out.println("consultarRecargas");
//        BaseDatos instance = new BaseDatos();
////        ArrayList expResult = null;
////        ArrayList result = instance.consultarRecargas();
////        assertEquals(expResult, result);
//      
//        if (instance.conectar()) {
//            ArrayList expRes = instance.consultarRecargas();
//            ArrayList resul = instance.consultarRecargas();
//            expRes.equals(resul);
//            
//        }
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of conectare method, of class BaseDatos.
//     */
//    @Test
//    public void testConectare() {
//        System.out.println("conectare");
//        BaseDatos instance = new BaseDatos();
//        Connection expResult = null;
//        Connection result = instance.conectare();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
