package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p20044 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[2*n];
		int[] result = new int[n];
		String[] spt = br.readLine().split(" ");
		for(int i=0; i<2*n ;i++)
			arr[i] = Integer.parseInt(spt[i]);
		Arrays.sort(arr);
		int f = 0, l = 2*n-1;
		while(f<l) {
			result[f] = arr[f] + arr[l];
			f++; l--;
		}
		Arrays.sort(result);
		bw.write(Integer.toString(result[0]));
		bw.flush();
		bw.close();
	}

}
