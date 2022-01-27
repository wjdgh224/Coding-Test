package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] change = {25, 10, 5, 1};
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int[] cnt = {0, 0, 0, 0};
			int money = Integer.parseInt(br.readLine());
			int j=0;
			while(money > 0) {
				if(money >= change[j]) {
					cnt[j] = money/change[j];
					money %= change[j]; 
				}
				j++;
			}
			for(int k=0; k<cnt.length; k++)
				bw.write(Integer.toString(cnt[k]) + " ");
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
