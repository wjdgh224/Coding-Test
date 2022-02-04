package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p12845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] spt = br.readLine().split(" ");
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(spt[i]);
		Arrays.sort(arr);
		int sum = 0;
		for(int i=0; i<n-1; i++) {
			sum += arr[i] + arr[n-1];
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}