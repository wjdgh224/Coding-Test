package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p21313 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		if(n%2 == 0) {
			int i=0;
			while(i<n) {
				if(i%2 == 0)
					bw.write("1 ");
				else
					bw.write("2 ");
				i++;
			}
		}
		else {
			int i=0;
			while(i<n) {
				if(i==n-1) {
					bw.write("3 ");
					i++;
					continue;
				}
				if(i%2 == 0)
					bw.write("1 ");
				else
					bw.write("2 ");
				i++;
			}
		}
		bw.flush();
		bw.close();
	}

}
