public class BinaryTree{

	private BinaryTree left, right;
	private int data;
	
	public BinaryTree(int data){
		this.data = data;
	}

	public int getData(){
		return data;
	}

	public BinaryTree getLeft(){
		return left;
	}

	public void setLeft(BinaryTree node){
		this.left = node;
	}
	
	public BinaryTree getRight(){
		return right;
	}

	public void setRight(BinaryTree tree){
		this.right = tree;
	}


}
