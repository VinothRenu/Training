package projeteuler;

public class multiplesof3or5 {
	static int sum=0;
	public static void main(String args[]) {
	for(int i=1;i<1000;i++) {
	if(i%3==0||i%5==0) {
	sum=sum+i;
	}
	}
	System.out.println(sum);
	}

}
