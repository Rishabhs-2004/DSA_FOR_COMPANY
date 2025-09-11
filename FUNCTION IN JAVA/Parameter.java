import java.util.*;

public class Parameter {
     public static int  calculate_Sum(int a, int b){
        int sum = a+b;
        return sum;
     }

     public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate_Sum(a, b);
        System.out.print("Sum values: " + sum);
     }
}
