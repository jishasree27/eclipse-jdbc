package pack1;

public class CountTheWords {
	public static void main(String[] args) {
		String s="hello jisha sree";
		int count=1;
		char[] c=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++) {
			if (c[i]== ' ') {
		         count++;
		         
			}
			
		}
		
			System.out.println(count);	
			}
		
	}

