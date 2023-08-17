package BetterTomorrow_Graph;
import java.util.*;
public class Graph {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0; i<adj.size(); i++) {
			System.out.println("Adjacency list of vertex "+ i);
			for(int j=0; j < adj.get(i).size();j++) {
				System.out.print(adj.get(i).get(j)+ " ");
			}
			System.out.println();
		}
	}
	
	static ArrayList<Integer> bfsofGraph(int v, ArrayList<ArrayList<Integer>> adj){
		boolean[] visited = new boolean[v];
		ArrayList<Integer> ans = new ArrayList<>();
		
		Queue<Integer> que = new LinkedList<>();
		que.add(0);
		visited[0] = true;
		while(!que.isEmpty()) {
			int val = que.poll();
			ans.add(val);
			for(int i : adj.get(val)) {
				if(!visited[i]) {
					que.add(i);
					visited[i] = true;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<v; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		//adding edges one by one
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 0, 3);
		addEdge(adj, 2, 4);
		printGraph(adj);
		
		ArrayList<Integer>  bfsofGraph = bfsofGraph(v, adj);
		System.out.println(bfsofGraph);
		
	}

}
