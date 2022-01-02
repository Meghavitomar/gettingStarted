import java.util.*;
public class printingTable {
public static void printingAtable(int n) {
    for(int i = 1; i<=10; i++){
    System.out.println(n + "X" + i + "="+ n*i) ;     }
}
public static void tableInRange(int a, int b) {
    for(int i=a; i<=b; i++ ){
        printingAtable(i);
        System.out.println("====================================");
    }
}

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
   tableInRange(a, b);
}
}




