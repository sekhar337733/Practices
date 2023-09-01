package programes;

public class ReversString {
	public static void revstringbuffer() {
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb.reverse());
	}
	
	public static void revwithstatic(String str) {
		String s="";
		
		for(int i=str.length()-1;i>=0;i--) {
			s = s+str.charAt(i);
			
		}
		System.out.println(s);
		
	}
	public static void main(String args[]) {
		revstringbuffer();
		revwithstatic("str");
	}
}
