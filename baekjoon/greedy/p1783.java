package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int cnt=0;
		if(n==1)
			cnt=1;
		else if(n==2) {//m=1~2:1,3~4:2,5~6:3, 4... 
			cnt = Math.min(4, (m-1)/2+1);
		}
		else {
			if(m<7) {
				cnt = Math.min(4, m);
			}
			else
				cnt = m-2;
		}
		System.out.println(cnt);
	}

}
