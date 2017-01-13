/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import junit.framework.TestCase;
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
public class ProdottoFotoTest extends TestCase
{
    ProdottoFoto prodottofoto;
    public ProdottoFotoTest() {
    }
    
   
    
    @Before
    public void setUp() 
    {
         try
        {
            prodottofoto = new ProdottoFoto();
            prodottofoto.setProdotto_bean(null);
            prodottofoto.setFoto_bean(null);
        }
        catch(Exception e)
        {
            fail();
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProdotto_bean method, of class ProdottoFoto.
     */
    @Test
    public void testGetProdotto_bean() 
    {
        assertEquals(prodottofoto.getProdotto_bean(), null);
    }

    /**
     * Test of setProdotto_bean method, of class ProdottoFoto.
     */
    @Test
    public void testSetProdotto_bean() {
        
        prodottofoto.setProdotto_bean(null);
        assertEquals(prodottofoto.getProdotto_bean(), null);
    }

    /**
     * Test of getFoto_bean method, of class ProdottoFoto.
     */
    @Test
    public void testGetFoto_bean() {
        
        assertEquals(prodottofoto.getFoto_bean(), null);
        
    }

    /**
     * Test of setFoto_bean method, of class ProdottoFoto.
     */
    @Test
    public void testSetFoto_bean() {
        
        prodottofoto.setFoto_bean(null);
        assertEquals(prodottofoto.getFoto_bean(), null);
    }
    
}
