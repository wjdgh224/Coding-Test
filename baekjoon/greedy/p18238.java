package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p18238 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int curr = 'A';
		int sum = 0;
		for(int i=0; i<str.length(); i++) {//65~90
			int diff = Math.abs(curr - str.charAt(i));
			if(diff > 13)
				diff = 26 - diff;
			sum += diff;
			curr = str.charAt(i);
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}

