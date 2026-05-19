import java.util.Scanner;
public class StarTriangle{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    for (int index =1; index<=5;  index++){
                for (int num =1; num<=index;  num++){
                System.out.print("*");
            }System.out.println();
        }   
    }
}
