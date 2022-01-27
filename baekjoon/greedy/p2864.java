package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2864 {
	public static int max(String s) {
		int size = (int)Math.pow(10, s.length());
		int num = Integer.parseInt(s);
		for(int i=0; i<s.length(); i++) {
			size/=10;
			if(s.charAt(i) == '5') {
				num += size;
			}	
		}
		return num;
	}
	public static int min(String s) {
		int size = (int)Math.pow(10, s.length());
		int num = Integer.parseInt(s);
		for(int i=0; i<s.length(); i++) {
			size/=10;
			if(s.charAt(i) == '6') {
				num -= size;
			}	
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] spt = br.readLine().split(" ");
		
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<2; i++)
			sum1 += min(spt[i]);
		for(int i=0; i<2; i++)
			sum2 += max(spt[i]);
		bw.write(Integer.toString(sum1) + " " + Integer.toString(sum2));
		bw.flush();
		bw.close();
				
	}

}
