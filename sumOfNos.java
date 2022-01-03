import java.util.*;

public class sumOfNos {
  public static void sum(int a,int b) {
      System.out.println("sum is "+ (a+b));
  }  
  public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      sum(a, b);
      scn.close();
  }

}
