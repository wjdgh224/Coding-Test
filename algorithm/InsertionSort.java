
public class InsertionSort {

	public static void main(String[] args) {
		int[] intArray = {45, 89, 67, 92, 53, 74, 26, 80};
		int i;
		
		System.out.print("정렬 전 배열: ");
		
		for(i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		insertionSort(intArray);
		
		System.out.print("\n정렬 후 배열: ");
		for(i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}
	
	public static void insertionSort(int[] A) {
		int temp;
		for(int i=1; i<A.length; i++) {
			temp = A[i];
			for(int j=i-1; j>=0; j--) {
				if(temp < A[j]) {
					A[j+1] = A[j];
					A[j] = temp;
				}
			}
		}
	}

}
