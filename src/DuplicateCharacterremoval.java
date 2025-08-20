import java.util.ArrayList;

public class DuplicateCharacterremoval {
    public static void main(String[] args){
//        String r = "Rohit Mane aksksk Rohit Mane";
//        String res = r.replaceAll("[\\s]","");
//        char[] arr=res.toCharArray();
//        ArrayList<Character> li = new ArrayList<>();
//        for(char arrs: arr){
//            if(!li.contains(arrs)){
//                li.add(arrs);
//            }
//        }
//        System.out.println(li.toString());

        for(int n=2;n<51;n++){
            if(isPrime(n)==true){
                System.out.println("Prime" + n);
            }
        }
    }
private static Boolean isPrime(int n){
        Boolean isprimenum=true;
    for (int i = 2; i < n; i++) {
        if(n%i==0){
            isprimenum=false;
            break;
        }
    }return isprimenum;
}

}
