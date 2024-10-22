package pack1;

public class Duplicates {
	public static void main(String[] args) {
		String s="telephone";
		char result=0;
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					result=ch[i];
				}
			}
		}
		System.out.println(result);
	}
}
