//Luis Lopez
//Assigment 4

public class DoublyLinkedList_A4 {
	
	private DoublyLink_A4 first;
	private DoublyLink_A4 last;
	
	
	public DoublyLinkedList_A4() {
		
		first = null;
		last = null;
		
	}
	
	public DoublyLink_A4 getFirst() {
		return first;
	}
	public DoublyLink_A4 getLast() {
		return last;
	}
	
	public boolean isEmpty() { 
		
		return first==null;
		
	}
	
	public void insertFirst(char cd) // insert at front of list
	{
		DoublyLink_A4 newLink = new DoublyLink_A4(cd); // make new link
		
	if( isEmpty() ) {// if empty list
		
		last = newLink; // newLink <-- last
		
	}
	else {
		
		first.previous = newLink; // newLink <-- old first
			
	}
	
	newLink.next = first; // newLink --> old first
	first = newLink; // first --> newLink
	
	}
	
	public void insertLast(char cd) // insert at front of list
	{
		DoublyLink_A4 newLink = new DoublyLink_A4(cd); // make new link
		
	if( isEmpty() ) {// if empty list
		
		first = newLink; // newLink <-- last
		
	}
	else {
		
		last.next = newLink; // old last --> newLink
		newLink.previous = last; // old last <-- newLink
			
	}
	
	last = newLink; // newLink <-- last
	
	}
	
	
	public DoublyLink_A4 deleteFirst() // delete first link
	{ // (assumes non-empty list)
		DoublyLink_A4 temp = first;
	if(first.next == null) {// if only one item
		
		last = null; // null <-- last
		
	}
	else {
	
		first.next.previous = null; // null <-- old next
	
	}
	
	first = first.next; // first --> old next
	return temp;
	
	}
	
	public DoublyLink_A4 deleteLast() // delete last link
	{
		
		
		DoublyLink_A4 temp = last;
		if(first.next == null) {// if only one item
			
			first = null; // first --> null
			
		}
		
		else {
			
			last.previous.next = null; // old previous --> null
			
		}
		
		last = last.previous; // old previous <-- last
		return temp;
		
		
	}
	
	
	
	public boolean insertAfter(char key, char cd)
	{ // (assumes non-empty list)
		DoublyLink_A4 current = first; // start at beginning
	while(current.cData != key) // until match is found,
	{
	current = current.next; // move to next link
	if(current == null)
	return false; // didn’t find it
	}
	DoublyLink_A4 newLink = new DoublyLink_A4(cd); // make new link
	if(current==last) // if last link,
	{
	newLink.next = null; // newLink --> null
	last = newLink; // newLink <-- last
	}
	else // not last link,
	{
	newLink.next = current.next; // newLink --> old next
	// newLink <-- old next
	current.next.previous = newLink;
	}
	newLink.previous = current; // old current <-- newLink
	current.next = newLink; // old current --> newLink
	return true; // found it, did insertion
	}
	
	public DoublyLink_A4 deleteKey(char key) 
	{
		
		DoublyLink_A4 current = first; // start at beginning
		
		while(current.cData != key) // until match is found,
		{
		current = current.next; // move to next link
		if(current == null)
		return null; // didn’t find it
		}
		
		if(current==first) // found it; first item?
			first = current.next; // first --> old next
		else // not first
			// old previous --> old next
			current.previous.next = current.next;
		
		if(current==last) // last item?
			last = current.previous; // old previous <-- last
		else // not last
			// old previous <-- old next
			current.next.previous = current.previous;

		return current; // return value
		
		
	}
	
	public void displayForward() {
		
		System.out.print("List (first-->last): ");
		
		DoublyLink_A4 current = first; // start at beginning
		
		while(current != null) // until end of list,
		{
		current.displayLink(); // display data
		current = current.next; // move to next link
		}
		
		System.out.println("");

	}
	
	public void displayBackward() {
		
		System.out.print("List (last-->first): ");

		
		DoublyLink_A4 current = last; // start at end
		while(current != null) // until start of list,
		{
		current.displayLink(); // display data
		current = current.previous; // move to previous link
		}
		
		System.out.println("");
		
	}
	
	
	public boolean checkPalindromeRecursively(DoublyLink_A4 currentFirst, DoublyLink_A4 currentLast) {
		
		
		if(currentFirst == null && currentLast == null)//Base case when it reaches both ends of the doubly list, which is when currentFirst points to null and currentLast points to null.
			return true;
		
		checkPalindromeRecursively(currentFirst.next, currentLast.previous);//Keeps calling itself to traverse through the whole double-ended list from both sides.
		
		if(currentFirst.cData == currentLast.cData)//This check executes once it reaches the base case and then it starts comparing the data from First and Last as its
			return true;							//wrapping up each method.
		else
			return false;//if at any point that both data is not the same, we return false and that means the word is not a palindrome.
		
		
		
		
	
	}


	
	

}
