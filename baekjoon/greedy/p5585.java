package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p5585 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 1000 - Integer.parseInt(br.readLine());
		int[] change = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		int i = 0;
		
		while(n>0) {
			if(n>=change[i]) {
				System.out.print(n + " ");
				cnt += n/change[i];
				n = n%change[i];
			}
			i++;
		}
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}

}
