package pack1;

public class Palindrome {
	public static void main(String[] args) {
		
			String s="mom";
			String rev=null;
			
			for(int i=s.length();i>=1;i--) {
				
				rev=rev+s.charAt(i);
			}
			if(rev==s) {
				System.out.println("palindrome");
			}
				else {
					System.out.println("not a palindrome");
				}
			
		}
	
}
