import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestWordCountTest {

	@Test
	void longestWordCountTest() 
	{
		String s = "The cow jumped over the moon";
		String expected[] = new String[] { "6", "jumped"};
		String[] actual = Sentence.longestWordCount(s);
		
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void longestWordCountTestNegative()
	{
		String s = "";
		//String expected[] = new String[] { "6", "jumped"};
		String[] actual = Sentence.longestWordCount(s);
		assertArrayEquals(null, actual);
	
	}
	
	@Test
	void longestWordCountNullTest()
	{
		String s = null;
		String[] actual = Sentence.longestWordCount(s);
		assertArrayEquals(null, actual);
		
	}

}
