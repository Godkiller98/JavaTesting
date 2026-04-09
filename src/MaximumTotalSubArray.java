import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumTotalSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int w = 4;
        int max, min, current = 0;
        for (int i = 0; i < w; i++) {
            current += arr[i];
        }
        max = current;
        min = current;
        for (int i = 1; i < arr.length - w; i++) {
            {
                current = current - arr[i - 1] + arr[i + w - 1];
                if (current > max) {
                    max = current;
                }
                if (current < min) {
                    min = current;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}


