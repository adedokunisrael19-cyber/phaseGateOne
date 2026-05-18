

        java.util.Random randomNumber = new java.util.Random();

        int numberGuess = randomNumber.nextInt(100);
        print(numberGuess);

       
        
      const prompt = require("prompt-sync")
      const = number("enter a random guess: ");
      const guess = input.nextInt();
    
        const count = 0;
        const rightGuess = 0;
        const  wrongGuess = 0;

   
          if(guess < numberGuess ){
                console.log("number is lesser ");
            
             }else if(guess > numberGuess ){
                console.log("number is greater");
             }  
         
            while(guess != numberGuess){
                      console.logln(numberGuess);
                if(guess == numberGuess){
                    break;
                }
                 console.log("enter a random guess: ");
                guess = input.nextInt();
                wrongGuess ++;
                 if(wrongGuess == 5){
            break;    
            }
        }
       if(wrongGuess ==1){
          console.log("Legend");    
        }else if(wrongGuess ==2){
          console.log("excellent");    
        }else if(wrongGuess <=3 || wrongGuess <=4){
          console.log("Good");   
       } else{
          console.log("No win, back luck");    
        }
            
        console.log("correct number is" %d%n, "you attempted it", %d%n "times, rating %d%n", )
        
    }
}
