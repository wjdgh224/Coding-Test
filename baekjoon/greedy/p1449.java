package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1449 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//���� ���� ���� ������ ���� �۾ƾߵ�  * �翷 1 ���� �� �ʿ� ��
		//���� + 1 <= ������ ����
		
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int l = Integer.parseInt(s[1]);
		String[] p = br.readLine().split(" ");
		int[] arr = new int[1001];
		for(int i=0; i<n; i++)
			arr[Integer.parseInt(p[i])] = 1;

		
		int cnt=0;
		for(int i=0; i<1001; i++) {
			if(arr[i]==1) {
				cnt++;
				i += l-1;
			}
		}
		System.out.println(cnt);

	}

}
