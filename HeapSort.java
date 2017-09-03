public class HeapSort{
	private int[] data;
	private int count;
	
	public HeapSort(int[] data){
		this.data = data;
		this.count = data.length;
	}

	public void percolateDown(int i){
	
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
		if(left < count){
			return count;
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
