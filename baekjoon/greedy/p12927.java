package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p12927 {

	public static void main(String[] args) throws IOException{
		// 11101110111011011110
		// 00010001000100100001
		// 00000000000000110000
		// 00000000000000010000
		// 00000000000000000000
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer sb = new StringBuffer();
		sb.append(br.readLine());
		int cnt=0;
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)=='Y') {
				int increase = i+1;
				for(int j=i; j<sb.length(); j=j+increase) {
					if(sb.charAt(j)=='Y')
						sb.replace(j, j+1, "N");
					else
						sb.replace(j, j+1, "Y");
				}
				cnt++;
			}
		}
		int chk=0;
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)=='Y')
				chk++;
		}
		if(chk!=0)
			bw.write("-1");
		else
			bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}

}
