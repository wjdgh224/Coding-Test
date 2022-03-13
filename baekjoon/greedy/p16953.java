package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p16953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int s = Integer.parseInt(str[0]);
		int e = Integer.parseInt(str[1]);
		//1이 아니면 계속 나누기
		int cnt=0;
		while(s<e) {
			if(e%10!=1 && e%2==1) {
				e = -1;
				break;
			}
			if(e%10==1) {
				e /= 10;
			}
			else {
				e /= 2;
			}
			cnt++;
			//System.out.println(e);
		}
		if(s==e)
			System.out.println(++cnt);
		else
			System.out.println(-1);
	}

}
