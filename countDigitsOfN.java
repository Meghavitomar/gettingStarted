import java.util.*;
public class countDigitsOfN {
  public static int countdigit(int num) {
      int count = 0;
      while(num!=0){
      num/=10;
      count++;
    
      }
      return count;
  }  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      int ans = countdigit(num);
      System.out.println(ans);
      scn.close(); 
      
  }
}
