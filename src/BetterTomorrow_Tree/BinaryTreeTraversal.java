package BetterTomorrow_Tree;
import java.util.*;

class Node {
	
	int data;
	Node left;
	Node right;
	
	Node(int x){
		data = x;
		left = right = null;
	}
	
}

public class BinaryTreeTraversal {
	
	public static void inorder(Node root) {
		Node temp = root;
		if(temp == null) {
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
		System.out.print(temp.data+" ");
	}
	
	public static void preorder(Node root) {
		Node temp = root;
		if(temp == null) {
			return;
		}
		System.out.print(temp.data+" ");
		preorder(temp.left);
		preorder(temp.right);
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
	
	public static boolean search(Node root, int key) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.peek();
			if(temp.data == key) {
				return true;
			}
			q.remove();
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		return false;
		
	}
	
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
		
		Node root1 = null;
		System.out.println("Binary Tree : ");
		root1 = new Node(10);
		root1.left = new Node(20);
		root1.right = new Node(30);
		root1.left.left = new Node(40);
		root1.left.right = new Node(50);
		root1.right.left = new Node(60);
		root1.right.right = new Node(70);
		System.out.print("Inorder Traversal : ");
		inorder(root1);
		System.out.println();
		System.out.print("Post-order Traversal : ");
		postorder(root1);
		System.out.println();
		System.out.print("Pre-order Traversal : ");
		preorder(root1);
		
		System.out.println();
		System.out.print("Level-order Traversal : ");
		levelOrderTraversal(root1);
		
		System.out.println();
		boolean search = search(root1, 70);
		System.out.println("Key element : "+search);
		
		int height = findHeight(root1);
		System.out.println("The height of the BST : "+height);
		

	}

}
