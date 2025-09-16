public class Inverted_And_Rotated_Half_Pyramid {


public static void invertedrotatedhlfpyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        invertedrotatedhlfpyramid(8);
    }
}
