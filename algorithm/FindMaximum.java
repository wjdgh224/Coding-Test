
public class FindMaximum {

	public static void main(String[] args) {
		int[] intArray = {72, 60, 83, 47, 89, 95};
		int maximum;
		
		maximum = findMaximum(intArray);
		
		System.out.println("�ִ� = " + maximum);
	}
	
	public static int findMaximum(int[] A) {
		int max;
		max = A[0];
		for(int i=1; i<A.length; i++) {
			if(max < A[i])
				max = A[i];
		}
		return max;
	}
}
