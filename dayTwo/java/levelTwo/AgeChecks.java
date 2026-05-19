import java.util.Scanner;
public class AgeChecks{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter your age");
    int age = input.nextInt();
    

  
    if(age > 20){
        System.out.print("Adult");
    }else if (age > 13 && age < 19){
        System.out.print("Teen");
    }else if (age < 13 ){
        System.out.print("Child");
}    
 
}
}
