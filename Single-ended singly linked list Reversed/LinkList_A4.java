//Luis Lopez
//Assigment 4


public class LinkList_A4 {
	
	
private Link_A4 first; // ref to first link on list
	
	public LinkList_A4(){ // constructor
		
		first = null; // no items on list yet
	
	}
	
	public boolean isEmpty() { // true if list is empty
	
		return (first == null);
	
	}
	
	public Link_A4 getFirst() {//Get first method since first is private
		
		return first;
	}
	
	// insert at start of list
	public void insertFirst(char id) {
		
	 // make new link
		Link_A4 newLink = new Link_A4(id);
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	
	}
	
	public Link_A4 deleteFirst() { // delete first item
		
		// (assumes list not empty)
		Link_A4 temp = first; // save reference to link
		first = first.next; // delete it: first-->old next
		return temp; // return deleted link
	
	}
	
	public void displayList(){
		
		System.out.print("List (first --> last): ");
		Link_A4 current = first; //current is a walker starts pointing at first link
		while(current != null) {//loops until current points at the last link
		
			current.displayLink();
			current = current.next;
		
		}
		
		System.out.println();
	
	}

	
	public Link_A4 find(char key) {//find a link with given key assuming non-empty list
		
		Link_A4 current = first;// starts at the beginning of list
		
		while(current.cData != key) {//loops if there is no match
			
			if(current.next == null)// if last link's next is null then we did not find the key
				return null;
			else
				current = current.next;// go to next link
			
		}
		
		return current; //we found the key. this line will ONLY execute if the key was found
		
	}
	
	public Link_A4 delete(char key) {//delete link with given key
		
		Link_A4 current = first;
		Link_A4 previous = first;
		
		while(current.cData != key) {
			
			if(current.next == null)
				return null; //we did not find key
			else {
				
				previous = current; //previous now pointing to where current was
				current = current.next; //and current is now pointing to the next link
				
			}
				
		}
		
		//below will execute if key was found!
		
		if(current == first) //if key is first link
			first = first.next; //delete first link by first pointing at the second link
		else
			previous.next = current.next;//if key is not the first link, bypass it. previous.next will now point where current.next was, thus "deleting" the link where current is pointing at.
		
		return current;
		
	}
	
	public void displayBackwardsRecursively(Link_A4 current) {
		//Use recursive technique to call the method everytime as it reads a link then put it on hold as it traverses to the end. 
		//Then once it reaches the end, it will finish up each method from the end and display each link as backwards.
		//Base case will be when current points to null
		
		
		if(current == null)//Base case when it reaches the end of the list, which is when current points to null.
			return;
		
		displayBackwardsRecursively(current.next);//Will continue to call itself until it reaches the base case
		
		
		current.displayLink();//This will execute once it reaches the base case starting from where the pointer current was null, so from the end of the link list.
												//then it will start wrapping up each method starting from the end.
		
		
		
		
	}

}
