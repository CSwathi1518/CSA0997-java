import java.util.HashMap;
import java.util.Map;
public class ElementFrequency {
    public static void main(String[] args) {
        int[] array ={1,2,8,3,2,2,2,5,1};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}
