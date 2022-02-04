package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p15881 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int cnt = 0;
		for(int i=0; i<str.length()-3; i++) {
			if(str.charAt(i)=='p') {
				if(str.substring(i, i+4).equals("pPAp")) {
					cnt++;
					i += 3;
				}
			}
		}
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}

}
