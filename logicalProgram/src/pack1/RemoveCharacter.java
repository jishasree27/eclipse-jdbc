package pack1;

public class RemoveCharacter {
	public static void main(String[] args) {
		String s="enthusiasm";
		String ans="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)!='s')
			{
				ans=ans+s.charAt(i);
			}
			}
		   System.out.println(ans);
		}
		
	}

