
function RangeArray(arr ){
    arr = [3,4,5,6,7,8,9]
    const largest = arr[0];
    for (let i = 0; i <arr.length-1; i++){
       if(arr[i]>arr[0]){
            largest == arr[i];
            }
        }
    
     let smallest = arr[0];
    for (let i = 0; i <arr.length-1; i++){
       if(arr[i] < arr[0]){
           smallest == arr[i];
            }
        }
    let  range = [largest - smallest + 1]
    
    for (let index =0; index<range.length; index++){
        range [index] = smallest;
        smallest = smallest+ 1;

    }
    return range;


