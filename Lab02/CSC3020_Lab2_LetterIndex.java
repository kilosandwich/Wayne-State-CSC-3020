/******************************************************************************

Write a program that will read a line of text. Display all the letters that occure in the text, one per
line and in alphabetical order, along with the number of times each letter occurs in the text. Use
an array of base type int of length 26, so that the element at index 0 contains the number of a’s,
the element at index 1 contains the number of b’s, and so forth, Allow both upperCase and lower
Case. Define a method that takes a character as an argument and returns an int value that is the
correct index for that character. For example, the argument ‘a’ results in 0 as the return value, the
argument ‘b’ gives 1 as the return value, and so on. Allow the user to repaet this task until the
user says she/he is through.
Sample output:


*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void letterer(){
        //This method handles the objectives of the assignment:
        //it does so by taking an input as a string
        //finding the index of the character for the string of that input
        //then comparing each string to the alphabet as defined in upper and lower Case
        //once it is compared to the alphabet, the corresponding array for that alphabet is
        //incremented by one
        //The alphabet and array position for the corresponding alphabet are then printed. 
        
        //Define variables
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphlow = "abcdefghijklmnopqrstuvwxyz";
        int[] array = new int[26];
        
        //get user input
        System.out.println("Please input a string: ");
        Scanner input = new Scanner(System.in);
        String inputstring = input.nextLine();
        
        //incremenet the array based on the value of the char for the alphabet
        for(int i=0; i < inputstring.length(); i++){
            char temp = inputstring.charAt(i);
            
            for(int j=0; j < alph.length(); j++){
                //this only checks what letter of the alphabet is there, because
                //it is only checking against a defined alphabet, it can handle
                //any input. Yay!
                if(temp == alph.charAt(j)){
                    array[j]++;
                }else if(temp == alphlow.charAt(j)){
                    array[j]++;
                }
            }
        }
        
        //display the array and corresponding letter of the alphabet
        for(int i=0; i<26; i++){
            if(array[i] >0){
                System.out.println(alph.charAt(i) + ": " + array[i]);
            }
        }
        
    }
    
    //Define a method that takes a character as an argument,
    //and returns an int value that is the correct index for that character.
    //I don't use this method, it does not fit in my design. 
    public static int letterindex(char inputchar){
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphlow = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i< alph.length();i++){
            if(inputchar == alph.charAt(i)){
                return i;
            }else if(inputchar == alphlow.charAt(i)){
                return i;
            }else{
                return -1;
            }
            
        }
        return -1;

    }
    
	public static void main(String[] args) {
	    //the main function calls the letterer function which does the main task over and over.
		String anotherline = "y";
        
        //the string was unreliable, therefore I only check what the first letter is. 
        //Theoretically someone could enter 'yams' and it would work, but they didn't enter n,
        //so they want it to work. 
		while(anotherline.charAt(0) == 'y'){
		    letterer();
		    System.out.println("Enter another line? (y for yes, n for no)");
		    Scanner another = new Scanner(System.in);
		    anotherline = another.nextLine();
		    
		}

	}
}
