package longestIncreasingSequence;
public class lis {
	static class Main {
		static int lis(int arr[], int n){
	        int lis[] = new int[n];
	        int i, j, max = 0;
	        for (i = 0; i < n; i++)
	            lis[i] = 1;
	        for (i = 1; i < n; i++)
	            for (j = 0; j < i; j++)
	                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
	                    lis[i] = lis[j] + 1;
	        for (i = 0; i < n; i++)
	            if (max < lis[i])
	                max = lis[i];
	 
	        return max;
	    }
		public static void main(String args[]) {
			int arr[] = {5,10,22,9,28,33,50,44,60,80,68,88,90};
			int n = 13;
			System.out.println(lis(arr, n));
		}
	}
}
