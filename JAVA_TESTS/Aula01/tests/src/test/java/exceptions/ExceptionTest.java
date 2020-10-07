package exceptions;


import org.junit.Test;

import java.util.ArrayList;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExceptionTest {

    /*@Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<Object>();
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }*/

    @Test
    public void testeExceptionMessage() {
        try {
            new ArrayList<Object>().get(0);
            fail("Esperada IndexOutOfBoundsException sej lançada");

        } catch (IndexOutOfBoundsException ex) {
            assertEquals(ex.getMessage(), is("Index: 0, Size: 0"));

        }
    }

}
