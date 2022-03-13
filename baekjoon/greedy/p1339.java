package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p1339 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = br.readLine();
			double index = Math.pow(10, str[i].length()-1);
			for(int j=0; j<str[i].length(); j++) {
				arr[str[i].charAt(j)-'A'] += index;
				index/=10;
			}
		}
		Arrays.sort(arr);
		int cnt=9;
		int sum=0;
		for(int i=25; i>=0; i--) {
			if(arr[i]==0) break;
			sum += arr[i]*cnt;
			cnt--;
		}
		System.out.println(sum);

	}

}
