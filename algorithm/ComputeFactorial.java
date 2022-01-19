
public class ComputeFactorial {

	public static void main(String[] args) {
		int answer;
		int n = 10;
		answer = factorial(n);
		
		System.out.println(n + "ÀÇ °è½Â = " + answer);
	}
	
	public static int factorial(int n) {
		if(n==0) return 1;
		return factorial(n-1)*n;
	}

}
