import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortChar {
    public static void main(String[] args) {
//        String s="Hello World";
//        char[] cl=s.toCharArray();
//        List<Character> ls=new ArrayList<>();
//        for(char cs:cl){
//            if(Character.isLetter(cs)){
//                ls.add(cs);
//            }
//        }Collections.sort(ls);
//        int index=0;
//        for(int i=0;i<cl.length;i++){
//            if (Character.isLetter(cl[i])) {
//            cl[i]=ls.get(index);
//            index++;
//            }
//            }
//        System.out.println(new String(cl));

        int[] arr={5,3,2,8,1,4};
        int[] arr2 =Arrays.stream(arr).boxed().sorted((a,b)->b-a).mapToInt(Integer::intValue).toArray();
        List<Integer> ls = Arrays.asList(5,3,2,8,1,4);
        Collections.sort(ls,(a,b)->b-a);
        System.out.println(ls.toString());
        Collections.sort(ls);
    }
    }

