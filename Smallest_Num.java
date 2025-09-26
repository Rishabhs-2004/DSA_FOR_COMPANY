import java.util.*;
public class Smallest_Num {

    public static int getsmallest(int num []){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num [] = {10,30,3,4,5,8};
           System.out.println("This is smallest num : " +getsmallest(num));
    }
}
