package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2847 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=n-1; i>=1; i--) {
			while(arr[i-1]>=arr[i]) {
				arr[i-1]--;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
