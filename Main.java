// (c) A+ Computer Science
// www.apluscompsci.com
// Name -Jonathan Hsing

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		String[] wrds = "one two three four five six seven alligator".split(" ");
		Words test = new Words( wrds );
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");		
				
		//add more test cases
    wrds = "fun fly four six times ten plus eight".split(" ");
    test = new Words( wrds );
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");
    wrds = "alligator chicken dog cat pig buffalo".split(" ");
    test = new Words( wrds );
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 9 chars = "+test.countWordsWithXChars(9));
		vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");
	
	}
}