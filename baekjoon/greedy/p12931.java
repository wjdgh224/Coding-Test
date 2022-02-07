package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p12931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		int[] pow = new int[n];
		String[] spt = br.readLine().split(" ");
		for(int i=0; i<n; i++)
			a[i] = Integer.parseInt(spt[i]);
		int cnt=0;
		while(true) {
			int chk=0;
			for(int i=0; i<n; i++) {//È¦¼ö
				if(a[i]%2 == 1) {
					a[i] -= 1;
					cnt++;
				}
			}
			for(int i=0; i<n; i++) {//³ª´©±â
				a[i] /= 2;
			}
			cnt++;
			for(int i=0; i<n; i++) {
				if(a[i]!=0) {
					chk++;
				}
			}
			if(chk==0)
				break;
		}
		bw.write(Integer.toString(cnt-1));
		bw.flush();
		bw.close();
		
	}

}