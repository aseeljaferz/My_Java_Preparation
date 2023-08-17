package BetterTomorrow_Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	int data;
	Node left;
	Node right;
	
	Node1(int x){
		data = x;
		left = right = null;
	}
}

public class BinarySearchTree {
	
	static Node insert(Node root, int n) {
		if(root == null) {
			root = new Node(n);
			return root;
		}
		if(root.data<n) {
			root.right = insert(root.right, n);
		}
		else {
			root.left = insert(root.left, n);
		}
		return root;
	}
	
	public static void inorder(Node root) {
		Node temp = root;
		if(temp==null) {
			return;
		}
		inorder(temp.left);
		System.out.print(temp.data+ " ");
		inorder(temp.right);
	}
	
	public static void postorder(Node root) {
		Node temp = root;
		if(temp == null) {
			return;
		}
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.data+ " ");	
	}
	
	public static void preorder(Node root) {
		Node temp = root;
		if(temp == null) {
			return;
		}
		System.out.print(temp.data+ " ");	  
		postorder(temp.left);
		postorder(temp.right);
	}
	
	public static void levelOrderTraversal(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int count = 0;
		while(!q.isEmpty()) {
			count++;
			Node temp = q.poll();//poll or remove  //poll removes the first element in queue and removes top element in stack
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
			System.out.print(temp.data + " ");
		}
		System.out.print("  || Size : " + count);
		
	}
	
	public static void maxElement(Node root) {
		Node temp = root;
		while(temp.right!=null) {
			temp = temp.right;
		}
		System.out.println();
		System.out.println("Maximum value : "+temp.data);
	}
	
	public static void minElement(Node root) {
		Node temp = root;
		while(temp.left!=null) {
			temp = temp.left;
		}
		System.out.println("Minimum value : " + temp.data);
	}
	
	public static boolean search(Node root, int key) { //not for b-tree
		Node temp = root;
		
		while(temp!=null) {
			if(key > temp.data) {
				temp = temp.right;
			}
			else if(key < temp.data) {
				temp = temp.left;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	//or
	
//	public static boolean search(Node root, int key) {   //both for b-tree and bs-tree
//		
//		Queue<Node> q = new LinkedList<>();
//		q.add(root);
//		while(!q.isEmpty()) {
//			Node temp = q.peek();
//			if(temp.data == key) {
//				return true;
//			}
//			q.remove();
//			if(temp.left!=null) {
//				q.add(temp.left);
//			}
//			if(temp.right!=null) {
//				q.add(temp.right);
//			}
//		}
//		return false;
//		
//	}
	
// Height of the BT is the largest no of edges in the path from the root node to the lowest level of leaf node
	
	//the height of an empty BT is -1
	//the height of the BT having only one node is 0
	
	public static int findHeight(Node root) {
		int height = 0;
		Queue<Node> q1 = new LinkedList<>();
		q1.add(root);
		q1.add(null);
		
		while(!q1.isEmpty()) {
			Node temp = q1.remove();
			if(temp==null) {
				height++;
			}
			if(temp!=null) {
				if(temp.left!=null) {
					q1.add(temp.left);
				}
				if(temp.right!=null) {
					q1.add(temp.right);
				}
			}
			else if(!q1.isEmpty()) {
				q1.add(null);
			}
		}
		return height;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Node root = null;
		System.out.println("Binary Search Tree : ");
		root = insert(root, 20);
		root = insert(root, 13);
		root = insert(root, 23);
		root = insert(root, 9);
		root = insert(root, 14
				);
		root = insert(root, 21);
		root = insert(root, 27);
		
		System.out.print("Inorder Traversal : ");
		inorder(root);
		System.out.println();
		System.out.print("Post-order Traversal : ");
		postorder(root);
		System.out.println();
		System.out.print("Pre-order Traversal : ");
		preorder(root);
		
		System.out.println();
		System.out.print("Level-order Traversal : ");
		levelOrderTraversal(root);
		
		System.out.println();
		maxElement(root);
		minElement(root);
		
		boolean search = search(root, 100);
		System.out.println("Key element : "+search);
		
		//
		
		int height = findHeight(root);
		System.out.println("The height of the BST : "+height);
		
		
	}

}
