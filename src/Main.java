//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Demonstrates finding unique elements in an array using a HashMap to count occurrences.
public class Main {
    public static void main(String[] args) {

int[] arr={1,2,5,3,3,2,4};
HashMap<Integer,Integer> map =new HashMap<>();
for(int nums:arr){
   map.put(nums,map.getOrDefault(nums,0)+1);
}
for(Map.Entry<Integer, Integer> entry:map.entrySet()){
   if(entry.getValue()==1){
       System.out.println(entry.getKey());
   }
}
       List<Integer> al=new ArrayList<>();
       List<Integer> un=new ArrayList<>();
       for(int nums:arr) {
           if (!al.contains(nums)) {
               al.add(nums);
           }else{
               un.add(nums);
           }
       }
    //    al.removeAll(un);
    //    System.out.println(al.toString());
}
        }

