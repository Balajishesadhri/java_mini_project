package parkingticket;
import java.util.ArrayList;
import java.util.Scanner;
public class parking {


public static void main(String[]args){
	
	ArrayList<chechout> ch=new ArrayList<chechout>();
	System.out.println("Avable parking space is :5");
	int space=5;
	int user=1;
	Scanner sc= new Scanner(System.in);
	if(space ==0){
		System.out.println("parking space is not Avabile ");
		user=2;
	}
		
	while(user==1 || user==3 || user==4 ){
		System.out.println("Press 1 to book \n 2 to exti \n 3 for parking details \n press 4 to check out");
		user=sc.nextInt();
		
		if(user==1){
			chechout c= new chechout();
			ch.add(c);
			space--;
			System.out.println("Avabile space "+space);
			
			}
		
		 if(user==3){
			
			for(chechout b:ch){
				b.display();
			}
              
		}
		 if (user==4){
			System.out.println("Enter vechial num");
			String no =sc.next();
			for(chechout b:ch){
			if(no.equals(b.vehical)){
				System.out.println("pay 10 rs");
				int i=10;
				int j= sc.nextInt();
				if(i==j){
					System.out.println("payment successful \n Thankyou  ");
					space++;
				}
			}
			else{
				System.out.println("vehical not found");
			}
			}
			}
			}
			
}
		
}	