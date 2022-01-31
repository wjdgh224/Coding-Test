package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p11508 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] price = new int[n];
		for(int i=0; i<n; i++)
			price[i] = Integer.parseInt(br.readLine());
		Arrays.sort(price);
		// 1 2 3 4 5 6 7 8
		int sum = 0;
		if(n%3 == 0) {
			for(int i=0; i<n; i++) {
				if(i%3==0)
					continue;
				else
					sum += price[i];
			}
		}
		else if(n%3 == 1) {
			for(int i=1; i<n; i++) {
				if(i%3==1)
					continue;
				else
					sum += price[i];
			}
			sum += price[0];
		}
		else {
			for(int i=2; i<n; i++) {
				if(i%3==2)
					continue;
				else
					sum += price[i];
			}
			sum += price[0];
			sum += price[1];
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}
