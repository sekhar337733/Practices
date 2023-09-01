package programes;

public class ReversNumber {
	
	public static void main(String args[]) {
		int num = 234;
		int rem, revnum=0;
		
		while(num>0) {
			rem = num%10;
			num=num/10;
			revnum =(revnum*10)+rem;
		}
		
		System.out.println(revnum);
	}

}
