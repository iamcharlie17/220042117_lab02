package test;

import org.junit.Test;
import src.FizzyPrinter;

import static org.junit.Assert.assertEquals;

public class FizzyPrinterTest {

    @Test
    public void testDivisibleBy3() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Fizz", fizzyPrinter.printFizzy(9, false));
    }

}
