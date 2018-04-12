import java.util.Scanner;

public class Sentence 
{
	
	static String[] longestWordCount(String str)
	{
		String[] ans = new String[2];
		
		if (str.length() != 0)
		{
			
			String array[] = str.split(" ");
			int maxLength = 0;
			String longestString = null;
			for (String s : array)
			{
				if (s.length() > maxLength )
				{
					maxLength = s.length();
					longestString = s;
				}
			}
			
			ans[0] = Integer.toString(maxLength);
			ans[1] = longestString;
			
			return ans;
		}
		
		return null;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//LongestWordCount lcw = new LongestWordCount();
		System.out.println("Eneter a sentence");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] ans = Sentence.longestWordCount(str);
		if ( ans !=  null  )
		{
			System.out.println("Longest word and length in the above sentence is [ " + ans[1] + " : " + ans[0] + "]");
		}
		
	}

}
