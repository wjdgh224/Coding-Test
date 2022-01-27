package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10162 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] time = {300, 60, 10};
		int[] cnt = {0, 0, 0};
		int t = Integer.parseInt(br.readLine());
		int i = 0;
		
		while(t >= 10) { 
			if(t >= time[i]) {
				cnt[i] = t/time[i];
				t = t%time[i];
			}
			i++;
		}
		
		if(t==0) {
			for(int j=0; j<cnt.length; j++)
				bw.write(Integer.toString(cnt[j]) + " ");	
		}
		else 
			bw.write("-1");
		bw.flush();
		bw.close();
		
	}

}
