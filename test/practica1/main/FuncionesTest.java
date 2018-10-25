/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raulio
 */
public class FuncionesTest {
    
    public FuncionesTest() {
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

    /**
     * Test of esValida method, of class Funciones.
     */
    @Test
    public void testEsValida() {
        String opcion = "2";
        Funciones instance = new Funciones();
        boolean expResult = true;
        boolean result = instance.esValida(opcion);
        assertEquals(expResult, result);
    }

    /**
     * Test of esLadoValido method, of class Funciones.
     */
    @Test
    public void testEsLadoValido() {
        String l = "5";
        Funciones instance = new Funciones();
        boolean expResult = true;
        boolean result = instance.esLadoValido(l);
        assertEquals(expResult, result);
    }

    /**
     * Test of esEquilatero method, of class Funciones.
     */
    @Test
    public void testEsEquilatero() {
        int la = 0;
        int lb = 0;
        int lc = 0;
        Funciones instance = new Funciones();
        boolean expResult = true;
        boolean result = instance.esEquilatero(la, lb, lc);
        assertEquals(expResult, result);
    }

    /**
     * Test of esIsosceles method, of class Funciones.
     */
    @Test
    public void testEsIsosceles() {
        int la = 0;
        int lb = 0;
        int lc = 0;
        Funciones instance = new Funciones();
        boolean expResult = false;
        boolean result = instance.esIsosceles(la, lb, lc);
        assertEquals(expResult, result);
    }

    /**
     * Test of esEscaleno method, of class Funciones.
     */
    @Test
    public void testEsEscaleno() {
        int la = 0;
        int lb = 0;
        int lc = 0;
        Funciones instance = new Funciones();
        boolean expResult = false;
        boolean result = instance.esEscaleno(la, lb, lc);
        assertEquals(expResult, result);
    }

    /**
     * Test of esCuadrado method, of class Funciones.
     */
    @Test
    public void testEsCuadrado() {
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        int l4 = 0;
        Funciones instance = new Funciones();
        boolean expResult = true;
        boolean result = instance.esCuadrado(l1, l2, l3, l4);
        assertEquals(expResult, result);
    }

    /**
     * Test of esRectangulo method, of class Funciones.
     */
    @Test
    public void testEsRectangulo() {
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        int l4 = 0;
        Funciones instance = new Funciones();
        boolean expResult = false;
        boolean result = instance.esRectangulo(l1, l2, l3, l4);
        assertEquals(expResult, result);
    }

    /**
     * Test of esTrapecio method, of class Funciones.
     */
    @Test
    public void testEsTrapecio() {
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        int l4 = 0;
        Funciones instance = new Funciones();
        boolean expResult = false;
        boolean result = instance.esTrapecio(l1, l2, l3, l4);
        assertEquals(expResult, result);
    }
    
}