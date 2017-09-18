//import BinaryTree;
import java.util.Queue;
import java.util.LinkedList;

public class BTAlgo{


public static void main(String[] args) {
		BinaryTree root = new BinaryTree(3);
		BinaryTree l1l = new BinaryTree(2);
		BinaryTree l1r = new BinaryTree(4);
		
		BinaryTree l2l = new BinaryTree(1);
		l1l.setLeft(l2l);
		BinaryTree l2r = new BinaryTree(6);
		l1r.setRight(l2r);
		
		BinaryTree l3l = new BinaryTree(5);
		l2r.setLeft(l3l);
		BinaryTree l3r = new BinaryTree(7);
		l2r.setRight(l3r);
		
		root.setLeft(l1l);
		root.setRight(l1r);
		
		BTAlgo bTAlgo = new BTAlgo();
		bTAlgo.findLevels(root);
}

public void findLevels(BinaryTree localRoot){
	if(localRoot == null)
		return;
	
	// the queue will hold current level and next level node 	
	Queue<BinaryTree> queue = new LinkedList<>();
	
	queue.offer(localRoot);
	// current queue size gives the nodes at root level 
	int nodeAtThisLevel = queue.size();
	
	while(!queue.isEmpty()){ // terminate loop when queue is empty 
		// check if all nodes of this level processed then change the level 
		if(nodeAtThisLevel == 0){
                        nodeAtThisLevel = queue.size();
                        System.out.println();
                }
		BinaryTree temp = queue.poll();
		System.out.print(temp.getData()+"\t");		
		// add all the child nodes to the queue 
		if(temp.getLeft() != null)
			queue.offer(temp.getLeft());

		if(temp.getRight() != null)
			queue.offer(temp.getRight());

		nodeAtThisLevel--; // node is processed now decrese the count 
	} 

}
}
