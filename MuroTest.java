

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private Muro muro1;
    private Muro muro2;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaUnionAGrupo entradaU1;
    private EntradaUnionAGrupo entradaU2;
    private Entrada entrada1;
    private Entrada entrada2;
    private EntradaConComentarios entradaC1;
    private EntradaConComentarios entradaC2;

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        entradaF1 = new EntradaFoto("Javi", "http://facebook.com", "futboleros");
        entradaF2 = new EntradaFoto("Pepe", "http://tuenti.com", "Mi perro");
        muro1 = new Muro();
        muro2 = new Muro();
        entradaT1 = new EntradaTexto("Rebe", "macarroones");
        entradaT2 = new EntradaTexto("Rabiot", "affdsafs");
        entradaU1 = new EntradaUnionAGrupo("Rebe", "baloncestistas");
        entradaU2 = new EntradaUnionAGrupo("Rober", "escaladores");
        entrada1 = new Entrada("escaladores");
        entrada2 = new Entrada("baloncestistas");
        entradaC1 = new EntradaConComentarios("affdsafs");
        entradaC2 = new EntradaConComentarios("baloncestistas");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
