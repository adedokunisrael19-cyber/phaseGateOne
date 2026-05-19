import java.util.Scanner;
public class DivisionCheck{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter the number ");
    int number = input.nextInt();
    
   
    
    if(number%3 == 0 && number % 5 == 0){
        System.out.print("number is divisible by and 5");
    }else {
     System.out.print("not divisible");

}  
   
}
}
