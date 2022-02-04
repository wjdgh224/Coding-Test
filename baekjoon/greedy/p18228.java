package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p18228 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] spt = br.readLine().split(" ");
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(spt[i]);
		int index = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] == -1)
				index = i;
		}
		int min1 = 1000000000;
		for(int i=0; i<index; i++) {
			if(min1 > arr[i])
				min1 = arr[i];
		}
		int min2 = 1000000000;
		for(int i=index+1; i<n; i++) {
			if(min2 > arr[i])
				min2 = arr[i];
		}
		bw.write(Integer.toString(min1 + min2));
		bw.flush();
		bw.close();
	}

}
