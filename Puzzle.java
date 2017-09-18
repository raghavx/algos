import java.util.Arrays;

public class Puzzle{

	public static void main(String[] args){
		int[] data = new int[]{1,2,3,4,5,6};
		int[] output = new int[data.length];
		output[0] = data[0];
		//sum(data,output);
		recursiveSum(1,data);
		System.out.println(Arrays.toString(output));					
		System.out.println(Arrays.toString(data));
	}
	
	public static void sum(int[] data, int[] output){
		for(int i = 0; i < data.length - 1; i++){
			data[i+1] = data[i] + data[i+1];
		
		}
	}
	
	public static void recursiveSum(int i, int[] data){
		if(i == data.length)
			return;
		data[i] = data[i] + data[i-1];
		
		recursiveSum(i+1, data);
	
	}
	
	public static void series(){}

}
