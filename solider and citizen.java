import java.util.Arrays;

public class WeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] strength = new int[m];
        int[] result = new int[k];
        for (int i = 0; i < m; i++) {
            strength[i] = countSoldiers(mat[i]);
        }
        Integer[] indices = new Integer[m];
        for (int i = 0; i < m; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> {
            if (strength[a] != strength[b]) {
                return Integer.compare(strength[a], strength[b]);
            } else {
                return Integer.compare(a, b);
            }
        });
        for (int i = 0; i < k; i++) {
            result[i] = indices[i];
        }
        return result;
    }
    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
        };
        int k = 2;
        int[] result = kWeakestRows(mat, k);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
