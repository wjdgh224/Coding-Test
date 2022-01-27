package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt0 = 0;
		int cnt1 = 0;
		String s = br.readLine();
		char past = s.charAt(0);
		if(past=='0')
			cnt0++;
		else
			cnt1++;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == '1' && past == '0') {
				cnt1++;
				past = s.charAt(i);
			}
			if(s.charAt(i) == '0' && past == '1') {
				cnt0++;
				past = s.charAt(i);
			}
			if(s.charAt(i) == '1' && past == '1')
				past = s.charAt(i);
			if(s.charAt(i) == '0' && past == '0')
				past = s.charAt(i);
		}
		if(cnt0 < cnt1)
			bw.write(Integer.toString(cnt0));
		else
			bw.write(Integer.toString(cnt1));
		bw.flush();
		bw.close();
		
	}
}
