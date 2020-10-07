package assertsTests;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    //Testa a quantidade de bytes de um array
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "assertsTests".getBytes();
        byte[] atual = "assertsTests".getBytes();
        assertArrayEquals(esperado, atual);
    }

    // Texta a quantidade de caracteres
    @Test
    public void testAssertEquals(){
        assertEquals("texto","texto");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }


}
