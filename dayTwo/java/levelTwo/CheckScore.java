import java.util.Scanner;
public class CheckScore{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter your score ");
    int number = input.nextInt();
    
  if(number >= 50){
  System.out.print("pass");
}else {System.out.print("failed");
   } 
}
}
