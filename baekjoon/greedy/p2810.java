package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2810 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int cnt=2;
		int cntS=0;
		for(int i=0; i<n; i++) {
			if(i==0 && str.charAt(i)=='S') {
				cntS++;
				continue;
			}
			else if(i==0 && str.charAt(i)=='L') {
				i++;
				continue;
			}
		
			if(str.charAt(i)=='S') {
				cntS++;
				cnt++;
			}
			else {
				cnt++;
				i++;
			}
		}
		if(cntS==n)
			System.out.println(cnt-1);
		else
			System.out.println(cnt);
	//*S*LL*LL*S*S*LL*
	//모든 자리가 S일때 컵홀더는 n+1개
	}
}
