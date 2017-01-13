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
public class ProdottoTest extends TestCase
{
    Prodotto prodotto;
    
    
    @Before
    public void setUp() 
    {
        try
        {
            prodotto = new Prodotto();
            prodotto.setCod_pezzo("00001");
            prodotto.setMarchio("Alfa");
            prodotto.setModello("147");
            prodotto.setPrezzo(150.0f);
            prodotto.setOfferta(false);
            prodotto.setPrezzo_scontato(150.0f);
            prodotto.setDescrizione("Descrizione1");
            prodotto.setQuantita(3);
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
    public void testGetCod_pezzo() 
    {
        assertEquals(prodotto.getCod_pezzo(), "00001");
    }

    
    @Test
    public void testSetCod_pezzo()
    {
        prodotto.setCod_pezzo("00001");
        assertEquals(prodotto.getCod_pezzo(), "00001");
    }

    @Test
    public void testGetMarchio() 
    {
        assertEquals(prodotto.getMarchio(), "Alfa");
    }

    /**
     * Test of setMarchio method, of class Prodotto.
     */
    @Test
    public void testSetMarchio() 
    {
        prodotto.setMarchio("Alfa");
        assertEquals(prodotto.getMarchio(), "Alfa");
    }

    /**
     * Test of getModello method, of class Prodotto.
     */
    @Test
    public void testGetModello() 
    {
        assertEquals(prodotto.getModello(), "147");
    }

    /**
     * Test of setModello method, of class Prodotto.
     */
    @Test
    public void testSetModello() {
        
        prodotto.setModello("147");
        assertEquals(prodotto.getModello(), "147");
        
    }

    /**
     * Test of getPrezzo method, of class Prodotto.
     */
    @Test
    public void testGetPrezzo() {
       
        assertEquals(prodotto.getPrezzo(), 150.0f);
        
    }

    /**
     * Test of setPrezzo method, of class Prodotto.
     */
    @Test
    public void testSetPrezzo() {
       
        prodotto.setPrezzo(150.0f);
        assertEquals(prodotto.getPrezzo(), 150.0f);
    }

    /**
     * Test of isOfferta method, of class Prodotto.
     */
    @Test
    public void testIsOfferta() {
        
        assertEquals(prodotto.isOfferta(), false);
        
    }

    /**
     * Test of setOfferta method, of class Prodotto.
     */
    @Test
    public void testSetOfferta() {
        
        prodotto.setOfferta(false);
        assertEquals(prodotto.isOfferta(), false);
        
    }

    /**
     * Test of getPrezzo_scontato method, of class Prodotto.
     */
    @Test
    public void testGetPrezzo_scontato() {
        
        assertEquals(prodotto.getPrezzo_scontato(), 150.0f);
        
    }

    /**
     * Test of setPrezzo_scontato method, of class Prodotto.
     */
    @Test
    public void testSetPrezzo_scontato() {
        
        prodotto.setPrezzo_scontato(150.0f);
        assertEquals(prodotto.getPrezzo_scontato(), 150.0f);
    }

    /**
     * Test of getDescrizione method, of class Prodotto.
     */
    @Test
    public void testGetDescrizione() {
        
        assertEquals(prodotto.getDescrizione(), "Descrizione1");
        
    }

    /**
     * Test of setDescrizione method, of class Prodotto.
     */
    @Test
    public void testSetDescrizione() {
        
        prodotto.setDescrizione("Descrizione1");
        assertEquals(prodotto.getDescrizione(), "Descrizione1");
        
    }

    /**
     * Test of getQuantita method, of class Prodotto.
     */
    @Test
    public void testGetQuantita() {
        
        assertEquals(prodotto.getQuantita(), 3);
        
    }

    /**
     * Test of setQuantita method, of class Prodotto.
     */
    @Test
    public void testSetQuantita() {
        
        prodotto.setQuantita(3);
        assertEquals(prodotto.getQuantita(), 3);
    }
    
}
