package streamapi;

import com.neojal.javaSE11.streamapi.StreamApiExamples;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class StreamApiExamplesTest {

    static final List<String> names = Arrays.asList("Jose", "Dulce", "Angie", "Manuel", "Maru");
    static final List<String> repeatedNames =
            Arrays.asList("Jose", "Dulce", "Angie", "Manuel", "Maru", "Dulce", "Jose");

    static final List<Integer> numbers = Arrays.asList(1,2,3,4,5);
    static final List<Integer> evenNumbers = Arrays.asList(2,4,6,8,10);
    static final List<Integer> oddNumbers = Arrays.asList(1,3,5,7,9);

    @Test
    void numbersPlusOne() {

        assertNotEquals( numbers, StreamApiExamples.numbersPlusOne(numbers));
        assertEquals( Arrays.asList(2,3,4,5,6), StreamApiExamples.numbersPlusOne(numbers) );
    }

    @Test
    void integerReduceExamples() {

        assertEquals(5, StreamApiExamples.maxNumber(numbers));
        assertEquals(1, StreamApiExamples.minNumber(numbers));
    }

    @Test
    void filterRepeatedNames() {

        assertNotEquals(names, StreamApiExamples.filterRepeatedNames(repeatedNames));
        assertEquals(5, StreamApiExamples.filterRepeatedNames(repeatedNames).size());
    }

    @Test
    void sumIntegers() {
        assertEquals(15, StreamApiExamples.sumIntegers(numbers));
    }

    @Test
    void factorial() {
        assertEquals(120, StreamApiExamples.factorial(5));
        assertEquals(3628800, StreamApiExamples.factorial(10));
    }
}
