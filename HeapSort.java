/**
* 
*/
 import java.util.Arrays;

public class HeapSort{
	private int[] data;
	private int count;
	
	public HeapSort(int[] data){
		this.data = data;
		this.count = data.length;
	}
	
	public static void main(String[] args){
		int[] data = new int[]{6,0,3,4,30,5,1,10};
		HeapSort hs = new HeapSort(data);
		hs.buildHeap();
		System.out.println(Arrays.toString(data));
		for(int i = 0; i < data.length; i++){
			System.out.println("\t"+data[0]);
			System.out.println("\t"+Arrays.toString(data));
			data[0] = Integer.MIN_VALUE;
			System.out.println("\t\t"+Arrays.toString(data));
			hs.buildHeap();
			System.out.println("\t\t\t"+Arrays.toString(data));
		}
	}
	
	public void buildHeap(){
		for(int i = count/2 -1; i >= 0; i--){
			percolateDown(i);
		}	
	}
	/**
				X
			       / \
			      /   \
		             L     R
		
	percolateDown finds the maximum of X, L and  R. Then it swaps them.
	*/
	public void percolateDown(int i){
		int left, right, max, temp;
		left = leftChild(i);
		right = rightChild(i);
		// System.out.println("left\t"+left);
		// System.exit(0);
		if(left != -1 && this.data[left] > this.data[i]){
			max = left;
		}else{
			max = i;
		}
		
		if(right != -1 && this.data[right] > this.data[max]){
			max = right;
		}
		if(max != i){
			temp = this.data[i];
			this.data[i] = this.data[max];
			this.data[max] = temp;
		 
		
		//	System.out.println(max);
			percolateDown(max);
		}	
	}	
	
	//O(1)	
	public int parent(int i){
		if(i < 0 || i >= count){
			return -1;
		}else{
			return (i-1)/2;
		}
	}
	// O(1)
	public int leftChild(int i){
		int left = 2 * i +1;
		//	System.out.println("In left child count = "+count+" and left = "+left);
		if(left < count){
			return left;
		}else{
			return -1;
		} 	
	}
	
	// O(1)
	public int rightChild(int i){
		int right = 2*i +2;
		if(right < count){
			return right;
		}else{
			return -1;
		}
	}	
}
