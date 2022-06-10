//Doubly Link class for assignment 4
//Luis Lopez
//Assigment 4

public class DoublyLink_A4 {

	public char cData;
	public DoublyLink_A4 next;
	public DoublyLink_A4 previous;
	
	public DoublyLink_A4(char cd) {
		
		cData = cd;
		next = null; //I set it to null for clarity. ('next' is automatically set to null if not initialized)
	}
	
	
	public void displayLink() {
		
		System.out.print("{" + cData + "} ");
		
	}
	
}
