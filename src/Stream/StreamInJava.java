package Stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class StreamInJava {
        public static void main(String[] args) {

           List<String> arr1 = Arrays.asList("Rohit", "Jack", "christopher", "Rahul");
//            arr1.forEach(n->System.out.println(n));
                arr1.stream().sorted((a,b)->a.length()-b.length()).forEach(x-> System.out.println(x));
//
//            arr1.stream().filter(s -> s.startsWith("R")).forEach(s -> System.out.println(s));
//            System.out.println(
//                    "------------------------------------STARTS WITH J---------------------------------------------------------------------");
//            Stream.of("Jack", "John", "Ryan").filter(s -> s.startsWith("J")).limit(1).forEach(s -> System.out.println(s));
//            System.out.println(
//                    "-------------------------------lenght greater than 4--------------------------------------------------------------------------");
//            arr1.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
//            System.out.println(
//                    "-------------------------------------ends with k--------------------------------------------------------------------");
//            arr1.stream().filter(s -> s.endsWith("k")).forEach(s -> System.out.println(s));
//            System.out.println(
//                    "-----------------------------------starts with r----------------------------------------------------------------------");
//            arr1.stream().filter(s -> s.startsWith("R")).sorted().forEach(s -> System.out.println(s));
//            System.out.println(
//                    "-----------------------------------length greater then 5 and uppercase----------------------------------------------------------------------");
//            arr1.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
//            System.out.println(
//                    "---------------------------------------------------------------------------------------------------------");
//            arr1.stream().filter(s -> s.startsWith("R")).sorted().forEach(s -> System.out.println(s));
//            List<String> arr2 = Arrays.asList("Columbus", "Clinton", "John");
//            Stream<String> arr3 = Stream.concat(arr2.stream(), arr1.stream());
//            arr3.sorted().forEach(s -> System.out.println(s));
//
//            System.out.println(
//                    "---------------------------------------------------------------------------------------------------------");
//
//            List<String> ls = arr1.stream().filter(s -> s.startsWith("R")).sorted().collect(Collectors.toList());
//            System.out.println(ls.get(0));
//            System.out.println(ls.size());
//            ls.forEach(n->System.out.println(n));
//            System.out.println(
//                    "---------------------------------------------------------------------------------------------------------");
//
//            List<Integer> al = Arrays.asList(1,2,5,2,3,3,1,5);
//            al.stream().distinct().sorted().forEach(s->System.out.println(s));
//            al.stream().map(n->n*2).forEach(n->System.out.println(n));
//            System.out.println(
//                    "---------------------------------------------------------------------------------------------------------");
//
//            List <Integer> al2 = al.stream().distinct().sorted().collect(Collectors.toList());
//            System.out.println(al2.get(2));
//            System.out.println(
//                    "---------------------------------------------------------------------------------------------------------");
//            List<Integer> array12 = Arrays.asList(6,7,5,6,2,4);
//            array12.stream().sorted().forEach(n->System.out.println(n));


//            int[] arr= {5,6,1,2,3,4,4,3,1,2};
//            int[] arr2 = {10,11,12,13};
//            Arrays.stream(arr).sorted().distinct().forEach(n->System.out.println(n));
//            IntStream.concat(Arrays.stream(arr),Arrays.stream(arr2)).distinct().sorted().forEach(n->System.out.println(n));
//            Arrays.stream(arr).distinct().sorted().filter(n->n%2==0).forEach(System.out::println);
//            System.out.println("++++++++++++++++");
//            int t= (int) Arrays.stream(arr).filter(n->n%2==0).count();
//            System.out.println(t);
//            Arrays.stream(arr).filter(n->n%2==0);
//            List<String> li = Arrays.asList("Rohit","Ton","David","dar");
//            li.stream().filter(x->x.length()==5).forEach(System.out::println);
//                        int[] arr2 = {4,3,2,1};
//            Arrays.stream(arr2).map(x->x*x).sorted().forEach(System.out::println);
//            System.out.println(Arrays.stream(arr2).reduce((a,b)->a+b));
    String t ="  ROhit Mane a232jgbh # Gsgcjhsu% ugsc&b#899BH@JBJ B^jJ&kn65434k(jb*bjBB) bjcbsd{}  KJN? NKN. vc";
//
//
    int result= t.trim().replaceAll("[a-zA-z0-9\\s]","").length();
//    System.out.println(result);

// int[] t1 = Arrays.stream(t).distinct().sorted().toArray();
//                System.out.println(Arrays.toString(t1));
//            int[] target =  Arrays.stream(t).distinct().sorted().toArray();
//            int[] targetrev = Arrays.stream(t).distinct().boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
//            System.out.println(Arrays.toString(targetrev));
//            int t[]={1,2,2,3,3,4,4,9,8,7,6,7};
//            int tar[] = {2,1,4};
//            String[] ar2 = {"ROhit","David","Tom","Lokesh"};
//            int tar = Arrays.stream(t).reduce(1,(a,b)->a+b);
//
//            Arrays.stream(ar2).filter(n->n.startsWith("R")).forEach(n->System.out.println(n));
//            System.out.println(tar);
//        int ta =(int)    Arrays.stream(tar).reduce(0,(a,b)->a+b);
//List<Integer> lis = Arrays.asList(1,2,3,4,2,3,4,5);
//            System.out.println(findMaxList(lis));
//                Optional<Integer> ols = findMaxList(lis);
//                if(ols.isPresent()){
//                    System.out.println("Max" + ols.get());
//                }else{
//                    System.out.println("NOthing is max");
//                }
//
//            Optional<Integer> ols2=findMinList(lis);
//            {
//                if(ols2.isPresent()){
//                    System.out.println("Min" +ols2.get());
//                }else{
//                    System.out.println("Nothing is min");
//                }


           }
  }


//    public static Optional<Integer> findMaxList(List<Integer> lis){
//   return
//          lis.stream().reduce(Integer::max).orElse(0);
//        lis.stream().reduce((x,y)->x>y?x:y);
//    }
//
//    public static Optional<Integer> findMinList(List<Integer> lis2){
//       return     lis2.stream().reduce((x,y)->x<y?x:y);
//    }
//}
