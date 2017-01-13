/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class FatturaTest {
    
    Fattura fattura;
    
    
    @Before
    public void setUp() 
    {
        try
        {
            fattura = new Fattura();
            fattura.setFattura(00002);
            fattura.setData("10/05/2016");
            fattura.setCosto_totale(15.0f);
            fattura.setPagamento(15.0f);
            fattura.setCliente("Mario Rossi");
        }
        catch(Exception e)
        {
            fail();
        }
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testGetFattura() 
    {
        assertEquals(fattura.getFattura(), 00002);
    }

    
    @Test
    public void testSetFattura() {
        
        fattura.setFattura(00002);
        assertEquals(fattura.getFattura(),00002);
       
    }

    
    @Test
    public void testGetData() {
        
        
        assertEquals(fattura.getData(), "10/05/2016");
       
    }

  
    @Test
    public void testSetData() {
        
        fattura.setData("10/05/2016");
        assertEquals(fattura.getData(),"10/05/2016");
    }

    
    @Test
    public void testGetCosto_totale() {
        
        assertEquals(fattura.getCosto_totale(),15.0f);
    }

   
    @Test
    public void testSetCosto_totale() {
    
        fattura.setCosto_totale(15.0f);
        assertEquals(fattura.getCosto_totale(),15.0f);
    }

    
    @Test
    public void testGetPagamento() {
        
        assertEquals(fattura.getPagamento(), 15.0f);
    }

    
    @Test
    public void testSetPagamento() {
        
        fattura.setPagamento(15.0f);
        assertEquals(fattura.getPagamento(),15.0f);
    }

    
    @Test
    public void testGetCliente() {
        
        assertEquals(fattura.getCliente(), "Mario Rossi");
       
    }

    
    @Test
    public void testSetCliente() {
        
        fattura.setCliente("Mario Rossi");
        assertEquals(fattura.getCliente(),"Mario Rossi");
    }
    
}
