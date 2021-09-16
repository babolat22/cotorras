/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autojunit;

import java.lang.reflect.Executable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanj
 */
public class autoTest {
    static auto instance;
    
    public autoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
     //   instance = new auto("Audi A3", 10000);
       // auto.impuesto = 20f;
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
     * Test of precioFinal method, of class auto.
     */
    @Test
    public void testPrecioFinal() throws Exception {
        System.out.println("precioFinal_Caro");
        float descuento = 10.0F;
        auto instance = new auto("Audi A3", 10000);
        auto.impuesto = 20f;
        //instance.setPrecioBase(10000);
        float expResult = 10800;
        float result = instance.precioFinal(descuento);
        
        assertEquals(expResult, result, 0.0001);   // millonesima diferencia
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPrecioFinal_2() throws Exception {
        System.out.println("precioFinal_Barato");
        float descuento = 10.0F;
        auto instance = new auto("Fiat Mobi", 1000);
       //   instance.setPrecioBase(1000);
        auto.impuesto = 20f;
        
        float expResult = 1200;
        float result = instance.precioFinal(descuento);
        
        assertEquals(expResult, result, 0.0001);   // millonesima diferencia
      
    }
    @Test(expected=Exception.class)
    public void testPrecioFinal_3() throws Exception {
        System.out.println("precioFinal_Descuento Incorrecto");
        float descuento = 110.0F;
        auto instance = new auto("Renault 12", 1000);
        auto.impuesto = 20f;
        instance.precioFinal(descuento);
    }
    
}
