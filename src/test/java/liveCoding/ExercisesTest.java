package liveCoding;

import com.neojal.javaSE11.liveCoding.Exercises;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercisesTest {

    @Test
    void reverseSingleArray() {

        Exercises exercises = new Exercises();
        assertEquals("fedcba", exercises.reverseSingleString("abcdef"));
    }

    @Test
    void reverseSpecialString() {

        Exercises exercises = new Exercises();
        assertEquals("edc,b,a", exercises.reverseSpecialString("abc,d,e"));
        assertEquals("i!!!h.g.f,e'd,cba", exercises.reverseSpecialString("a!!!b.c.d,e'f,ghi"));
    }

    @Test
    void isStringAnagram() {

        Exercises exercises = new Exercises();
        assertEquals(true, exercises.isAnagram("test1", "1estt" ));
        assertEquals(true, exercises.isAnagram("jose", "sejo" ));
        assertEquals(true, exercises.isAnagram("anagram", "margana" ));
    }

    @Test
    void magicIndex() {

        Exercises exercises = new Exercises();

        int[] arr1 = {-1,0,2,4,5,6,7,8,9,10};
        assertEquals(2, exercises.magicIndex(arr1));

        int[] arr2 = {-10,-8,-3,-2,-1,1,2,7,90,100};
        assertEquals(7, exercises.magicIndex(arr2));
    }

    @Test
    void binarySearch() {

        Exercises exercises = new Exercises();

        int[] ints = {1,2,3,4,5,6,7,8,9,10};

        // returns the index of the element
        assertEquals(5, exercises.binarySearch(ints, 6));
        assertEquals(9, exercises.binarySearch(ints, 10));
    }
}
