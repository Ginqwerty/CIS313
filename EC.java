import java.util.Scanner;

public class EC {
	public static void main(String[] args){
		String getline;
		// Create a Scanner that reads system input
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		// Loop over the scanner's input
		// For each line of the input, send it to isPalindrome()
		// If isPalindrome returns true, print "This is a Palindrome." 
		// Otherwise print "Not a Palindrome."
		while(scan.hasNextLine()){
			getline = scan.nextLine();
			if (isPalindrome(getline) == true){
				System.out.println("This is a Palindrome.");
			}
			else{
				System.out.println("Not a Palindrome.");
			}
		}
		// Close the Scanner		
		scan.close();
	}
	
	public static boolean isPalindrome(String s){
		Stack<Character> stack = new Stack<Character>();
		TwoStackQueue<Character> queue = new TwoStackQueue<Character>();
		
		for(int i =0; i< s.length();i++){
			queue.enqueue(s.charAt(i));
			stack.push(s.charAt(i));
		}
		boolean check = false;
		while(!stack.isEmpty() & !queue.isEmpty()){
			if(stack.pop().getData() != queue.dequeue().getData()){
				check = false;
			}
			else{
				check = true;
			}
		}
		// Create a stack and a Queue of chars that represents the passed in string
		// Hint: While you loop through the given string, push the same char onto your stack
		//		 that you enqueue into your Queue. This way you can use dequeue to get 
		//       the string from left to right, but you pop the string from right to left
		
		// Compare your Queue and Stack to see if the input String was a Palindrome or not	
		return check;
	}
	
	//public static boolean isPalindromeEC(String s){
	
		// Implement if you wish to do the extra credit.
		
	//}
}
