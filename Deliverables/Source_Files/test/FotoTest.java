/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import static junit.framework.TestCase.assertEquals;
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
public class FotoTest {
    
    Foto foto;
    
    public FotoTest() {
    }
   
    
    @Before
    public void setUp() 
    {
        foto = new Foto();
        foto.setPath("path1");
        
        foto.setProdotto("freni");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProdotto method, of class Foto.
     */
    @Test
    public void testGetProdotto() {
        
        assertEquals(foto.getProdotto(), "freni");
        
    }

    /**
     * Test of setProdotto method, of class Foto.
     */
    @Test
    public void testSetProdotto() {
        
        foto.setProdotto("freni");
        assertEquals(foto.getProdotto(),"freni");
        
    }

    @Test
    public void testGetPath() {
        
        assertEquals(foto.getPath(), "path1");
       
    }

    @Test
    public void testSetPath() {
        
        foto.setPath("path1");
        assertEquals(foto.getPath(),"path1");
    }
    
}
