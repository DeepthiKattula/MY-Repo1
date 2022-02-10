package orderStatistics;

public class Main {
	public static void main(String[] args) {
		KthSmallest ob = new KthSmallest(); 
        int arr[] = {12, 13, 25, 57, 14, 19, 26}; 
        int n = arr.length,k = 4; 
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }
}
