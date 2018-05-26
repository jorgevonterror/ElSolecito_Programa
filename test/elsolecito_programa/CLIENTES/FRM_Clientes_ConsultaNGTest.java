/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.CLIENTES;

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
public class FRM_Clientes_ConsultaNGTest {
    
    public FRM_Clientes_ConsultaNGTest() {
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
     * Test of borrar method, of class FRM_Clientes_Consulta.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        FRM_Clientes_Consulta instance = new FRM_Clientes_Consulta();
        instance.borrar();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class FRM_Clientes_Consulta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FRM_Clientes_Consulta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
