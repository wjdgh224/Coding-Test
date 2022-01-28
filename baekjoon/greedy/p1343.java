package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1343 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String result = "";
		int cnt=0;
		for(int i=0; i<s.length(); i++) {
			if(i == s.length()-1) {
				if(s.charAt(i) == 'X') {
					cnt++;
					if(cnt%2 != 0) {
						bw.write("-1");
						bw.flush();
						bw.close();
						return;
					}
					if(cnt%4 == 0) {
						for(int j=0; j<cnt; j++)
							result += "A";
					}
					else if(cnt%4 == 2){
						for(int j=0; j<cnt-2; j++)
							result += "A";
						result += "BB";
					}
				}
				else {
					if(cnt%2 != 0) {
						bw.write("-1");
						bw.flush();
						bw.close();
						return;
					}
					if(cnt%4 == 0) {
						for(int j=0; j<cnt; j++)
							result += "A";
					}
					else if(cnt%4 == 2){
						for(int j=0; j<cnt-2; j++)
							result += "A";
						result += "BB";
					}
					result += ".";
					cnt = 0;
				}
					
			}
			else if(s.charAt(i) == 'X') {
				cnt++;
			}
			else if(s.charAt(i) == '.') {
				if(cnt%2 != 0) {
					bw.write("-1");
					bw.flush();
					bw.close();
					return;
				}
				
				if(cnt%4 == 0) {
					for(int j=0; j<cnt; j++)
						result += "A";
				}
				else if(cnt%4 == 2){
					for(int j=0; j<cnt-2; j++)
						result += "A";
					result += "BB";
				}
				result += ".";
				cnt = 0;
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();

	}

}
