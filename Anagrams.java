import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
// We're going to use ArrayLists! Hip hip array!
// ArrayLists don't have to have a maz size!

public class Anagrams{

    // Our three fields
    // Key describes alphabetized String
    // Values are words that are anagrams of each other

    private String key = null;
    private int groupSize = 10; // We're not using groupSize, but we'll keep it here anyways
    private ArrayList<String> values = new ArrayList<>();


    // Constructor
    // Creates String arraylist, of values, gives key

    public Anagrams(String word){
        values = new ArrayList<String>(); // Create instance
        this.values.add(word);
        this.key = computeKey(word);
    }

    /*
    METHOD LAND
     */

    // Makes a array of characters from a word. It then sorts them.
    // Finally it returns the String value of the characters.

    public static String computeKey(String word) {
        char[] characters = word.toCharArray();
        Arrays.sort(characters); // sort character array
        return Arrays.toString(characters); // return String array
    // Look into casting CharArray to Strings better
    }

    public void addWord(String word){
        this.values.add(word);
    }


    // To String

    public String toString(){
    // It ain't mean a thing unless you got the String
        //return "blah" ;
        String myWords = "";
        // Iterate through for loop to find anagrams
        for(int i=0;i<=values.size()-1;i++){
            if(myWords.equals("")){
                myWords = values.get(i);
            }
            else {
                myWords += ", " + values.get(i);
            }
        }
        myWords += " are totally oddally anagrams";

        return myWords;
    }

    // Getters

    public String getKey(){
        return key;
    }

    public ArrayList<String> getValues(){
        return values;
    }

    // Never gonna use this guy at the bottom, yet might as well. groupSize is if we did this project only using arrays
    public int getGroupSize(){
        return groupSize;
    }
}
