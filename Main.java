package Week1_Q1;

import java.util.Scanner;
/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Main {

	public static void main(String[] args) {
		
		/**
		 *  Part a)	Write an application using an int and String variable, a while loop and two if tests to output the beer bottle song to the screen:
		 */
		
		SongProcess songVersion1 = new SongProcess();
		
		songVersion1.showResult();
		
		/**
		 *  Part b)	When you have the program working as above, alter it to deal with any number of bottles where the number is entered from the keyboard.
		 */
		
		int bottlesQty;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter number of bottles: ");
		
		while(!userInput.hasNextInt())
		{
			System.out.println("Oops wrong input! Please try again");
			userInput.next();
		}
		
		bottlesQty = userInput.nextInt();
		
		SongProcess songVersion2 = new SongProcess(bottlesQty);
		
		songVersion2.showResult();
		
		userInput.close();
	}

}
