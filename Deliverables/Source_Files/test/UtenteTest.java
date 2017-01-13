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
public class UtenteTest extends TestCase 
{
    Utente utente;
    
    public UtenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
         try
        {
            utente = new Utente();
            utente.setCodiceFiscale("SSSGPP95E10H703I");
		utente.setCap("84084");
		utente.setVia("A.Antonio");
		utente.setNome("Giuseppe");
		utente.setCognome("Prova");
		utente.setDataNascita("10/05/1995");
		utente.setTelefono("089525214");
		utente.setCellulare("3921248464");
		utente.setEmail("giuseppeprova@hotmail.it");
		utente.setPassword("Prova_prova1995");
		utente.setAmministratore(false);
                utente.setCitta("Salerno");
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
     * Test of getNome method, of class Utente.
     */
    @Test
    public void testGetNome() 
    {
        assertEquals(utente.getNome(), "Giuseppe");
    }

    /**
     * Test of setNome method, of class Utente.
     */
    @Test
    public void testSetNome() {
        
        utente.setNome("Giuseppe");
        assertEquals(utente.getNome(), "Giuseppe");
        
    }

    /**
     * Test of getCognome method, of class Utente.
     */
    @Test
    public void testGetCognome() {
        
        assertEquals(utente.getCognome(), "Prova");
        
    }

    /**
     * Test of setCognome method, of class Utente.
     */
    @Test
    public void testSetCognome() {
        
        utente.setCognome("Prova");
         assertEquals(utente.getCognome(), "Prova");
    }

    /**
     * Test of getCitta method, of class Utente.
     */
    @Test
    public void testGetCitta() {
        
        assertEquals(utente.getCitta(), "Salerno");
       
    }

    /**
     * Test of setCitta method, of class Utente.
     */
    @Test
    public void testSetCitta() {
        
        utente.setCitta("Salerno");
        assertEquals(utente.getCitta(), "Salerno");
        
    }

    /**
     * Test of getTelefono method, of class Utente.
     */
    @Test
    public void testGetTelefono() {
        
        assertEquals(utente.getTelefono(), "089525214");
        
    }

    /**
     * Test of setTelefono method, of class Utente.
     */
    @Test
    public void testSetTelefono() {
        
        utente.setTelefono("089525214");
         assertEquals(utente.getTelefono(), "089525214");
        
    }

    /**
     * Test of getCellulare method, of class Utente.
     */
    @Test
    public void testGetCellulare() {
        
        assertEquals(utente.getCellulare(), "3921248464");
        
    }

    /**
     * Test of setCellulare method, of class Utente.
     */
    @Test
    public void testSetCellulare() {
        
        utente.setCellulare("3921248464");
        assertEquals(utente.getCellulare(), "3921248464");
        
    }

    /**
     * Test of getEmail method, of class Utente.
     */
    @Test
    public void testGetEmail() {
        
        assertEquals(utente.getEmail(), "giuseppeprova@hotmail.it");
      
    }

    /**
     * Test of setEmail method, of class Utente.
     */
    @Test
    public void testSetEmail() {
        
        utente.setEmail("giuseppeprova@hotmail.it");
        assertEquals(utente.getEmail(), "giuseppeprova@hotmail.it");
        
    }

    /**
     * Test of getPassword method, of class Utente.
     */
    @Test
    public void testGetPassword() {
       
        assertEquals(utente.getPassword(), "Prova_prova1995");
        
    }

    /**
     * Test of setPassword method, of class Utente.
     */
    @Test
    public void testSetPassword() {
       
        utente.setPassword("Prova_prova1995");
        assertEquals(utente.getPassword(), "Prova_prova1995");
        
    }

    /**
     * Test of getVia method, of class Utente.
     */
    @Test
    public void testGetVia() {
        
        assertEquals(utente.getVia(), "A.Antonio");
        
    }

    /**
     * Test of setVia method, of class Utente.
     */
    @Test
    public void testSetVia() {
        
        utente.setVia("A.Antonio");
        assertEquals(utente.getVia(), "A.Antonio");
        
    }

    /**
     * Test of getCap method, of class Utente.
     */
    @Test
    public void testGetCap() {
        
        assertEquals(utente.getCap(), "84084");
        
    }

    /**
     * Test of setCap method, of class Utente.
     */
    @Test
    public void testSetCap() {
        
        utente.setCap("84084");
        assertEquals(utente.getCap(), "84084");
        
    }

    /**
     * Test of isAmministratore method, of class Utente.
     */
    @Test
    public void testIsAmministratore() {
        
        assertEquals(utente.isAmministratore(), false);
        
    }

    /**
     * Test of setAmministratore method, of class Utente.
     */
    @Test
    public void testSetAmministratore() {
        
        utente.setAmministratore(false);
        assertEquals(utente.isAmministratore(), false);
    }

    /**
     * Test of setDataNascita method, of class Utente.
     */
    @Test
    public void testSetDataNascita() {
        
       
        assertEquals(utente.getDataNascita(), "10/05/1995");
        
    }

    /**
     * Test of getDataNascita method, of class Utente.
     */
    @Test
    public void testGetDataNascita() {
        utente.setDataNascita("10/05/1995");
        assertEquals(utente.getDataNascita(), "10/05/1995");
        
    }

    /**
     * Test of setCodiceFiscale method, of class Utente.
     */
    @Test
    public void testSetCodiceFiscale() {
        
        utente.setCodiceFiscale("SSSGPP95E10H703I");
         assertEquals(utente.getCodiceFiscale(), "SSSGPP95E10H703I");
        
    }

    /**
     * Test of getCodiceFiscale method, of class Utente.
     */
    @Test
    public void testGetCodiceFiscale() {
        
        assertEquals(utente.getCodiceFiscale(), "SSSGPP95E10H703I");
        
    }
    
}

