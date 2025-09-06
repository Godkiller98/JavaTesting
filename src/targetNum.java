import java.util.HashSet;

// Demonstrates two functionalities:
// 1. (Commented out) Finding pairs in an array that sum to a target value using a HashSet.
// 2. Reversing the last name in a string after removing spaces.
public class targetNum {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 3, 5, 6, 1, 7};
//        int target = 8;
//        HashSet<Integer> set=new HashSet<>();
//        int sub=0;
//        for(int arrs:arr){
//            sub=target-arrs;
//            if(set.contains(sub)){
//                System.out.println("COmpliement" + sub + "e" + arrs);
//            }set.add(arrs);
//        }
        String r = "Rohit Mane";
        StringBuffer rs = new StringBuffer(r.split(" ")[1].replaceAll("[\\s]","")).reverse();
        System.out.println(rs);
    }
}
