import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


/**
 * Created by gekh1016 on 05/25/2017.
 */
public class ConvertorTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void convertWholeNumberTest() {
        Converter converter = new Converter();

        assertEquals(converter.convertWholeNumber(0), "zero");
        assertEquals(converter.convertWholeNumber(1), "one");
        assertEquals(converter.convertWholeNumber(2), "two");
        assertEquals(converter.convertWholeNumber(3), "three");
        assertEquals(converter.convertWholeNumber(4), "four");
        assertEquals(converter.convertWholeNumber(5), "five");
        assertEquals(converter.convertWholeNumber(6), "six");
        assertEquals(converter.convertWholeNumber(7), "seven");
        assertEquals(converter.convertWholeNumber(8), "eight");
        assertEquals(converter.convertWholeNumber(9), "nine");
        assertEquals(converter.convertWholeNumber(10), "ten");
        assertEquals(converter.convertWholeNumber(11), "eleven");
        assertEquals(converter.convertWholeNumber(12), "twelve");
        assertEquals(converter.convertWholeNumber(13), "thirteen");
        assertEquals(converter.convertWholeNumber(14), "fourteen");
        assertEquals(converter.convertWholeNumber(15), "fifteen");
        assertEquals(converter.convertWholeNumber(16), "sixteen");
        assertEquals(converter.convertWholeNumber(17), "seventeen");
        assertEquals(converter.convertWholeNumber(18), "eighteen");
        assertEquals(converter.convertWholeNumber(19), "nineteen");

        assertEquals(converter.convertWholeNumber(1000), "one thousand");
        assertEquals(converter.convertWholeNumber(10000), "ten thousand");
        assertEquals(converter.convertWholeNumber(100000), "one hundred thousand");
        assertEquals(converter.convertWholeNumber(1000000), "one million");
        assertEquals(converter.convertWholeNumber(10000000), "ten million");
        assertEquals(converter.convertWholeNumber(100000000), "one hundred million");
        assertEquals(converter.convertWholeNumber(1000000000), "one billion");

    }

    @Test(expected = RuntimeException.class)
    public void convertWholeNumberNegativeTest() {
        Converter converter = new Converter();
        converter.convertWholeNumber(-1000000000);
    }
}
