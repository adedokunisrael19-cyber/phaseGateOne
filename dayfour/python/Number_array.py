def ArrayNumber(number, arr[]):
    number = 6
    
    for i in range(arr.length-1):
        for j in range(arr.length-1):
            if(arr[i] +arr[j] == number):
                print[i,j]
