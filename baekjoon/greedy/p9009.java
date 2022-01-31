package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p9009 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] fibo = new int[50];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i=2; i<50; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}

		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int[] result = new int[50];
			int num = Integer.parseInt(br.readLine());
			int index = 0;
			while(num != 0) {
				int j = 0; int temp = -1;
				while(fibo[j] <= num) {//바로 직전 숫자 찾기 
					temp = fibo[j];
					j++;
				}
				result[index] = temp; index++; 
				num -= temp;
			}
			Arrays.sort(result);
			for(int k=0; k<50; k++) {
				if(result[k] > 0)
					bw.write(Integer.toString(result[k]) + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}


