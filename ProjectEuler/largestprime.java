package projeteuler;

import java.util.Scanner;

public class largestprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
         int n=sc.nextInt();
         largeprime(n);
	}
	private static void largeprime(int n){
		if(n<=1){
			System.out.println("invalid num");
		}else{
			int prime=2;
			while(prime<n){
				if(n%prime!=0){
					prime++;
				}
				else{
					n=n/prime;
					prime=2;
				}
			}
			System.out.println("largest prime factor:" +n);
		}
	}

}
