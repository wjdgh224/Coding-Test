package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p12782 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			int first = 0, second = 0;
			for(int j=0; j<str[0].length(); j++) {
				if(str[0].charAt(j)=='1' && str[1].charAt(j)=='0') {
					first++;
				}
				else if(str[0].charAt(j)=='0' && str[1].charAt(j)=='1') {
					second++;
				}
			}
			
			int sum = 0;
			while(first>0 && second>0) {
				sum++; first--; second--;
			}
			sum += first + second;
			bw.write(Integer.toString(sum));
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
