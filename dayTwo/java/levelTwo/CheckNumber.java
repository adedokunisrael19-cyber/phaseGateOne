import java.util.Scanner;
public class CheckNumber{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
    int number = input.nextInt();
    
  if(number < 0){
  System.out.print("negative");
}else {System.out.print("positive");
   } 
}
}
