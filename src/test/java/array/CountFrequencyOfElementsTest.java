package array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ferenc on 2/17/2017.
 */
public class CountFrequencyOfElementsTest {
    @Test
    public void run() throws Exception {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('c');
        characters.add('d');
        characters.add('b');
        characters.add('c');
        CountFrequencyOfElements frequency = new CountFrequencyOfElements();
        HashMap<Character, Integer> occurences = frequency.run(characters);
        Assertions.assertThat(occurences.size()).isEqualTo(4);
        Assertions.assertThat(occurences.get('a')).isEqualTo(1);
        Assertions.assertThat(occurences.get('b')).isEqualTo(2);
        Assertions.assertThat(occurences.get('c')).isEqualTo(3);
        Assertions.assertThat(occurences.get('d')).isEqualTo(1);
    }

}