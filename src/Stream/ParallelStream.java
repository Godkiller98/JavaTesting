package Stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> l2 = Stream.iterate(1,x->x+1).limit(20000).toList();
   List<Long> factorList=l2.parallelStream().map(x->factorial(x)).toList();
//        List<Long> factorList = l2.stream().map(x->factorial(x)).toList();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime +"ms");
    }
    public static long factorial(int n){
        int result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }return result;
    }
}
