import java.util.List;

public class DepthFirstSearch {

	public static void DFS(Node v) {
		System.out.print(v.info + " ");
		v.visited = true;
		List<Node> neighbours = v.getNeighbours();
		
		for(int i=0; i<neighbours.size(); i++) {
			Node w = neighbours.get(i);
			if(!w.visited && w != null) {
				DFS(w);
			}
		}
	}
	
	public static void main(String[] args) {
		Node[] node = new Node[6];
		for(int i=0; i<6; i++)
			node[i] = new Node(i+1);
		
		node[0].addNeighbours(node[1]);
		node[0].addNeighbours(node[2]);
		node[0].addNeighbours(node[4]);
		node[1].addNeighbours(node[0]);
		node[1].addNeighbours(node[2]);
		node[2].addNeighbours(node[0]);
		node[2].addNeighbours(node[1]);
		node[2].addNeighbours(node[3]);
		node[2].addNeighbours(node[4]);
		node[3].addNeighbours(node[2]);
		node[3].addNeighbours(node[5]);
		node[4].addNeighbours(node[0]);
		node[4].addNeighbours(node[2]);
		node[5].addNeighbours(node[2]);
		node[5].addNeighbours(node[3]);
		
		System.out.println("Àç±Í¸¦ »ç¿ëÇÑ ±íÀÌ ¿ì¼± Å½»ö ½ÇÇà °á°ú");
		DFS(node[0]);
	}

	

}
