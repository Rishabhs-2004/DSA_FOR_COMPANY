import java.util.*;
public class Lirgest_Num {

    public static int getlargest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if (largest < num[i]){
                largest = num[i];
            }   
        }
        
        return largest;
    }
    public static void main(String[] args) {
        int num [] = {1,2,4,5,10,35};
        System.out.println("This is largest num : " + getlargest(num));
    }
}
