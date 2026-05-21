//import java.util.Arrays;
//public class ArrayNumber{
//    public static void main(String[] args) {
//        int number = 6;
//        int[] arr = {8,6,12,4,-2};
//
//    for (int i = 0; i <arr.length; i++){
//        for (int j=0; j<arr.length; j++){
//                if(arr[j] +arr[i] == number){
//            System.out.print(arr[i]);
//            //System.out.print(Arrays.toString(reverse));    
//                }
//            }
//        }
//    }
//}
//
//

import java.util.Arrays;
public class ArrayNumber{
    public static int[] ArrayCheck(int number, int[] arr){
       
        int [] factors = new int[2];
           int i = 0;
           int j = 0;
    for (i = 0; i <arr.length-1; i++){
        for (j=0; j<arr.length-1; j++){
                if(arr[j] + arr[i]== number){
                factors[0] = arr[0];
                factors[1] = arr[1];
                }
            }
        }  return new int []{arr[i], arr[j]};
//          } return arr[i];

    }
}


