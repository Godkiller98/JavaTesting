import java.util.Arrays;
import java.util.Comparator;
// ...existing code...
import java.util.Arrays;
import java.util.Comparator;

public class StringPalindrome {
    public static void main(String[] args) {
        // Check and print whether the given strings are palindromes using isPlain()
        System.out.println(isPlain("aba"));   // expected true
        System.out.println(isPlain("Rohit")); // expected false

        // Create an array with duplicates and unsorted values
        int[] a = {3, 1, 2, 4, 5, 5, 4, 3, 2, 6, 7};

        // Use a stream to sort the array and remove duplicate values.
        // Arrays.stream(a) -> IntStream of elements
        // sorted() -> sorts the stream
        // distinct() -> removes duplicates
        // toArray() -> collects back to an int[]
        int[] tar = Arrays.stream(a).sorted().distinct().toArray();

        // Print the resulting sorted, unique array
        System.out.println(Arrays.toString(tar));

        // The following commented-out code blocks are examples / experiments:
        // - Counting even and odd digits in an integer
        // - Reversing and sanitizing strings (removing punctuation, whitespace, digits)
        // - Comparing strings for palindrome/equality after cleanup
        // - Checking if two strings are anagrams by sorting character arrays
        //
        // They are left as comments for reference and can be enabled / adapted if needed.

//int evenCount =0,oddCount=0,t=0;
//int result =12345;
//while(result>0){
//    t=result%10;
//    result = result/10;
//    if(t%2==0)evenCount++;
//    else oddCount++;
//}   System.out.println("EVEN count is" + evenCount);
//        System.out.println("ODD count is" + oddCount);
//        System.out.println("total count is"+ evenCount+oddCount);
//        String tar = "aba  98 , + ";
//        String tar2 = new StringBuffer(tar).reverse().toString();
//        System.out.println(tar2.replaceAll("[,+\\s0-9]",""));
//        System.out.println(tar.replaceAll("[,+\\s0-9]",""));
//        System.out.println(tar.replaceAll("[,+\\s0-9]","").equals(tar2.replaceAll("[,+\\s0-9]","")));
//        String tar3="Rohit";
//        String tar4="tiorh";
//        if(tar3.length()==tar4.length()){
//            char[] c1 = tar3.toLowerCase().toCharArray();
//            char[] c3 = tar4.toLowerCase().toCharArray();
//            Arrays.sort(c1);
//            Arrays.sort(c3);
//            System.out.println("Working");
//            if (Arrays.equals(c1,c3)){
//                System.out.println("Done");
//            }
//        }
    }    
    // Helper method: returns true if input string 's' is a palindrome.
    // Implementation detail:
    // - Create a reversed version using StringBuffer.reverse()
    // - Compare original string with reversed string using equals()
public static boolean isPlain(String s){
    String s3 = new StringBuffer(s).reverse().toString();
    return s.equals(s3);
}

}

