import java.util.Scanner;
import java.util.Arrays;


public class Anagrams{
	
	// Define max anagra list

	static final int MAX_ANAGRAMLIST_SIZE = 10;
	
	// Our two fields 

	private String key = null;
	private String[] values = null;

	// Constructor
	// Creates String array, of values, gives key

	public Anagrams(String word){
		values = new String[MAX_ANAGRAMLIST_SIZE];
		values[0] = word;
		key = computeKey(word);

	}

	// Makes a array of characters from a word. It then sorts them.
	// Finally it returns the String value of the characters.

	public static String computeKey(String word){
		char[] characters = word.toCharArray();
		Arrays.sort(characters);
		return new String(characters);

	}

	public String getKey(){
		return key;
	}

	/**

	This is test things that will later be removed

	*/
	// Test main method

	  public static void main(String args[]) {
      String Str = new String("Whoo words");
      System.out.print("Returned :" );
      System.out.println(Str.toCharArray() );
      computeKey("trolls");
      System.out.println(computeKey("fairies"));

      ;
   }

}
