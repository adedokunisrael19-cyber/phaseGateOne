import java.util.Scanner;
public class Summation{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number");
    int number = input.nextInt();
    
int sum =1;
    
    for (int index =1; index<= number;  index++  ){
            sum =sum + index;
         
                    
        }    System.out.println(sum);   
    }
}
