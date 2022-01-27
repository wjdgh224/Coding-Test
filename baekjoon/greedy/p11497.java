package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11497 {
	public static void sort(int[] n) {
		for(int i=1; i<n.length; i++) {
			int v = n[i];
			for(int j=i-1; j>=0; j--) {
				if(v < n[j]) {
					n[j+1] = n[j];
					n[j] = v;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());
			int[] array = new int[m];
			String[] spt = br.readLine().split(" ");
			for(int j=0; j<spt.length; j++)
				array[j] = Integer.parseInt(spt[j]);
			sort(array);
			
			int max=0;
			int len = array.length;
			if(array[len-1] - array[len-2] > array[len-1]-array[len-3])
				max = array[len-1] - array[len-2];
			else
				max = array[len-1] - array[len-3];
			
			for(int l=len-2; l>=2; l--) {
				if(array[l]-array[l-2] > max)
					max = array[l]-array[l-2];
			}
			if(array[1] - array[0] > max)
				max = array[1] - array[0];
			bw.write(Integer.toString(max) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
