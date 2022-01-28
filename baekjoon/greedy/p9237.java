package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p9237 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] spt = br.readLine().split(" ");
		int[] days = new int[n];
		for(int i=0; i<n; i++)
			days[i] = Integer.parseInt(spt[i]);
		Arrays.sort(days);
		
		int max = 0;
		for(int i=0; i<n; i++) {
			if(max < days[n-i-1] + 1 + i)
				max = days[n-i-1] + 1 + i;
		}

		bw.write(Integer.toString(max + 1));
		bw.flush();
		bw.close();
		
	}

}
