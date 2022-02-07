package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p15720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] spt = br.readLine().split(" ");
		int burger = Integer.parseInt(spt[0]);
		int side = Integer.parseInt(spt[1]);
		int bever = Integer.parseInt(spt[2]);
		int[] bu = new int[burger];
		int[] si = new int[side];
		int[] be = new int[bever];
		String[] str1 = br.readLine().split(" ");
		String[] str2 = br.readLine().split(" ");
		String[] str3 = br.readLine().split(" ");
		for(int i=0; i<burger; i++) {
			bu[i] = Integer.parseInt(str1[i]);
		}
		for(int i=0; i<side; i++) {
			si[i] = Integer.parseInt(str2[i]);
		}
		for(int i=0; i<bever; i++) {
			be[i] = Integer.parseInt(str3[i]);
		}
		int before = 0;
		for(int i=0; i<burger; i++)
			before += bu[i];
		for(int i=0; i<side; i++)
			before += si[i];
		for(int i=0; i<bever; i++)
			before += be[i];
		bw.write(Integer.toString(before));
		bw.write("\n");
		int set = 0;
		if(burger > side) {
			set = side>bever?bever:side ;
		}
		else {
			set = burger>bever?bever:burger ;
		}
		Arrays.sort(bu);
		Arrays.sort(si);
		Arrays.sort(be);
		int after = before;
		for(int i=bu.length-1; i>=bu.length-set; i--) {
			after -= bu[i]*0.1;
		}
		for(int i=si.length-1; i>=si.length-set; i--) {
			after -= si[i]*0.1;
		}
		for(int i=be.length-1; i>=be.length-set; i--) {
			after -= be[i]*0.1;
		}
		bw.write(Integer.toString(after));
		bw.flush();
		bw.close();
	}

}
