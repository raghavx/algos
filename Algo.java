
public class Algo{

private int[] data = new int[]{-1,2,4,9,6,4,7,-100,320,43,2,5,7,9,11,21,19,18,20};

	public static void main(String[] args){

		Algo algo = new Algo();
		int result = algo.findMin(algo.data);
		System.out.println(result);
	}
	// method to create a min heap 
	public int[]  minHeap(int[] data){
		
		return data;
	}
	// method finds the minimum of an unsorted array complexity of order n  
	public int findMin(int[] data){
		if(data == null || data.length == 0){
			return 0;
		}
		int min = data[0];
		for(int i : data){
			if(i < min){
				min = i;
			}
		}
		return min;
	}


}
