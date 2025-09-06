package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Demonstrates the use of Java Streams to perform skip and limit operations on a list of integers

public class StreamWithSkipAndLimit{
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(1,2,3,4,5);
        Optional<Integer> op = limit(lis);
        Optional<Integer> op2 =ski(lis);
        if(op.isPresent()){
            System.out.println(op.get());
        }
        if(op2.isPresent()){
            System.out.println(op2.get());
        }
    }
    public static Optional<Integer> limit(List<Integer> lis2){
        return lis2.stream().limit(2).reduce((a,b)->a+b);
    }

    public static Optional<Integer> ski(List<Integer> lis2){
        return lis2.stream().skip(4).reduce((a,b)->a+b);
    }
}
