import random
guess = int(input("enter a number: "))
numberGuess = random.randint(1,101)
count =0

while(guess != numberGuess){
    numberGuess = random.randint(1,101)
    guess = int(input("enter a number: "))
    if(guess != numberGuess ):
        count += 1;
            
    elif(guess > numberGuess ):
        print("number is greater")
    elif(guess < numberGuess ):
        print("number is greater")
    elif(guess == numberGuess):
        break;
    elif(count == 5):
        break;
}
