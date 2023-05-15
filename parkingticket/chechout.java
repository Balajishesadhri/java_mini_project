package parkingticket;

import java.util.Scanner;

public class chechout {
	
	String name;
	int phone;
	String vehical;
	double time;
	 chechout(){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter name:  ");
		name=sc.next();
		System.out.print("enter phonenum:  ");
		phone=sc.nextInt();
		System.out.print("enter vehical no:   ");
		vehical=sc.next();
		System.out.print("enter time:  ");
		time=sc.nextDouble();
		System.out.println("");
	}
	 public void display(){
		System.out.println("name : "+name);
		System.out.println("phone no : "+phone);
		System.out.println("vehical No : "+vehical);
		System.out.println("time : "+time);
		
	}
		
}