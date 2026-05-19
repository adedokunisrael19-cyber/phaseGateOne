const prompt = require("prompt-sync")()
const number = Number(prompt("enter a number"))
sum = 0;
for (let i = 0; i<= number; i++){
    sum = sum + number;
}
console.log(sum);
