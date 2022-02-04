package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p14241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] str = br.readLine().split(" ");
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(str[i]);
		Arrays.sort(arr);
		int result=0, sum=arr[0];
		for(int i=1; i<n; i++) {
			result += sum * arr[i];
			sum += arr[i];
		}
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
	}

}
