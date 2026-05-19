
   const result =  add(2,3);
    console.log(result);

    console.log(evenNumber(30));

    console.log(square(5));

    console.log(conversion(50));

    console.log(principalInterest(2500, 2, 0.5));
    
    console.log( areaOfTriangle(6, 8));
    


    

function  add(firstNumber, secondnumber){
        return firstNumber + secondnumber;
    }

function  evenNumber(number){
        if(number %2 ==0){
            return true;
        }return false;
    
    }

    
function square(number){
        return number * number;
    }
function  conversion( number){
            const fahrenheit = (number * 9/5) + 31;
        return fahrenheit;
        }
    
          function  primeNumber(number){
            const fahrenheit = (number * 9/5) + 31;
        return fahrenheit;
        }

        
    function  add(firstNumber, secondNumber, thirdNumber){
    const temp=0;
      const maxNum = temp;
        if(secondNumber > firstNumber){
          // temp = secondNumber; 
              secondNumber = firstNumber;
              firstNumber = temp;
        }else if( thirdNumber > firstNumber){
              temp = thirdNumber; 
              thirdNumber  = firstNumber;
              firstNumber = temp;
          }return maxNum;
         } 
    
      function  principalInterest(principal, rate, time ){
             principalInterest = (principal * rate * time) / 100;
        return  principalInterest;
        }
    

         function  areaOfTriangle(length, width){
             return length * width;
          }
        
          function  reverse(number){
                 const  reversed =0;
                const digit = 0;
                number = digit;
                digit = number %10;
               reversed = (reversed *10 ) +digit;
                number /= 10; 
                return number; 

            }


