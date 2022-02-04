package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p3135 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] spt = br.readLine().split(" ");
		int a = Integer.parseInt(spt[0]);
		int b = Integer.parseInt(spt[1]);
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		int min = Math.abs(a-b);
		for(int i=0; i<n; i++) {
			if(min > Math.abs(arr[i]-b) + 1)
				min = Math.abs(arr[i]-b) + 1;
		}
		System.out.println(min);
	}

}
