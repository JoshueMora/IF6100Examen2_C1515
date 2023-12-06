/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Joshue Mora
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
                
    @Test //Codigo -1
    public void pruebaValorNegativo() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        assertEquals(-1, context.procesar(-5, 10));
    }
        
    @Test //Codigo -3
    public void pruebaDivisionEntreCero() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        assertEquals(-3, context.procesar(10, 0));
    }

    @Test
    public void pruebaSumaBIEN() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        assertEquals(15, context.procesar(5, 10));
    }
    
    @Test
    public void pruebaSumaMAL() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        assertNotEquals(14, context.procesar(5, 10));
    }
    
    @Test
    public void pruebaRestaBIEN() { //Codigo -2 prueba resta primer digito mayor
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        assertEquals(-2, context.procesar(20,4));
    }
    
    @Test
    public void pruebaRestaMAL() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        assertNotEquals(15, context.procesar(20,4));
    }
    
    @Test
    public void pruebaMultiplicarBIEN() {
        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
        assertEquals(20, context.procesar(5,4));
    }
    
    @Test
    public void pruebaMultiplicarMAL() {
        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
        assertNotEquals(19, context.procesar(5,4));
    }
    
    @Test
    public void pruebaDivisonBIEN() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        assertEquals(5, context.procesar(10, 2));
    }
    
    @Test
    public void pruebaDivisionMAL() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        assertNotEquals(4, context.procesar(10,2));
    }
}
