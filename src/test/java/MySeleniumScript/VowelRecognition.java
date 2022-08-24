package MySeleniumScript;

import java.util.Scanner;

//Print the vowel sum of all Substring
public class VowelRecognition {
	public static void main(String args[] ) throws Exception 
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		int sum =0;
		
		while (t!=0)
		{
			String str = s.nextLine();
			for (int i=0; i<str.length(); i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'e'||
						str.charAt(i)== 'o'||str.charAt(i)== 'u'||str.charAt(i)== 'A'||str.charAt(i)== 'E'||str.charAt(i)== 'I'||
						str.charAt(i)== 'O'||str.charAt(i)== 'U');
				
				sum=sum+(str.length()-i)*(i+1);
			}
			t--;
		}
		System.out.println(sum);
		
	}
	

}
