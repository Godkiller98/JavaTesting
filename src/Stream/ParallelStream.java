package Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
       // Measures the start time before processing begins
       long startTime = System.currentTimeMillis();
       // Generates a list of integers from 1 to 20000 using Stream.iterate and limit
       List<Integer> l2 = Stream.iterate(1,x->x+1).limit(20000).toList();
  // Calculates the factorial of each integer in the list using parallelStream for faster processing
  List<Long> factorList=l2.parallelStream().map(x->factorial(x)).toList();
        // (Alternative) Calculates the factorial using a regular stream for comparison
//        List<Long> factorList = l2.stream().map(x->factorial(x)).toList();
       // Measures the end time after processing completes
       long endTime = System.currentTimeMillis();
       // Prints the total time taken for the operation in milliseconds
       System.out.println(endTime-startTime +"ms");
   }
   // Calculates the factorial of a given integer n by multiplying numbers from 2
   public static long factorial(int n){
       int result=1;
       for(int i=2;i<=n;i++){
           result*=i;
       }return result;

    }
}
