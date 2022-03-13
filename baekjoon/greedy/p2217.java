package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n ;i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int max=0;
		for(int i=0; i<n; i++) {
			if(max < arr[i]*(n-i))
				max = arr[i]*(n-i);
		}
		System.out.println(max);
			
	}

}
