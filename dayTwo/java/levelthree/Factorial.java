import java.util.Scanner;
public class Factorial{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number");
    int number = input.nextInt();
    
int multiplication =1;
    
    for (int index =1; index<= number;  index++  ){
            multiplication =multiplication * index;
          
                    
        }    System.out.print(multiplication);  
    }
}
