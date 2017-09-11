

public class Graph{
	
	private int[] node;
	private int[][] edge;
	public Graph(int size){
		this.node = new int[size];
		for(int i = 0; i < size; i++){
			this.node[i] = 1;
		}
		this.edge = new int[size][size];
	}

	public void addEdge(int u, int v){
		this.edge[u][v] = 1;
	}
	
	

}
