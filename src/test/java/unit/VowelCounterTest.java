package unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.exercise.VowelCounter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class VowelCounterTest {
    private String[] input;
    private String[] expected;

    public VowelCounterTest(String[] input, String[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<String[][]> data() {
        String [][][] data = new String[][][]{
            {{"ANY", "thing"}, {"[CountResult{word='ANY', vowelCount=1}, CountResult{word='thing', vowelCount=1}]"}},
            {{}, {"[]"}},
            {{"one", "two", "three", "four"}, {"[CountResult{word='one', vowelCount=2, consonantsCount=1}, CountResult{word='two', vowelCount=1, consonantsCount=2}, CountResult{word='three', vowelCount=2, consonantsCount=3}, CountResult{word='four', vowelCount=2, consonantsCount=2}]"}},
            {{""}, {"[CountResult{word='', vowelCount=0}]"}}};
        return Arrays.asList(data);
    }

    @Test
    public void getVowelListWithCount() {
        VowelCounter obj = new VowelCounter();
        assertEquals(String.join("", expected), obj.getVowelListWithCount(input).toString());
    }
}