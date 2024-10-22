package pack1;

public class Anagrams {
	public static void main(String []args) {
		String s1="hello";
		String s2="ollhe";
		Boolean flag=false;
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					flag=true;
				}
 			  }
			}
		if(flag==true) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
	}
}