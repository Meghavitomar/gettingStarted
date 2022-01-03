import java.util.*;

public class rotateAnumber {
    public static int countDigitOfNumber(int n) {
    int count = 0;
     while (n != 0) {
      n /= 10;
     count++;
 }
return count;
  }

public static int rotatenumber(int num,int r){
    int length = countDigitOfNumber(num);
     r = (r%length +length)%length;
    int a = num/(int)Math.pow(10,r);
    int b = num%(int)Math.pow(10,r);
    return (b*(int)Math.pow(10,length-r)+a);
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r = scn.nextInt();
    int ans = rotatenumber(n, r);
    System.out.println(ans);
    scn.close();
}

}
