import java.util.*;
public class reverseNum {
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        while(num!=0){
            int ans = num%10;
            num/=10;
            System.out.print(ans);
            scn.close();
        }
    }
}
