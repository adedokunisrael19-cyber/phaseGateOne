def RangeArray():
    largest = arr[0];
    for i in range(i, arr.length-1):
       if(arr[i]>arr[0]):
            largest = arr[i]
    
    smallest = arr[0];
    for i in range(1, arr.length-1):
       if(arr[i] < arr[0]):
           smallest = arr[i]
         
    range =  [largest - smallest + 1]
    
    for i in range(1, arr.length-1):
        range[index] = smallest;
        smallest += 1;
    return range;

