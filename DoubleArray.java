import java.util.Scanner;

public class DoubleArray
{
   public static void main(String args[])
   {

	int[][] scores = { {75, 88, 78, 86}, {95, 92, 89, 97}, {73, 89, 92, 91}, {83, 83, 83, 84}, {86, 65, 83, 91} };
	    	
	for(int[] row : scores){
	for(int s: row){
		System.out.print(s + " ");
	}
	System.out.println();
}
   }
}