/**
	head -> second -> third -> fourth 
*/

public class LinkedList{

	public static void main(String[] args){
		LinkedNode head = new LinkedNode(1);
		LinkedNode second = new LinkedNode(2);
		head.setNext(second);
		LinkedNode third = new LinkedNode(3);
		second.setNext(third);
		LinkedNode fourth = new LinkedNode(4);
		third.setNext(fourth);				
		LinkedList ll = new LinkedList();
		ll.iterate(head);
	}

	public void iterate(LinkedNode head){
		while(head != null){
			System.out.println(head.getData());
			head = head.getNext();
		}
	}
}

class LinkedNode{

	private int data;
	private LinkedNode next = null;
	
	public LinkedNode(int data){
		this.data =  data;
	}

	public int getData(){
		return data;
	}

	public void setNext(LinkedNode value){
		this.next = value;
	}

	public LinkedNode getNext(){
		return this.next;
	}

}
