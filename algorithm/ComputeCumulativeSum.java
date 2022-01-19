
public class ComputeCumulativeSum {

	public static void main(String[] args) {
		int[] FREQ = {1, 0, 7, 5, 4};
		int[] CUME;
		
		CUME = ComputeCumulativeSum2(FREQ);
		
		System.out.print("¹è¿­ CUME: ");
		
		for(int i=0; i<CUME.length; i++)
			System.out.print(CUME[i] + "\t");
	}
	
	public static int[] ComputeCumulativeSum2(int[] FREQ) {
		int[] CUME = new int[5];
		CUME[0] = FREQ[0];
		for(int i=1; i<FREQ.length; i++) {
			CUME[i] = CUME[i-1] + FREQ[i];
		}
		return CUME;
	}

}
