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


        int arr1[]={1,2,3,4,5,6,7};
        int target2=9;
        int count=0;
        HashSet<Integer> h1 = new HashSet<>();
        for(int arr3:arr1){
            int comp=target2-arr3;
        if(h1.contains(comp)){
            System.out.println("pair is"+comp + "and" + arr3);
            count++;
        }h1.add(arr3);

        }

// String r ="  ^ 87686  Rohit mane  ";
// StringBuffer s1 = new StringBuffer(r.replaceAll("[^a-zA-Z]",""));
//        System.out.println(s1.reverse());
//
    }
}
