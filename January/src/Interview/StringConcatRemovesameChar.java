package Interview;

public class StringConcatRemovesameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aabbcc";
		String s2="cbbd";
		RemoveCharacters(s1,s2);
	}

	private static void RemoveCharacters(String s1, String s2) {
		// TODO Auto-generated method stub
		int i=s1.length()-1;
		int j=0;
		while(i>0 && j<s2.length() && s1.charAt(i)==s2.charAt(j))
		{int count=0;
			char c=s1.charAt(i);
			char next=s1.charAt(i);
			while(c==next && i>=0)
			{
				i--;
				next=s1.charAt(i);
				count++;
				
			}
			
		}
		
	}

}
