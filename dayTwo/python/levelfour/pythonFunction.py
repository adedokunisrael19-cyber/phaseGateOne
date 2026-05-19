
print(add(2,3));
print(evenNumber(30));

print(square(5));

print(conversion(50));

print(principalInterest(2500, 2, 0.5));
    
print( areaOfTriangle(6, 8));
    


    
def  add (firstNumber, secondnumber) :
    return firstNumber + secondnumber;
    

    def  evenNumber(number) :
        if(number %2 ==0) :
            return true;
        return false;
    
    

    
    def square(number) :
        return number * number;
    
    def  conversion( number) :
         fahrenheit = (number * 9/5) + 31;
    return fahrenheit;
        
    
def  primeNumber(number) :
    fahrenheit = (number * 9/5) + 31;
    return fahrenheit;
        

        
def  add(firstNumber, secondNumber, thirdNumber) :
        temp=0;
        maxNum = temp;
        if(secondNumber > firstNumber) :
         temp = secondNumber; 
         secondNumber = firstNumber;
         firstNumber = temp;
        elif (thirdNumber > firstNumber) :
            temp = thirdNumber; 
            thirdNumber  = firstNumber;
            firstNumber = temp;
        return maxNum;
          
    
def  principalInterest(principal, rate, time ):
    principalInterest = (principal * rate * time) / 100;
    return  principalInterest;
        
    
def  areaOfTriangle(length, width) :
    return length * width;
          
        
def  reverse(number):
    reversed =0;
    digit = 0;
    number = digit;
    digit = number %10;
    reversed = (reversed *10 ) +digit;
    number /= 10; 
    return number; 

            


