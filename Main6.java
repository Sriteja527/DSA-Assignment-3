/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Main6 {

// Function to find the
static int findSingle(int A[], int ar_size)
{

	// Iterate over every element
	for (int i = 0; i < ar_size; i++) {

	// Initialize count to 0
	int count = 0;

	for (int j = 0; j < ar_size; j++) {

		// Count the frequency
		// of the element
		if (A[i] == A[j]) {
		count++;
		}
	}

	// if the frequency of the
	// element is one
	if (count == 1) {
		return A[i];
	}
	}

	// if no element exist at most once
	return -1;
}

public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int size = sc.nextInt();
    System.out.println("enter the array elements:");
	int ar[] = new int[size];
    for(int i=0;i<size;i++){
        ar[i] = sc.nextInt();
    }
	int n = ar.length;

	// Function call
	System.out.println("Element occurring once is " + findSingle(ar, n));
}
}

// This code is contributed by aadityaburujwale.
