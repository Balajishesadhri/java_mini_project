package Balaji;

import java.util.Scanner;

public class calculator {
	
	static String s;
	static String s1="y";
	static String s2="N";
	public static void main(String[] args) {
		
		calculator c = new calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 num");
		int i=sc.nextInt();
		int j= sc.nextInt();
		c.math(i, j);

	}
	int math(int i, int j) {
		// TODO Auto-generated method stub
		
	
		System.out.print("press 1 for add ");
		System.out.print("press 2 for sub ");
		System.out.print("press 3 for mul ");
		System.out.print("press 4 for div ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		if(n==1) {
			add(i,j);
			
		}
        if(n==2) {
        	sub(i,j);
			
		}
        if(n==3) {
        	mul(i,j);
	
}
         if(n==4) {
        	 
	div(i,j);
}
		return n;
		}
	
	void add(int i, int j) {
		
	int add = i+j;
	System.out.println(add);
	System.out.println("press Y to continue n to exist");
	Scanner sc = new Scanner(System.in);
	 s=sc.next();
	if(s.equals(s1)) {
		 System.out.println("enter 1 number");
		int num =sc.nextInt();
		math(add, num);
		}
	
	

}
	void sub(int i ,int j) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sub = i-j;
		 System.out.println(sub);
		 System.out.println("press Y to continue n to exist");
		 s=sc.next();
		if(s.equals(s1)) {
		 System.out.println("enter 1 number");
		int num =sc.nextInt();
		math(sub, num);
		}
		
	}
	void mul(int i ,int j) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mul = i*j;
		 System.out.println(mul);
		 int count=2;
		 System.out.println("press Y to continue n to exist");
		 s=sc.next();
		if(s.equals(s1)) {
		 System.out.println("enter 1 number");
		int num =sc.nextInt();
		math(mul, num);
		}
		
	}
	 void div(int i ,int j) {
			// TODO Auto-generated method stub
			 int div = i/j;
			 System.out.println(div);
			 System.out.println("press Y to contuine n to exist");
			 Scanner sc = new Scanner(System.in);
			 s=sc.next();
			if(s.equals(s1)) {
			 System.out.println("enter 1 number");
			int num =sc.nextInt();
			math(div, num);
			 }
			



	 }
	}


