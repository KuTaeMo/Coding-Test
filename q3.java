package codingtest;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[][] arr=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			int tmp=9999;
			for(int j=0;j<m;j++) {
				if(tmp>arr[i][j]) {
					tmp=arr[i][j];
				}
				a[i]=tmp;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(i+"행 : "+a[i]);
		}
		
		int b=0;
		for(int i=0;i<a.length;i++) {
			if(b<a[i]) {
				b=a[i];
			}
		}
		System.out.println("큰 수는 "+b+"입니다.");
		
	}
}
