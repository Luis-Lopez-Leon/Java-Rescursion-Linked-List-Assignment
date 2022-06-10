//Luis Lopez
//Assigment 4


public class BackwardsLinkListApp {

	public static void main(String[] args) {
		
		
		LinkList_A4 wordList = new LinkList_A4();
		
		wordList.insertFirst('F');
		wordList.insertFirst('E');
		wordList.insertFirst('D');
		wordList.insertFirst('C');
		wordList.insertFirst('B');
		wordList.insertFirst('A');
		
		wordList.displayList();//Display Link list in normal order.
		
		System.out.println();
		System.out.print("List (last --> first): ");
		wordList.displayBackwardsRecursively(wordList.getFirst());//Display Link list in reverse
		
		

	}

}
