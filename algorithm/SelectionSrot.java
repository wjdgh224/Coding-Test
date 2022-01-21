
public class SelectionSrot {

	public static void main(String[] args) {
		int [] intArray = {89, 45, 67, 92, 39, 74, 26, 90};
		int i;
		
		System.out.print("정렬 전 배열: ");
		
		for(i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		selectionSort(intArray);
		
		System.out.print("\n정렬 후 배열: ");
		
		for(i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}
	
	public static void selectionSort(int[] A) {
		int i, j, min, temp;
		for(i=0; i<A.length-1; i++) {
			min = i;
			for(j=i+1; j<A.length; j++) {
				if(A[min] > A[j])
					min = j;
			}
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
	}
}
