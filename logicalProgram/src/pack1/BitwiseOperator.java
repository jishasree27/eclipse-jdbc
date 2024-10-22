package pack1;

public class BitwiseOperator {
	public static void main(String[] args) {
		String s1="1101";
		String s2="1011";
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		String result="";
		 for (int i = 0; i < c1.length; i++) {
			
			 if (c1[i] == '1' && c2[i] == '1') {
	                result += '1'; 
	            } else {
	                result += '0'; 
	            }
		}
		System.out.println(result);
		
	}
}
