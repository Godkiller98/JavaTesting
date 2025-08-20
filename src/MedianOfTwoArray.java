import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MedianOfTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n =nums1.length;
        int n2 = nums2.length;
        int[] n3 = new int[n+n2];
        double result;
        n3= IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
        Arrays.sort(n3);
        if(n3.length%2==0){
            result = (n3[n3.length/2] +  n3[n3.length/2 -1])/2.0;
        }else{
            result = n3[n3.length/2];
        }
        return result;
    }
}


//
//class Solution {
//    public int lengthOfLastWord(String s) {
//        String[] a = s.split(" ");
//        String t = a[a.length-1];
//        int result = t.length();
//        return result;
//    }
//}


//class Solution {
//    public int[] plusOne(int[] digits) {
//        int n = digits.length;
//        for (int i = n - 1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i]++;
//                return digits; // If no carry required, return the updated array
//            }
//            digits[i] = 0; // If digit is 9, set it to 0 and continue
//        }
//        int[] res = new int[n + 1];
//        res[0] = 1; // Set first element to 1, all others remain 0
//        return res; // Example: [9,9,9] → [1,0,0,0]
//
//    }}