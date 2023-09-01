package programes;

import java.util.Scanner;

public class ArmStrong {

	public static void argstronornot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number : ");
		int n = sc.nextInt();
		int t = n;
		int cum=0;
		while(n>0){
			int r = n%10;
			n=n/10;
			cum = cum+(r*r*r);
		}
		
		if(n!=0)
		if(t==cum) {
			System.out.println("Given number is armstorng");
		}
		else {
			System.out.println("Given number is not armstorng");
		}
	
	}
	
	public static void main(String[] args) {
		
		argstronornot();
	}

}
