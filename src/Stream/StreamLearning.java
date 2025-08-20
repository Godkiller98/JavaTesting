package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLearning {
    public static void main(String[] args) {
//        int[] a = {1,2,2,3,3,4,5,6};
//        int[] b = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        //   Arrays.stream(b).forEach(x->System.out.println(x));
//        System.out.println(Arrays.stream(a).distinct().sum());
//        List<String> li = Arrays.asList("AKJshay","Tony","David","luther");
//       long t2=  li.stream().filter(x->x.startsWith("T")).count();
//        System.out.println(t2);
//       String l3="Hello World";
//       long t3 = l3.chars().filter(x->x=='l').count();
//        System.out.println(t3);
//        List<String> li2 = li.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).toList();
//        li2.forEach(System.out::println);
//Predicate<Integer>  isEven=(t)->t%2==0;
//        System.out.println(isEven.test(5));

//        Function<Integer,String> t1 = (t)->t%2==0 ? "Yes":"No";
//        System.out.println(t1.apply(4));
//
//        Function<Integer,Integer> multiple = (s)->s*s;
//        System.out.println(multiple.apply(4));
//
//        Supplier<String> s1 = ()->"WOrking for you";
//        System.out.println(s1.get());
//        Stream<String> a = li.stream().filter(x -> x.startsWith("A"));
//        a.forEach(System.out::println);
      List<Integer> li2 = Arrays.asList(1,2,2,3,3,4,5,6);
//      int t = li2.stream().distinct().reduce(0, Integer::sum);
       Optional<Integer> tas= li2.stream().max(Comparator.naturalOrder());
       Optional<Integer> minTas = li2.stream().min(Comparator.naturalOrder());
        System.out.println(tas.get());
        System.out.println(minTas.get());
//      List<String> les = Arrays.asList("rohit","tom");
//        Object[] arr = les.stream().map(String::toLowerCase).toArray();
//        System.out.println(t);


    }
}
