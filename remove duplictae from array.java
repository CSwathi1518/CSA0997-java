import java.util.Arrays;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,40,40,50};
        int[] uniqueArr = Arrays.stream(arr).distinct().toArray();
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArr));
    }
}
