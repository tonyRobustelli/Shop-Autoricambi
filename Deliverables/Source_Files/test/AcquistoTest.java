package Bean;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AcquistoTest extends TestCase
{
    Acquisto acquisto;
    
    
    @Before
    public void setUp()
    {
        try
        {
            acquisto = new Acquisto();
            acquisto.setCodice_acquisto(00001);
            acquisto.setDescrizione("descrizione1");
            acquisto.setFattura(00001);
            acquisto.setProdotto("freni");
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
    public void testSetCodice_acquisto() 
    {
        acquisto.setCodice_acquisto(00001);
        assertEquals(acquisto.getCodice_acquisto(),00001);
    }
    
    
    @Test
    public void testGetCodice_acquisto() 
    {
        assertEquals(acquisto.getCodice_acquisto(), 00001);
    }

    
   @Test
    public void testSetDescrizione() {
        
        acquisto.setDescrizione("descrizione1");
        assertEquals(acquisto.getDescrizione(),"descrizione1");
    }

    
    @Test
    public void testGetDescrizione() 
    {
        assertEquals(acquisto.getDescrizione(), "descrizione1");
    }

    @Test
    public void testSetFattura() {
        
        acquisto.setFattura(00001);
         assertEquals(acquisto.getFattura(),00001);
        
    }
    

    /**
     * Test of getFattura method, of class Acquisto.
     */
    @Test
    public void testGetFattura() {
        
        assertEquals(acquisto.getFattura(), 00001);
    }
    
    @Test
    public void testSetProdotto() {
        acquisto.setProdotto("freni");
        assertEquals(acquisto.getProdotto(),"freni");
        
    }
   
    @Test
    public void testGetProdotto() {
        
        assertEquals(acquisto.getProdotto(), "freni");
    }

   
    
    
}
