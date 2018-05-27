/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.PROVEEDORES;

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
 * @author 8.1
 */
public class BaseDeDAtosTest {
    
    public BaseDeDAtosTest() {
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
     * Test of conectar method, of class BaseDeDAtos.
     */
//    @Test
//    public void testConectar() {
//        System.out.println("conectar");
//        BaseDeDAtos instance = new BaseDeDAtos();
//        boolean expResult = true;
//        boolean result = instance.conectar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of desconectar method, of class BaseDeDAtos.
     */
//    @Test
//    public void testDesconectar() {
//        System.out.println("desconectar");
//        BaseDeDAtos instance = new BaseDeDAtos();
//        instance.desconectar();
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of GuardarProveedores method, of class BaseDeDAtos.
     */
//    @Test
//    public void testGuardarProveedores() {
//        System.out.println("GuardarProveedores");
//        BaseDeDAtos instance = new BaseDeDAtos();
//        boolean expResult = true;
//        
//        Proveedores mProveedores = new Proveedores();
//        mProveedores.setFolio("9015");
//        mProveedores.setMarca("duvalin");
//        mProveedores.setNombre("omar");
//        if (instance.conectar()) {
//            boolean result = instance.GuardarProveedores(mProveedores);
//            assertEquals(result, expResult);
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of consultarProveedores method, of class BaseDeDAtos.
     */
//    @Test
//    public void testConsultarProveedores() {
//        System.out.println("consultarProveedores");
//        BaseDeDAtos instance = new BaseDeDAtos();
//        ArrayList expResult = null;
//        ArrayList result = instance.consultarProveedores();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of eliminarProveedores method, of class BaseDeDAtos.
     */
//    @Test
//    public void testEliminarProveedores() {
//        System.out.println("eliminarProveedores");
//        BaseDeDAtos instance = new BaseDeDAtos();
//        boolean expResult = true;
//        
//        Proveedores mProveedores = new Proveedores();
//        mProveedores.setFolio("9015");
//        mProveedores.setMarca("duvalin");
//        mProveedores.setNombre("omar");
//        
//        if (instance.conectar()) {
//            boolean result = instance.eliminarProveedores(mProveedores);
//            assertEquals(result, expResult);
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of modificarProveedores method, of class BaseDeDAtos.
     */
//    @Test
//    public void testModificarProveedores() {
//        System.out.println("modificarProveedores");
//        Proveedores mproveedores = new Proveedores();
//        Proveedores nProveedores = new Proveedores();
//        BaseDeDAtos instance = new BaseDeDAtos();
//        boolean expResult = true;
//       
//        mproveedores.setFolio("015");
//        mproveedores.setMarca("bubalo");
//        mproveedores.setNombre("cuña");
//        
//        nProveedores.setFolio("015");
//        nProveedores.setMarca("maruchan");
//        nProveedores.setNombre("cuña");
//        
//        if (instance.conectar()) {
//            boolean result = instance.modificarProveedores(mproveedores, nProveedores);
//            assertEquals(result, expResult);
//        }
//        
//        
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of conectare method, of class BaseDeDAtos.
     */
//    @Test
//    public void testConectare() {
//        System.out.println("conectare");
//        BaseDeDAtos instance = new BaseDeDAtos();
//        Connection expResult = null;
//        Connection result = instance.conectare();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of ConsultarEspecifica method, of class BaseDeDAtos.
     */
    @Test
    public void testConsultarEspecifica() {
        System.out.println("ConsultarEspecifica");
        String nombre = "cuña";
        BaseDeDAtos instance = new BaseDeDAtos();
        
        if (instance.conectar()) {
            ArrayList expRes = instance.ConsultarEspecifica(nombre);
            ArrayList resul = instance.ConsultarEspecifica(nombre);
            expRes.equals(resul);
            
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
