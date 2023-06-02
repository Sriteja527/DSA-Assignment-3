import java.util.*;

public class Main {
	// Naive recursive function
	public static void findCloseTriplet(int[] arr, int n, int x, int count, int sum, int ind, int[] ans, int[] minm) {
		// Return on reaching to the end of array
		// Here if we picked three element till now then check
		// that sum is closest to our "x" or not
		if (ind == n) {
			if (count == 3) {
				if (Math.abs(x - sum) < minm[0]) {
					minm[0] = Math.abs(x - sum);
					ans[0] = sum;
				}
			}
			return;
		}

		// Pick this number
		findCloseTriplet(arr, n, x, count + 1, sum + arr[ind], ind + 1, ans, minm);

		// Don't pick this number
		findCloseTriplet(arr, n, x, count, sum, ind + 1, ans, minm);
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("enter the size of the array:");
		int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
		int x = 1;
		int n = arr.length;
		int[] minm = { Integer.MAX_VALUE };
		int[] ans = new int[1];
		findCloseTriplet(arr, n, x, 0, 0, 0, ans, minm);
		System.out.println(ans[0]);
	}
}
