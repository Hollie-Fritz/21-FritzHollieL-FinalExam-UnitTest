import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class StringCalculatorTest {

    /**
     * tests if a negative is the first number if an exception is thrown
     */
    @Test
    public final void testIfNegativeInFirstThrowsException(){
        assertThrows(Exception.class, () -> {
            StringCalculator.add("-1,5");
        });
    }

    /**
     * tests if a negative is the second number if an exception is thrown
     */
    @Test
    public final void testIfNegativeInSecondThrowsException(){
        assertThrows(Exception.class, () -> {
            StringCalculator.add("5,-1");
        });
    }

    /**
     * tests if a number >= 1000 is the second number if it is ignored and only returns the first value
     */
    @Test
    public void testOver1000InSecondIsIgnored() throws Exception {
        assertEquals(1, StringCalculator.add("1,1000"));
    }

    /**
     * tests if a number >= 1000 is the first number if it is ignored and only returns the second value
     */
    @Test
    public void testOver1000InFirstIsIgnored() throws Exception {
        assertEquals(1, StringCalculator.add("1000,1"));
    }

    /**
     * tests if both numbers >= 1000 then both are ignored and 0 is returned
     */
    @Test
    public void testOver1000InBothReturns0() throws Exception {
        assertEquals(0, StringCalculator.add("1000,1000"));
    }
}
