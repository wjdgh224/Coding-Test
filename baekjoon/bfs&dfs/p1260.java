package baek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1260 {
	
	static int check[] = new int[1001];
	static Queue<Integer> queue = new LinkedList<Integer>();
	
	static void dfs(int[][] arr,int start) {
		check[start] = 1;
		System.out.print(start + " ");
		for(int i=1; i<arr.length; i++) {
			if(arr[start][i]==1 && check[i]!=1) {
				//System.out.println(i + " ");
				//check[i] = 1;
				dfs(arr, i);
			}
		}
	}
	
	static void bfs(int[][] arr, int start) {
		queue.add(start);
		check[start] = 1;
		
		while(!queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v + " ");
			
			for(int i=1; i<arr.length; i++) {
				if(arr[v][i]==1 && check[i]!=1) {
					queue.add(i);
					check[i] = 1;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int v = Integer.parseInt(s[2]);
		int[][] arr = new int[n+1][n+1]; 
		for(int i=0; i<m; i++) {
			String[] ver = sc.nextLine().split(" ");
			arr[Integer.parseInt(ver[0])][Integer.parseInt(ver[1])] = 1;
			arr[Integer.parseInt(ver[1])][Integer.parseInt(ver[0])] = 1;
		}
		
		dfs(arr, v);
		for(int i=0; i<1001; i++)
			check[i] = 0;
		System.out.println();
		bfs(arr, v);
	}
}
/*
 * 0 1 2 3 4
 0 
 1     o o o 
 2   o     o
 3   o     o
 4   o o o
 * */
