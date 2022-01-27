package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int b[] = new int[n];

		String s1 = br.readLine();
		String s2 = br.readLine();
		String[] spt1 = s1.split(" ");
		String[] spt2 = s2.split(" ");
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(spt1[i]);
			b[i] = Integer.parseInt(spt2[i]);
		}
		//a Á¤·Ä, bÃÖ¼Ú°ª
		
		for(int i=1; i<a.length; i++) {
			int v = a[i];
			for(int j=i-1; j>=0; j--) {
				if(v < a[j]) {
					a[j+1] = a[j];
					a[j] = v;
				}
			}
		}
		for(int i=1; i<b.length; i++) {
			int v = b[i];
			for(int j=i-1; j>=0; j--) {
				if(v > b[j]) {
					b[j+1] = b[j];
					b[j] = v;
				}
			}
		}
		
		int sum = 0;
		for(int i=0; i<n; i++)
			sum += a[i]*b[i];
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}
