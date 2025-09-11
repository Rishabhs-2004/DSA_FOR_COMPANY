public class Hello_Ractangle {

public static void helloractangle(int toRows, int toColumn){

    for(int i=1; i<=toRows; i++){
             for(int j=1; j<=toColumn; j++){

        if(i==1 || i==toRows || j==1 || j==toColumn){
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }

          } 
          System.out.println();
      }
  }
    public static void main(String[] args) {
        helloractangle(6,8);
    }
}
