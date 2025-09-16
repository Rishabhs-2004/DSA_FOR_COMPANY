public class Hollow_Ractangle_Pattern {



    public static void hellorectangle(int torows, int tocolumn){
                for(int i=1; i<=torows; i++){
                    for(int j=1; j<=tocolumn; j++){
                        if(i==1 || i==torows || j==1 || j==tocolumn){
                            System.out.print(" *");
                        }else{ 
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
    }
 public static void main(String[] args) {
    hellorectangle(4,6);
 }     
}
