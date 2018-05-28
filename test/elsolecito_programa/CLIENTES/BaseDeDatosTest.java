/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.CLIENTES;

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
    @Test
    public void testConectar() {
        System.out.println("conectar");
        BaseDeDatos instance = new BaseDeDatos();
        boolean expResult = false;
        boolean result = instance.conectar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class BaseDeDatos.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        BaseDeDatos instance = new BaseDeDatos();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarClientes method, of class BaseDeDatos.
     */
    @Test
    public void testGuardarClientes() {
        System.out.println("GuardarClientes");
        ClientesDeudores mClientesDeudores = null;
        BaseDeDatos instance = new BaseDeDatos();
        boolean expResult = false;
        boolean result = instance.GuardarClientes(mClientesDeudores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClientes method, of class BaseDeDatos.
     */
    @Test
    public void testConsultarClientes() {
        System.out.println("consultarClientes");
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList expResult = null;
        ArrayList result = instance.consultarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarClientes method, of class BaseDeDatos.
     */
    @Test
    public void testEliminarClientes() {
        System.out.println("eliminarClientes");
        ClientesDeudores mClientesDeudores = null;
        BaseDeDatos instance = new BaseDeDatos();
        boolean expResult = false;
        boolean result = instance.eliminarClientes(mClientesDeudores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarClientes method, of class BaseDeDatos.
     */
    @Test
    public void testModificarClientes() {
        System.out.println("modificarClientes");
        ClientesDeudores aClientesDeudores = null;
        ClientesDeudores nClientesDeudores = null;
        BaseDeDatos instance = new BaseDeDatos();
        boolean expResult = false;
        boolean result = instance.modificarClientes(aClientesDeudores, nClientesDeudores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectare method, of class BaseDeDatos.
     */
    @Test
    public void testConectare() {
        System.out.println("conectare");
        BaseDeDatos instance = new BaseDeDatos();
        Connection expResult = null;
        Connection result = instance.conectare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarEspecifica method, of class BaseDeDatos.
     */
    @Test
    public void testConsultarEspecifica() {
        System.out.println("ConsultarEspecifica");
        String nombre = "";
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList expResult = null;
        ArrayList result = instance.ConsultarEspecifica(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
