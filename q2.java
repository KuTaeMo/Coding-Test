package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int first=arr[n-1];
		int second=arr[n-2];
		
		int cnt=(m/(k+1))*k;
		cnt+=m%(k-1);
		
		int result=0;
		result=cnt*first;
		result+=(m-cnt)*second;
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(k);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(result);
	}
}

