package pack1;

public class FirstNonRepeat {
	public static void main(String[] args) {
		String s="jissha";
		char ans=0;
		for(int i=0;i<=s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					ans=s.charAt(i);
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
