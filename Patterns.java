import java.util.*;


public class Patterns {

    public static void main(String args[]){

        int i;
        int j;
        System.out.println("height of rectangle?");
        
        Scanner var= new Scanner(System.in);

        i = var.nextInt();

        System.out.println("width of rectangle?");
        
        j = var.nextInt();

        for(int n = 0; n<i; n++){

            for(int m = 0; m<j ; m++){

                System.out.print("o");


            }
            System.out.println("");

        }

    }


}