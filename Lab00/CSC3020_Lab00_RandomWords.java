/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
    
    public static void random_Words(){
        System.out.print("Enter the number of random words you would like to generate: ");
        Scanner input = new Scanner(System.in);
        int wordsToGenerate = input.nextInt();
        System.out.println(" ");
        String alphabet = "BCDFGHJKLMNPQRSTVWXYZ";
        
        for(int i=0; i< wordsToGenerate; i++){
            int wordLength = (int)(Math.random()*6 + 3);
            for(int j=0; j<wordLength; j++){
                int randomLetter =  (int)(Math.random()*(alphabet.length() ) );
                System.out.print(alphabet.charAt(randomLetter));
            }
            System.out.print(" ");
        }
        
        
    }
	public static void main(String[] args) {
		random_Words();
	}
}
