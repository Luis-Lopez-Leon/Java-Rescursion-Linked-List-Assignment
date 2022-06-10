
//Link class for assignment 4
//Luis Lopez
//Assigment 4

public class Link_A4 {
	
	public char cData;
	public Link_A4 next;
	
	public Link_A4(char cd) {
		
		cData = cd;
		next = null; //I set it to null for clarity. ('next' is automatically set to null if not initialized)
	}
	
	
	public void displayLink() {
		
		System.out.print("{" + cData + "} ");
		
	}
	
	
	
	

}
