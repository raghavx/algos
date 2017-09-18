import java.util.Arrays;

public class MatrixSearch{

public static void main(String[] args){

	int[][] mat =new int[][] { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
	System.out.println(Arrays.toString(mat));	
	search(mat,Integer.parseInt(args[0]));
}

public static int search(int[][] input, int data){
	int row = input.length;
	int col = input[0].length;
	boolean found = false;
	// start from right corner
	int tRow = 0; int tCol = col -1;
	int pRow = 0; int pCol = col -1; 
	while(!found){
		if(data < input[tRow][tCol] && tCol > 0){
			tCol = tCol - 1;
		}
		System.out.println("\t"+tRow + "  "+tCol);
		if(tRow < row - 1 && data > input[tRow][tCol]){
			tRow = tRow + 1;
		}
		System.out.println("\t\t"+tRow + "  "+tCol);
		if(data == input[tRow][tCol]){
			found = true;
			System.out.println(tRow + "  "+tCol);
		}
		// this termination clasuse is very good for very long matrix say 100 X 100 
		// it actually finds the local minima and maxima 	
		found = found ? found :  (tCol == pCol) && (tRow == pRow); // terminate 
		System.out.println(found);	
		pCol = tCol ;
		pRow = tRow ;	
		try{	
			Thread.sleep(1000);	
		}catch(Exception ex){
		}
	}
	return tRow;
}

}
