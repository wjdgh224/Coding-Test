package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p16435 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int len = Integer.parseInt(str[1]);
		int[] arr = new int[n];
		String[] height = br.readLine().split(" ");
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(height[i]);
		Arrays.sort(arr);

		for(int i=0; i<n; i++) {
			if(len >= arr[i]) {
				len++;
			}
		}
		bw.write(Integer.toString(len));
		bw.flush();
		bw.close();
	}
}
