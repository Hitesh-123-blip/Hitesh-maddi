import java.io.*; 
class MatrixTrace 
{
static int m = 4; 
static int n = 4; 
static void row_sum(int arr[][]) 
{ 

	int i,j,sum = 0; 
	System.out.print( "\nFinding Sum of each row:\n\n"); 
	for (i = 0; i < 4; ++i) { 
		for (j = 0; j < 4; ++j) 
        {  
			sum = sum + arr[i][j]; 
		} 

		// Print the row sum 
		System.out.println( "Sum of the row "
			+ i + " = " + sum); 
		

		// Reset the sum 
		sum = 0; 
	} 
} 

// Function to calculate sum of each column 
static void column_sum(int arr[][]) 
{ 

	int i,j,sum = 0; 

	System.out.print( "\nFinding Sum of each column:\n\n"); 

	// finding the column sum 
	for (i = 0; i < 4; ++i) { 
		for (j = 0; j < 4; ++j) { 

			// Add the element 
			sum = sum + arr[j][i]; 
		} 

		// Print the column sum 
		System.out.println( 
			"Sum of the column "
			+ i + " = " + sum); 

		// Reset the sum 
		sum = 0; 
	} 
} 

// Driver code 
	public static void main (String[] args) { 
			int i,j; 
	int [][]arr = new int[m][n]; 

	// Get the matrix elements 
	int x = 1; 
	for (i = 0; i < m; i++) 
		for (j = 0; j < n; j++) 
			arr[i][j] = x++; 

	// Get each row sum 
	row_sum(arr); 

	// Get each column sum 
	column_sum(arr); 
	} 
} 
//This code is contributed by inder_verma.. 
