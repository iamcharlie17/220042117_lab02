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
    @Test
    public void testDivisibleBy5() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals( "Buzz", fizzyPrinter.printFizzy(10, false));
    }

    @Test
    public void testDivisibleBy7() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals( "Bang", fizzyPrinter.printFizzy(14, false));
    }
    @Test
    public void testDivisibleBy3And5() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Should return 'FizzBuzz' when divisible by 3 and 5", "FizzBuzz", fizzyPrinter.printFizzy(15, false));
    }

    @Test
    public void testDivisibleBy3And5And7() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Should return 'FIZZBUZZBANG' when divisible by 3, 5, and 7 in uppercase", "FIZZBUZZBANG", fizzyPrinter.printFizzy(105, true));
    }

    @Test
    public void testNotDivisibleBy3Or5Or7() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Should return 'Boom' when not divisible by 3, 5, or 7", "Boom", fizzyPrinter.printFizzy(8, false));
    }
    

}
