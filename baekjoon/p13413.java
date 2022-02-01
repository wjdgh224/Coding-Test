package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p13413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			int BW = 0, WB = 0;
			String first = br.readLine();
			String second = br.readLine();
			for(int j=0; j<num; j++) {
				if(first.charAt(j)=='B' && second.charAt(j)=='W')
					BW++;
				if(first.charAt(j)=='W' && second.charAt(j)=='B')
					WB++;
			}
			if(BW==0 || WB==0)
				bw.write(Integer.toString(BW+WB));
			else {
				int result = 0;
				while(BW>0 && WB>0) {
					result++;
					BW--; WB--;
				}
				result += (BW + WB);
				bw.write(Integer.toString(result));
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
