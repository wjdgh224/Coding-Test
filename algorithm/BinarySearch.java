
public class BinarySearch {

	public static void main(String[] args) {
		int[] A = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};
	
		int x = 18;
		int n = A.length;
		int location = binarySearch(A, 0, n-1, x);
		System.out.println(x + "ÀÇ Áö¼ö = " + location);
	}
	
	public static int binarySearch(int[] A, int first, int last, int target) {
		if(first > last) return -1;
		
		int mid = (first+last)/2;
		if(A[mid] == target) return mid;
		else if(A[mid] > target) return binarySearch(A, first, mid-1, target);
		else return binarySearch(A, mid+1, last, target);
	}
}
