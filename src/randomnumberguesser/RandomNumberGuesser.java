/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumberguesser;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Sifiso
 */
public class RandomNumberGuesser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Number of attempts the user has
        int attemptCount = 10;
        
        numberGuess(attemptCount);
        
    }
    
    public static void numberGuess(int attemptCount){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        //Generates a random number between 0 and 100
        int ranNum = rand.nextInt(100);
        
        //Keep iterating until there are no attempts left
        while(attemptCount != 0){
            //Gets user's guess
            System.out.print("Guess an number between 0 and 100: ");
            int guessNum = scan.nextInt();
            
            //Compares users guess to the random number and returns appropriate response
            if(guessNum == ranNum){
                System.out.println(guessNum + " is the correct number");
                break;
            } else if(guessNum > ranNum+10){
                System.out.println("*****Too High. Try Again*****");
                attemptCount -= 1;
                System.out.println("!!!!You Have "+ attemptCount +" Attempts Left!!!!");
            } else if(guessNum < ranNum-10){
                System.out.println("*****Too Low. Try Again*****");
                attemptCount -= 1;
                System.out.println("!!!!You Have "+ attemptCount +" Left!!!!");
            } else if(guessNum > ranNum){
                System.out.println("***Little Higher. Try Again***");
                attemptCount -= 1;
                System.out.println("!!!!You Have "+ attemptCount +" Left!!!!");
            } else if(guessNum < ranNum){
                System.out.println("***Little Lower. Try Again***");
                attemptCount -= 1;
                System.out.println("!!!!You Have "+ attemptCount +" Left!!!!");
            }
            
            //Alerts user that attempts have run out
            if(attemptCount == 0){
                System.out.println("No more attempts left :(");
            }
        }
        
    }
    
}
