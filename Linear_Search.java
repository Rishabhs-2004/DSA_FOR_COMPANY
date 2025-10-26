import java.util.*;
public class Linear_Search {

public static int LineraSearch(int num[], int key){
    for(int i=0; i<num.length; i++){
             if(num[i] == key){
                return i;
             }
    }
    return -1;
        }

        public static void main(String[] args) {
        int num [] = {2,4,6,8,10};
        int key = 6;

        int index = LineraSearch(num,key);
            if(index == -1){ 
                System.out.println("No is not found");
            }else{
                System.out.println("It is key index : " +index);
            }
        }

    }

