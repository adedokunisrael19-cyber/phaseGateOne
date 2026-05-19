import java.util.Scanner;
public class DigitCounts{
  public static void main(String[] args){
        int number = 56473;   

    int count = 0;
 int original =0;
    for (int index =1; index<=5;  index++){
              int  digits = number / 10;
             original   = (original * 10 )+ digits;
                count ++;
            }System.out.print(count);
         
    }
}
