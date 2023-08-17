package BetterTomorrow_LinkedList;
import java.util.*;

class Node{
	
	int data;
	Node next;
	
	Node(int x){
		data = x;
		next = null;
	}
	
}

public class LinkedListProblemSolving {

	

	static Node insertBegining(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	static Node insertEnd(Node head, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return head;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return head;
		
	}
	
//	static Node2 insertBegining(Node2 head2, int data) {
//		Node2 newNode = new Node(data);
//		newNode.next = head;
//		head = newNode;
//		return head;
//	}
//	
//	static Node2 insertEnd(Node2 head2, int data) {
//		Node2 newNode = new Node2(data);
//		if(head == null) {
//			head = newNode;
//			return head;
//		}
//		Node2 temp = head;
//		while(temp.next != null) {
//			temp = temp.next;
//		}
//		temp.next = newNode;
//		return head;
//		
//	}
	
	static void display(Node temp) {
		System.out.println("Linked List Set:");
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	static int calcSize(Node temp) {
		int count = 0;
		while(temp!=null){
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	static void maxElement(Node temp) {
		int max = Integer.MIN_VALUE;
		while(temp!=null) {
			if(max<temp.data) {
				max = temp.data;
			}
			temp = temp.next;
		}
		System.out.println();
		System.out.println("Max value in the list is");
		System.out.print(max);
	}
	
	static boolean search(int key, Node temp) {
		while(temp!=null) {
			if(key == temp.data) {
				return true;
			}
			temp = temp.next;  
		}
		return false;
	}
	
	static int occurance(int k, Node temp) {
		int count = 0;
		while(temp!=null) {
			if(k == temp.data) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}
	
	static int nthNodeValue(int n, Node head) {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		
		temp = head;
		for(int i=0; i<count-n; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	static int printMiddleElement(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
	static Node deletePosition(Node head, int pos) {
		Node temp = head;
		Node prev = null;
		int size = calcSize(head);
		if(pos < 1 || pos > size) {
			System.out.println("-1");
			return head;
		}
		if(pos == 1) {
			head = temp.next;
			System.out.println("Deleted Item : "+temp.data);
			return head;
		}
		while(pos-- > 0) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		System.out.println();
		System.out.print("Deleted item: "+temp.data);
		return head;
	}
	
	static Node reverse(Node head) {
		Node temp = head;
		Node prev = null;
		Node next = null;
		while(temp!=null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			
		}
		head = prev;
		return head;
	}
	
//	static node2 getIntersectionNode(Node2 head1,Node2 head 2) {
//		Node2 temp1 = head1;
//		Node2 temp2 = head2;
//		HashSet<Node2> hs = new Set<>();
//		while(temp!=null) {
//			hs.add(temp1);
//			temp1 = temp1.next;
//		}
//		while(temp2!=null) {
//			if(hs.contains(temp2)) {
//				return temp2;
//			}
//			temp2 = temp2.next();
//		}
//		return null;
//	}
	
	public static void main(String[] args) {
		
		Node head = null;
		head = insertBegining(head, 15);
		head = insertBegining(head, 10);
		head = insertBegining(head, 5);
		head = insertBegining(head, 5);
		display(head);
		head = insertEnd(head,20);
		head = insertEnd(head,25);
		head = insertEnd(head,30);
		head = insertEnd(head,35);
		display(head);
		
		int node_size = calcSize(head);
		System.out.println();
		System.out.println("No of elements in the list is : ");
		System.out.println(node_size);
		
		maxElement(head);
		
		boolean search=search(10, head);
		System.out.println();
		System.out.println();
		System.out.println("Check for key element : ");
		System.out.println(search);
		
		int occurance=occurance(5, head);
		System.out.println();
		System.out.println("No of occurance of the key element : ");
		System.out.println(occurance);
		
		int nth_node = nthNodeValue(node_size,head);
		System.out.println();
		System.out.println("Nth node value");
		System.out.println(nth_node);
		
		int middleEle = printMiddleElement(head); 
		System.out.println();
		System.out.println("To find the middle element : ");
		System.out.println(middleEle);
		
		deletePosition(head, 5); 
		System.out.println();
		display(head);
		
		reverse(head);
		System.out.println("List after reversed : ");
		display(head);
		
		//head2.next.next.next = head1.next.next;
		//Node inter = getIntersectionNode(head1, head2);
		//if(inter == null) {
		//	System.out.print("No intersection point");
		//esle{
		//	System.out.print("intersection point : " + inter.data);
		//}
	}

}


//slow and fast pointer  very important