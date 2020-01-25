//JAC444NEE
//Valentina Derksen
//Student id: 153803184

// Workshop 2
// Date: 2020-01-25


import java.util.Scanner; 
import java.util.Set;
import java.util.HashSet;

public class Task1 {
	
	// Main Method
	public static void main(String[] args) {
		String[] words = {"write", "that", "read", "spagetti", "climate", "flowers", "apple", "watermellon", "aeroplane"};
		boolean play=true;

		do {
			int index=generateRandom(words);
			String wordToFind = words[index];
			// System.out.println("Random word is " + wordToFind);
			
			char WordToGuess[] = toGuess(words,index); 
			char[] wordFound = hashedArray(wordToFind);
			
			int missed = play(WordToGuess, wordFound, wordToFind);
			
			System.out.print("The word is ");
			System.out.print(wordFound);
			System.out.println(". You missed " + missed + " times. ");
			System.out.print("Do you want to guess another word? Enter y or n > ");
			Scanner input2 = new Scanner(System.in);
			char answer = input2.next().charAt(0); 
			play=ifPlay(answer);	
		} while (play);	
	}
	
	
			// Method: generate random index in the array
				public static int generateRandom(String[] array) {
					int randomIndex=(int)(Math.random()*array.length);
					return randomIndex;
			}
			
			// Method: array of chars "Word Found" initialization and initialization to *
			public static char[] hashedArray(String array) {
				char[] wordFound = new char[array.length()];
				for (int i = 0; i < wordFound.length; i++) {
				  wordFound[i] = '*'; 
				}
				return wordFound;
			}
			
			// Method: check if user wants to play 
			public static boolean ifPlay(char answer) {
				boolean play=false;
				switch (answer) {
					case 'y': play=true;
					break;
					case 'n': play=false;
						System.out.println("See you next time!");
					break;
				} 
				return play;
			}
			
			// Method: array of chars "Word to Guess" initialization
			public static char[] toGuess(String[] array, int index) {
				char WordToGuess[] = array[index].toCharArray(); 
				return WordToGuess;
			}
			
			// Method: ask for user's input
			public static String userInput(char[] wordFound) {
				System.out.print("(Guess) Enter a letter in word ");
				System.out.print(wordFound);
				System.out.print(" > ");
				Scanner input = new Scanner(System.in);
				String guess = input.next().substring(0, 1); 
				return guess;
			}
			
			// Method: play the game and return result (missed)
			public static int play(char[] WordToGuess, char[] wordFound, String wordToFind) {
				int missed=0;
				Set<String> previousGuesses = new HashSet<>();
				for (int i = 0; i < WordToGuess.length; i++) 
				{
			        while (!String.valueOf(wordFound).equals(wordToFind)) 
					{
			        	boolean correct=false;
			        	boolean repeated=false;
			        	
						String guess=userInput(wordFound);
						char currentGuess = guess.charAt(0); 
	
						//checks if user already guessed the letter previously
			            if (previousGuesses.contains(guess)) {
			                System.out.println(guess+" is already in the word");
			                repeated = true;
			            }
			            previousGuesses.add(guess);
			            
			          //if the guess is not a duplicated guess, checks if the guessed letter is in the word
			            if (!repeated) {
			                for (int indx = 0; indx < wordToFind.length(); indx++) {
			                    if (WordToGuess[indx] == currentGuess) {
			                    	wordFound[indx] = currentGuess;  //replaces * with guessed letter
			                        correct = true;
			                    }
			                }
			                if (!correct) {
			                    System.out.println("Sorry! " + guess + " is not in the word!");
			                    missed++;
			                }
			            }
					}
				} 
				return missed;
			}
		
}
		



