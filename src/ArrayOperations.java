import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperations {
    public static void main(String[] args) {
       int[] arr = {5, 2, 8, 1, 3};
//        int[] arr2 = Arrays.stream(arr).boxed().sorted((a,b)->b-a).mapToInt(Integer::intValue).toArray();
//    Using Arrays.sort() to sort the array
       Arrays.sort(arr);
       System.out.println("Sorted Array: " + Arrays.toString(arr));

       // Using Arrays.stream() to create a stream from the array
       IntStream stream = Arrays.stream(arr);
       System.out.println("Stream of Array: " + Arrays.toString(stream.toArray()));

       // Using Arrays.binarySearch() to find an element in the sorted array
       int index = Arrays.binarySearch(arr, 8);
       System.out.println("Index of 8: " + index);

       // Using Arrays.copyOf() to copy the array
       int[] copiedArray = Arrays.copyOf(arr, arr.length);
       System.out.println("Copied Array: " + Arrays.toString(copiedArray));

       // Using Arrays.equals() to compare two arrays content
       boolean isEqual = Arrays.equals(arr, copiedArray);
       System.out.println("Arrays are equal: " + isEqual);

            
       // Using Arrays.fill() to fill the array with a specific value
       Arrays.fill(copiedArray, 0);
       System.out.println("Array after fill: " + Arrays.toString(copiedArray));

       // Using Arrays.stream() to calculate the sum of elements
       int sum = Arrays.stream(arr).sum();
       System.out.println("Sum of Array Elements: " + sum);

       // Using Arrays.stream() to find the average
       double average = Arrays.stream(arr).average().orElse(0);
       System.out.println("Average of Array Elements: " + average);


        String s = "  ROhit Mane  989 898 ";
        String s1 = s.replaceAll("[0-9\\s]","");
        System.out.println(s1);
     }
}
