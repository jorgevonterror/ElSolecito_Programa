/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.CLIENTES;

import static groovy.xml.dom.DOMCategory.list;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import static java.util.Collections.list;
import java.util.List;
import static mondrian.olap.Category.Array;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

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
//        boolean expResult = false;
//        boolean result = instance.conectar();
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
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of GuardarClientes method, of class BaseDeDatos.
//     */
//    @Test
//    public void testGuardarClientes() {
//        System.out.println("GuardarClientes");
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//
//        ClientesDeudores mClientesDeudores = new ClientesDeudores();
//        mClientesDeudores.setNombre("Luis");
//        mClientesDeudores.setMonto(90);
//        mClientesDeudores.setFolio("030");
//
//        if (instance.conectar()) {
//            boolean result = instance.GuardarClientes(mClientesDeudores);
//            assertEquals(result, expResult);
//        }
//    }
//    /**
//     * Test of consultarClientes method, of class BaseDeDatos.
//     */
//    @Test
//    public void testConsultarClientes() {
//        System.out.println("consultarClientes");
//        BaseDeDatos instance = new BaseDeDatos();
//        ArrayList expResult = null;
//        ArrayList result = instance.consultarClientes();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of eliminarClientes method, of class BaseDeDatos.
//     */
//    @Test
//    public void testEliminarClientes() {
//        System.out.println("eliminarClientes");
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//        
//        ClientesDeudores mClientesDeudores = new ClientesDeudores();
//        mClientesDeudores.setNombre("Luis");
//        mClientesDeudores.setMonto(90);
//        mClientesDeudores.setFolio("040");
//
//        if (instance.conectar()) {
//            boolean result = instance.eliminarClientes(mClientesDeudores);
//            assertEquals(result, expResult);
//        }
//    }
//    /**
//     * Test of modificarClientes method, of class BaseDeDatos.
//     */
//    @Test
//    public void testModificarClientes() {
//        System.out.println("modificarClientes");
//        ClientesDeudores aClientesDeudores = new ClientesDeudores();
//        ClientesDeudores nClientesDeudores = new ClientesDeudores();
//        BaseDeDatos instance = new BaseDeDatos();
//        boolean expResult = true;
//
//        aClientesDeudores.setFolio("040");
//        aClientesDeudores.setMonto(0);
//        aClientesDeudores.setNombre("Jorge");
//        
//        nClientesDeudores.setFolio("040");
//        nClientesDeudores.setMonto(90);
//        nClientesDeudores.setNombre("Jorge");
//        
//        if (instance.conectar()) {
//            boolean result = instance.modificarClientes(aClientesDeudores, nClientesDeudores);
//            assertEquals(result, expResult);
//        }
//    }
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
//     * Test of ConsultarEspecifica method, of class BaseDeDatos.
//     */
    @Test
    public void testConsultarEspecifica() {
        System.out.println("ConsultarEspecifica");
      
        String nombre = "Jorge";
        BaseDeDatos instance = new BaseDeDatos();
        
        ArrayList expRes = new ArrayList();
        expRes.add("Jorge");

        
//        List<String> expRe= null;
//        expRe.addAll(Array.asList(new Object[] {"","",""}));
        //String[] mini = {"Jorge", "90", "013"};
        
        
        if (instance.conectar()) {
            //System.out.println(Arrays.toString(instance.ConsultarEspecifica(nombre).toArray()));
            
            assertArrayEquals(instance.ConsultarEspecifica(nombre).toArray(), expRes.toArray());
        }
    }
}
