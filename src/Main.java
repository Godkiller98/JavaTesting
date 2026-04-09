//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;

// Demonstrates finding unique elements in an array using a HashMap to count occurrences.
public class Main {
    public static void main(String[] args) {

// int[] arr={1,2,5,3,3,2,4};
// HashMap<Integer,Integer> map =new HashMap<>();
// for(int nums:arr){
//    map.put(nums,map.getOrDefault(nums,0)+1);
// }
// for(Map.Entry<Integer, Integer> entry:map.entrySet()){
//    if(entry.getValue()==1){
//        System.out.println(entry.getKey());
//    }
// }
//        List<Integer> al=new ArrayList<>();
//        List<Integer> un=new ArrayList<>();
//        for(int nums:arr) {
//            if (!al.contains(nums)) {
//                al.add(nums);
//            }else{
//                un.add(nums);
//            }
//        }


//    int[] n={1,4,10,13,16,19};
//    for(int i=0;i<n.length-1;i++){
//    int t=n[i+1]-n[i];
//    for (int j = 0; j < n.length-1; j++) {
//        if(n[j]+t!=n[j+1]){
//            System.out.println(n[j]+t);
//        }
//    }
//    }

//        List<String> names = Arrays.asList("a", "b", "c", "d");
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            result.add(numbers.get(i) + names.get(i));
//        }
//        System.out.println(result);
//        List<String> result = names.stream()
//                .flatMap(name -> numbers.stream().map(number -> name + number))
//                .collect(Collectors.toList());
//        System.out.println(result);


//        int pos=2,n=5,res=0;
//        System.out.println("n in binary"+Integer.toBinaryString(n));
//        res=1<<pos;
//        System.out.println("bitmask"+Integer.toBinaryString(res));
//        if((res&n)==0){
//            System.out.println("bit is zero");
//        }else {
//            System.out.println("bit is one");
//        }
//
//        System.out.println("Set Bit"+ (res |n)+" "+Integer.toBinaryString(res |n));
//int bitMask=~res;
//        System.out.println("Clear Bit"+ (n & bitMask)+" "+Integer.toBinaryString(n & bitMask));


        // Online Java Compiler
// Use this editor to write, compile and run your Java code online


//                String t="My Name is Rohit Mane";
//                String t2 = t.replaceAll("[^a-zA-Z]","").toLowerCase();
//                char[] c=t2.toCharArray();
//                HashMap<Character,Integer> map=new HashMap<>();
//                for(char c2:c){
//                    map.put(c2,map.getOrDefault(c2,0)+1);
//                }
//                for(Map.Entry<Character,Integer> entry: map.entrySet()){
//                    if(entry.getValue()<2){
//                        System.out.println(entry.getKey());
//                    }
//                }

//        anagram("silent","listen");



//    static boolean anagram(String s,String s2){
//        String t="silent";
//        String t2="listen";
//        HashMap<Character,Integer> map1=new HashMap<>();
//        for(char c1:t.toCharArray()){
//            map1.put(c1,map1.getOrDefault(c1,0)+1);
//        }
//        HashMap<Character,Integer> map2=new HashMap<>();
//        for(char c2:t2.toCharArray()){
//            map2.put(c2,map2.getOrDefault(c2,0)+1);
//        }
//        System.out.println(map1.equals(map2));
//        return map1.equals(map2);

//                 String t="silent";
//         String t2="listen";
//         HashMap<Character,Integer> map1=new HashMap<>();
//         for(char c1:t.toCharArray()){
//             map1.put(c1,map1.getOrDefault(c1,0)+1);
//        }
//         for(char c2:t2.toCharArray()){
//             if (!map1.containsKey(c2))System.out.print("Not a Anagram");
//             else {
//                 int current =map1.get(c2);
//                 map1.put(c2,current-1);
//             }
//         }

// System.out.println(map1);

        String t="aba";
       String t2="";
       for(int i=t.length()-1;i>=0;i--){
           t2=t2+t.charAt(i);
       }
        System.out.println(t.equals(t2));

    }
}


