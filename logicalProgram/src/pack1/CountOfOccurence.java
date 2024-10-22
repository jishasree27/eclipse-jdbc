package pack1;

public class CountOfOccurence {
	public static void main(String[] args) {
		String s="encyclopedia";
		char c='e';
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
		
