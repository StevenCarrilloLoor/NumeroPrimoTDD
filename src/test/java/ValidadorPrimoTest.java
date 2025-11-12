import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class ValidadorPrimoTest {
    
    @Test
    public void testUnoNoEsPrimo(){

        assertFalse(ValidadorPrimo.esPrimo(1));

    }

    @Test
    public void testDosEsPrimo(){

        assertTrue( ValidadorPrimo.esPrimo(2));

    }

    @Test
    public void testCincoEsPrimo(){

        assertTrue (ValidadorPrimo.esPrimo(5));

    }

    @Test
    public void testSeisNoEsPrimo(){

        assertFalse (ValidadorPrimo.esPrimo(6));

    }

    @Test
    public void testVeintiSieteNoEsPrimo(){

        assertFalse (ValidadorPrimo.esPrimo(27));

    }

    @Test
    public void testNueveNoEsPrimo(){

        assertFalse (ValidadorPrimo.esPrimo(9));

    }


}