package handson;

import java.util.Scanner;

public class bestOffer {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product 1(price) : ");
		double p1=sc.nextDouble();
		System.out.println("Enter Product 2(price) : ");
		double p2=sc.nextDouble();
		System.out.println("Enter Product 3(price) : ");
		double p3=sc.nextDouble();
		calculateOffer(p1, p2, p3);
	}

	private static void calculatecOffer(double p1, double p2, double p3) {
		double total_price = p1+p2+p3;
		double offer1 = total_price*0.2;
		double offer2;
		if(p1<p2&&p1<p3){
			offer2=p1;
		}else if(p2<p3){
			offer2=p2;
		}else{
			offer2=p3;
		}
		
		
		double discount1 = total_price-offer1;
		double discount2 = total_price-offer2;
		System.out.println( "TotalValue ="+total_price);
		if(discount1<discount2){
			System.out.println("Consider Offer1 "+discount1);
		}else
			System.out.println("Consider Offer2  "+discount2);
	}

}
