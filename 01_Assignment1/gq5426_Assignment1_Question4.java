/******************************************************************************

4.	(8 points) Write a program that generates a lottery of a three-digit number. The program prompts the user to enter a three-digit number and determines whether the user wins according to the following rules:
a.	If the user input matches the lottery number in the exact order, the award is $10,000.
b.	If all digits in the user input match all digits in the lottery number, the award is $3,000.
c.	If one digit in the user input matches a digit in the lottery number, the award is $1,000.


Here are sample runs:
Enter your lottery pick (three digits): 591
Lottery is 248
Sorry, no match

Enter your lottery pick (three digits): 987
Lottery is 637
Match one digit: you win $1,000

Enter your lottery pick (three digits): 683
Lottery is 836
Match all digits: you win $3,000

Enter your lottery pick (three digits): 494
Lottery is 494
Exact match: you win $10,000

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void lottery(){
        int prize = 0;
        //eh entering it as one number is stupid,
        Scanner userInput = new Scanner(System.in);
        System.out.println("DO NOT ENTER MORE THAN ONE DIGIT"); //blame the user so it's their fault not mine
        System.out.println("Enter your lottery pick (digit one)");
        int intInput1 = userInput.nextInt();
        System.out.println("Enter your lottery pick (digit two)");
        int intInput2 = userInput.nextInt();
        System.out.println("Enter your lottery pick (digit three");
        int intInput3 = userInput.nextInt();
        
        int lotteryNum1 = (int)(Math.random() * 9 ); //0 to 9 (zero is a number)
        int lotteryNum2 = (int)(Math.random() * 9 ); //0 to 9 (zero is a number)
        int lotteryNum3 = (int)(Math.random() * 9 ); //0 to 9 (zero is a number)
        System.out.println("Winning Number is " + lotteryNum1+lotteryNum2+lotteryNum3);
        if((intInput1 == lotteryNum1) && (intInput2 == lotteryNum2) && (intInput3 == lotteryNum3)  ){
            prize = 10000;
            System.out.println("Matched All Digits and Order! Prize is " + prize);
        }else if(
            ((intInput1 == lotteryNum1) || (intInput1 == lotteryNum2) || (intInput1 == lotteryNum3))
            &&
            ((intInput2 == lotteryNum1) || (intInput2 == lotteryNum2) || (intInput2 == lotteryNum3))
            &&
            ((intInput3 == lotteryNum1) || (intInput3 == lotteryNum2) || (intInput3 == lotteryNum3))
            ){
            //hindsight I should've used a for loop, whatever. 
            prize = 3000;
            System.out.println("Matched All Digits! Prize is " + prize);
        }else if(
            ((intInput1 == lotteryNum1) || (intInput1 == lotteryNum2) || (intInput1 == lotteryNum3))
            ||
            ((intInput2 == lotteryNum1) || (intInput2 == lotteryNum2) || (intInput2 == lotteryNum3))
            ||
            ((intInput3 == lotteryNum1) || (intInput3 == lotteryNum2) || (intInput3 == lotteryNum3))
            ){
            prize = 1000; 
            System.out.println("Matched One Digit, Prize is " + prize);
        }else{
            //include an anti-gambling message. 
            System.out.println("Sorry, no matches. The safest bet is not to gamble at all");
        }

        

        
    }
	public static void main(String[] args) {
        lottery();
	}
}
