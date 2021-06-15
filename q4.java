package codingtest;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int count=0;
		
		while(true) {
			if(n==1) {
				break;
			}
			else if(n%k==0) {
				n=n/k;
				count++;
			}else if(n%k>0) {
				n=n-1;
				count++;
			}
		}
		System.out.println(count);
	}
}
