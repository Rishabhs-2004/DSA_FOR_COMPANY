import java.util.*;
public class Reverse_Arr {

public static void reverse(int num []){
    int start = 0 ,  last = num.length-1;;

    while (start < last) {
        int temp = num[last];
         num[last] = num[start];
         num[start] = temp;
         start++;
         last--;

    }
}

 public static void main(String[] args) {
    int num [] = {2,3,4,5,6,7,8,9};

    reverse(num);
    for(int i=0; i<num.length; i++){
      System.out.print(num[i] + " ");
    }

    System.out.println();
 }    
}
