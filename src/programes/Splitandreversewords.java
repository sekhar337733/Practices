package programes;

public class Splitandreversewords {

	public static void main(String[] args) {
		reversString("Hi this is sekhar");
		

	}
	public static void reversString(String str) {
		String[] words = str.split(" ");
		String reverschar = "";
		for(String word : words) {
			for(int i=word.length()-1;i>=0;i--) {
				char ch = word.charAt(i);
				reverschar = reverschar+ch;
			}
			reverschar = reverschar+" ";
		}
		
		System.out.println(reverschar);
	}

}
