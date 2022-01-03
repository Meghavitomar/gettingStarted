import java.util.*;

public class inverseOfaNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int inv = 0;
        int op = 1;
        while(num!=0){
            int od = num%10;
            int id = op;
            int ip = od;
            inv = inv + id*(int)Math.pow(10,ip-1);
            num=num/10;
            op++;
        }
        System.out.println(inv);
    }
}
