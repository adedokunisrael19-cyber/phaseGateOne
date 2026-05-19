import java.util.Scanner;
public class CheckEven{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
    int number = input.nextInt();
    
  if(number %2 == 0){
  System.out.print("even");
}else {System.out.print("odd");
   } 
}
}
