// JAC444NEE
// Valentina Derksen
// Student id: 153803184

import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System. in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userInput = input. nextInt();
		
		String user="";
		switch (userInput) {
		case 0: user = "scissor";
		break;
		case 1: user = "rock";
		break;
		case 2:	user = "paper";
		break;
		}
		
		int compInput=(int)(Math.random() * 3);
		String comp="";
		switch (compInput) {
		case 0: comp = "scissor";
		break;
		case 1: comp = "rock";
		break;
		case 2:	comp = "paper";
		break;
		}
		
		if(userInput==1 && compInput==0) 
			System.out.println("The computer is "+ comp +". You are "+ user +". You won");
		if(userInput==2 && compInput==1) 
			System.out.println("The computer is "+ comp +". You are "+ user +". You won");
		if(userInput==0 && compInput==2) 
			System.out.println("The computer is "+ comp +". You are "+ user +". You won");
		else if(compInput==1 && userInput==0) 
			System.out.println("The computer is "+ comp +". You are "+ user +". You lost");
		else if(compInput==2 && userInput==1) 
			System.out.println("The computer is "+ comp +". You are "+ user +". You lost");
		else if(compInput==0 && userInput==2) 
			System.out.println("The computer is "+ comp +". You are "+ user +". You lost");
		else if (compInput==userInput)
			System.out.println("The computer is "+ comp +". You are "+ user +" too. It is a draw ");

		
	}

}
