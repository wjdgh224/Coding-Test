package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p14655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		String[] first = br.readLine().split(" ");
		String[] second = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr1[i] = Integer.parseInt(first[i]);
			arr2[i] = Integer.parseInt(second[i]);
		}
		int pos = 0;
		int neg = 0;
		for(int i=0; i<n; i++) {
			if(arr1[i] <0) {
				pos += -1*arr1[i];
			}
			else {
				pos += arr1[i];
			}
			if(arr2[i] > 0) {
				neg += -1*arr2[i];
			}
			else {
				neg += arr2[i];
			}
		}
		bw.write(Integer.toString(pos - neg));
		bw.flush();
		bw.close();
	}

}
