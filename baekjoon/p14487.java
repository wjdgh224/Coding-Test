package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p14487 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] cost = new int[n];
		for(int i=0; i<n; i++)
			cost[i] = Integer.parseInt(str[i]);
		Arrays.sort(cost);
		int sum = 0;
		for(int i=0; i<n-1; i++)
			sum += cost[i];
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}
