package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1080 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int r = Integer.parseInt(str[0]);
		int c = Integer.parseInt(str[1]);
		int[][] arr1 = new int[r][c];
		int[][] arr2 = new int[r][c];
		for(int i=0; i<r; i++) {
			String s = br.readLine();
			for(int j=0; j<c; j++)
				arr1[i][j] = (int)(s.charAt(j)-48);
		}
		for(int i=0; i<r; i++) {
			String s = br.readLine();
			for(int j=0; j<c; j++)
				arr2[i][j] = (int)(s.charAt(j)-48);
		}
		
		int cnt=0;
		for(int i=0; i<r-2; i++) {
			for(int j=0; j<c-2; j++) {//행렬 순회
				if(arr1[i][j]!=arr2[i][j]) {
					for(int k=i; k<=i+2; k++) {
						for(int l=j; l<=j+2; l++) {
								if(arr1[k][l]==1)
									arr1[k][l]=0;
								else
									arr1[k][l]=1;
						}
					}
					cnt++;
				}
			}
			
		}
		
		int chk=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(arr1[i][j]!=arr2[i][j]) {
					chk=1;
				}
			}
		}
		if(chk==1)
			System.out.println(-1);
		else
			System.out.println(cnt);
	}
	
}

