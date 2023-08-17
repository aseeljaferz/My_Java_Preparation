package BetterTomorrow_Tree_Mirror_or_SymmTree;
import java.util.*;


class Node{
	int data;
	Node left;
	Node right;
	
	Node(int x){
		data = x;
		left = right = null;
	}
}
public class MirrorOrSymmetricTree {
	
	static boolean checkMirror(Node root) {
		Stack<Node> st = new Stack<>();
		st.push(root.left);
		st.push(root.right);
		while(!st.isEmpty()) {
			Node x = st.pop();
			Node y = st.pop();
			if(x == null && y == null) {
				continue;
			}
			if(x == null || y == null) {
				return false;
			}
			if(x.data != y.data) {
				return false;
			}
			st.push(x.left);
			st.push(y.right);
			st.push(x.right);
			st.push(y.left);
		}
		return true;
	}
	
	public static int largestSuminLevel(Node root,int k) {
		List<Integer> list = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int len = q.size();
			int sum = 0;
			for(int i=0; i<len; i++) {
				Node curr = q.poll();
				sum += curr.data;
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
			list.add(sum);
		}
		return getLargestValue(list, k);
	}
	
	public static int getLargestValue(List<Integer> a1, int k) {
		Collections.sort(a1);
		if(a1.size()<k) {
			return -1;
		}
		return a1.get(a1.size()-k);
	}

	public static void main(String[] args) {
		
		Node root = null;
		System.out.println("Mirror or Symmetric Tree : ");
		root = new Node(20);
		root.left = new Node(13);
		root.right = new Node(23);
		root.left.left = new Node(9);
		root.left.right = new Node(14);
		root.right.left = new Node(21);
		root.right.right = new Node(23);
		
		boolean mirror = checkMirror(root);
		System.out.print(mirror);
		
		System.out.println();
		int val = largestSuminLevel(root, 4);
		System.out.println(val);

	}

}
