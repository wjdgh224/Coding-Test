package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p17509 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] arr = new int [11][2];
		for(int i=0; i<11; i++) {
			String[] spt = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(spt[0]);
			arr[i][1] = Integer.parseInt(spt[1]);
		}
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[0]==o2[0]) {
				return o1[1] - o2[1];
			}
			else {
				return o1[0] - o2[0];
			}
		});
		//for(int i=0; i<11; i++)
		//	System.out.println(arr[i][0] + " " + arr[i][1]);
		int sum = 0, cnt = 0, result = 0;
		for(int i=0; i<11; i++) {
			sum += arr[i][0];
			cnt += arr[i][1];
			result += sum;
		}
		bw.write(Integer.toString(result + cnt*20));
		bw.flush();
		bw.close();
	}

}
