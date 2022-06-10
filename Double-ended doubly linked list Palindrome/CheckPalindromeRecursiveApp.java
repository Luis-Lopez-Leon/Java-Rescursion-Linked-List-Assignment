//Luis Lopez
//Assigment 4

public class CheckPalindromeRecursiveApp {

	public static void main(String[] args) {
		
		
		//Checking if RACECAR is a palindrome
		
		DoublyLinkedList_A4 wordListPalindrome = new DoublyLinkedList_A4();
		
		wordListPalindrome.insertFirst('R');
		wordListPalindrome.insertFirst('A');
		wordListPalindrome.insertFirst('C');
		wordListPalindrome.insertFirst('E');
		wordListPalindrome.insertFirst('C');
		wordListPalindrome.insertFirst('A');
		wordListPalindrome.insertFirst('R');
		
		wordListPalindrome.displayForward();
		wordListPalindrome.displayBackward();
		
		
		if(wordListPalindrome.checkPalindromeRecursively(wordListPalindrome.getFirst(), wordListPalindrome.getLast()))
			System.out.println("Word is a palindrome\n");
		else
			System.out.println("Word is not a palindrome\n");
		
		System.out.println();
		
		
		//Checking if COFFEE is a palindrome
		
		DoublyLinkedList_A4 wordListNOTPalindrome = new DoublyLinkedList_A4();
		
		wordListNOTPalindrome.insertLast('C');
		wordListNOTPalindrome.insertLast('O');
		wordListNOTPalindrome.insertLast('F');
		wordListNOTPalindrome.insertLast('F');
		wordListNOTPalindrome.insertLast('E');
		wordListNOTPalindrome.insertLast('E');
		
		
		wordListNOTPalindrome.displayForward();
		wordListNOTPalindrome.displayBackward();
		
		
		if(wordListNOTPalindrome.checkPalindromeRecursively(wordListNOTPalindrome.getFirst(), wordListNOTPalindrome.getLast()))
			System.out.println("Word is a palindrome\n");
		else
			System.out.println("Word is not a palindrome\n");
	}

}
