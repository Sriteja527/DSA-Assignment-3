// Java program for the above approach
import java.io.*;
import java.util.*;

public class Main4{

// Function to find insert position of K
static int find_index(int[] arr, int n, int K)
{
	
	// Traverse the array
	for(int i = 0; i < n; i++)
	
		// If K is found
		if (arr[i] == K)
			return i;

		// If current array element
		// exceeds K
		else if (arr[i] > K)
			return i;

	// If all elements are smaller
	// than K
	return n;
}

// Driver Code
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    System.out.println("Enter the array elements:");
	int[] arr = new int[size];
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }
	int n = arr.length;
    System.out.println("enter the target value:");
	int K = sc.nextInt();
	
	System.out.println(find_index(arr, n, K));
}
}

// This code is contributed by akhilsaini
