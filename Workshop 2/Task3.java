//JAC444NEE
//Valentina Derksen
//Student id: 153803184

// Workshop 2
// Date: 2020-01-25


import java.util.Scanner; 

public class Task3 {
	
	// Main Method
	public static void main(String[] args) {
		
		System.out.println("Enter a credit card number as a long integer: ");
		Scanner input = new Scanner(System.in);
		long number = input.nextLong(); 
		  
		System.out.println(number + " is " +  
				(isValid(number) ? "valid" : "invalid")); 
	} 
	
		  
			// Method 1: return true if the card number is valid 
			public static boolean isValid(long number) { 
				return (numberOfDigits(number) >= 13 &&  numberOfDigits(number) <= 16) &&  
				       (matchPrefix(number, 4) ||  matchPrefix(number, 5) ||  matchPrefix(number, 37) ||  matchPrefix(number, 6)) &&  
				       ((sumOfDoubleEvenPlace(number) +  sumOfOddPlace(number)) % 10 == 0); 
			} 
				  
			// Method 2: get the result from Step 2 
			public static int sumOfDoubleEvenPlace(long number) { 
				int sum = 0; 
				String num = number + ""; 
				for (int i = numberOfDigits(number) - 2; i >= 0; i -= 2)  
					sum += returnDigit(Integer.parseInt(num.charAt(i) + "") * 2); 
				          
				return sum; 
			} 
				  
			// Method 3: return this number if it is a single digit, 
			// otherwise, return the sum of the two digits 
			public static int returnDigit(int number) { 
				if (number < 9) 
					return number; 
				return number / 10 + number % 10; 
			} 
				  
			// Method 4: return sum of odd-place digits in number 
			public static int sumOfOddPlace(long number) { 
				int sum = 0; 
				String num = number + ""; 
				for (int i = numberOfDigits(number) - 1; i >= 0; i -= 2)  
					sum += Integer.parseInt(num.charAt(i) + "");         
				return sum; 
			} 
				  
			// Method 5: return true if the digit d is a prefix for number 
			public static boolean matchPrefix(long number, int d) { 
				return returnPrefix(number, numberOfDigits(d)) == d; 
			} 
				  
			// Method 6: return the number of digits in d 
			public static int numberOfDigits(long d) { 
				String num = d + ""; 
				return num.length(); 
			} 
				  
			// Method 7: return the first k number of digits from number.
			// If the number of digits in number is less than k, return number.
			public static long returnPrefix(long number, int k) { 
				if (numberOfDigits(number) > k) { 
					String num = number + ""; 
				    return Long.parseLong(num.substring(0, k)); 
				} 
				return number; 
			} 

} 

	


