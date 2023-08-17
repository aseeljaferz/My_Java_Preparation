package BetterTomorrow_Tree;
import java.util.*;

class Node3{
	int data;
	Node3 left;
	Node3 right;
	
	Node3(int x){
		data = x;
		left = right = null;
	}
}

public class MirrorOrSymmetricTree {
	
	public static void checkMirror(Node root) {
		
		
		
		
	}

	public static void main(String[] args) {
		
		Node3 root1 = null;
		System.out.println("Mirror or Symmetric Tree : ");
		root1 = new Node3(1);
		root1.left = new Node3(2);
		root1.right = new Node3(2);
		root1.left.left = new Node3(3);
		root1.left.right = new Node3(4);
		root1.right.left = new Node3(4);
		root1.right.right = new Node3(3);
		
	}

}
