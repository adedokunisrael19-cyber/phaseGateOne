function ArrayCheck(int number, int[] arr){
       const number = 6;
       int[] factors = new int[2];
    for (let i = 0; i <arr.length; i++){
        for (let j=0; j<arr.length; j++){
                if(arr[j] +arr[i]== number){
               let numone = arr[i];
               let numtwo = arr[j];
            factors = {numone, numtwo};
              
                }
            }
        }  return factors;
    }
}
