package pack1;

public class Reverse {
	public static void main(String[] args) {
		String s="jisha";
		String rev="";
		for(int ch=s.length()-1;ch>=0;ch--) {
			rev=rev+s.charAt(ch);
		}
		System.out.println(rev);
	}
}
