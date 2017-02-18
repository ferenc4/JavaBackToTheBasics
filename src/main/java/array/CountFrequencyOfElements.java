package array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ferenc on 2/17/2017.
 * docs/arrays.md:line 1
 */
public class CountFrequencyOfElements {
    public HashMap<Character, Integer> run(ArrayList<Character> array) {
        HashMap<Character, Integer> occurenceMap = new HashMap<>();
        for (int i = 0; i < array.size(); i++) {
            Character currentElement = array.get(i);
            if (occurenceMap.containsKey(currentElement)) {
                occurenceMap.put(currentElement, occurenceMap.get(currentElement) + 1);
            } else {
                occurenceMap.put(currentElement, 1);
            }
        }
        return occurenceMap;
    }
}
