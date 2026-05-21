
import java.util.Arrays;
public class RangeArray{
    public static int[] Largest(int[] arr){
    int largest = arr[0];
    for (i = 0; i <arr.length-1; i++){
       if(arr[i]>arr[0]){
            largest = arr[i];
            }
        }
    
     int smallest = arr[0];
    for (i = 0; i <arr.length-1; i++){
       if(arr[i] < arr[0]){
           smallest = arr[i];
            }
        }
     int [] range = new int [largest - smallest + 1];
    
    for (int index =0; indx<range.length; index++){
        range{index} = smallest;
        smallest ++;

    }
return range;
}

}
