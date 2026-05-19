import java.util.Scanner;
public class MultiplicationTable{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number");
    int number = input.nextInt();
    
int multiplication =0;
    
    for (int index =2; index<=50;  index++  ){
            multiplication = number * index;
            System.out.printf("%d X  %d = %d%n", number, index, multiplication ); 
                    
        }   
    }
}
