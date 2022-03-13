package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Long.parseLong(br.readLine());
		int cnt=0;
		while(true) {
			cnt++;
			n -= cnt;
			if(cnt>n) {
				if(n<0) {
					cnt--;
					break;
				}
				else
					break;
			}
		}
		System.out.println(cnt);
	}

}
