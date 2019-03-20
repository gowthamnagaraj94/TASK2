package org.test.in;

public class T1 {
	public static void main(String[] args) {
		int a=100;
		if(a%2==0) {
			System.out.println("even");
			
		}
		else {
			System.out.println("odd");
		}
		int sum=0;
		for(int i=1;i<10;i++) {
			if(i%2==1) {
				sum=sum+i;
			System.out.println(sum);
			}
			
		}

	}
	

}
