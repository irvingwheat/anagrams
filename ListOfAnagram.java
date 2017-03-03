// We have to read file
import java.io.*;
// Have to specifically import these guys
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

// Methods I'm going to delete
import java.util.Arrays;

public class ListOfAnagram {
    // Fields
    // String [] anagramList = "blah";
    // count =
    public static void main(String args[]) throws IOException {
        Scanner scnr = new Scanner(System.in);

        // Test for myself, Rosemary
        String Str = "";
        Str = scnr.next();
        System.out.print("Returned: ");
        char [] newStr = Str.toCharArray();
        System.out.println(newStr);
        Arrays.sort(newStr);
        System.out.println("Memory Location: " + newStr);
        String sorted = Arrays.toString(newStr);
        System.out.println("Sorted: " + sorted);

        Anagrams.computeKey("trolls");
        System.out.println(Anagrams.computeKey("fairies"));
        System.out.println(Anagrams.computeKey("i am a potato"));

        //
        // scnr.next() takes care of the spaces and commas that could happen in the file
        // don't use scnr.nextLine()
        String filename = scnr.next();

        // Create our Anagrams object
        ArrayList<Anagrams> ourList = getAnagramList(filename);
        // If we thre before, we also have to throw in main
    }

    /*
    METHOD LAKE
     */

    // GETANAGRAMLIST
    // Gets next word and compares it if it matches a key that we already have!
    public static ArrayList<Anagrams> getAnagramList(String filename) throws IOException{
        // has to be thrown
        ArrayList<Anagrams> anagramsList = new ArrayList<Anagrams>();
        FileInputStream inyougo = new FileInputStream(filename);
        Scanner scnr = new Scanner(inyougo);
        /*
        int i = 0;
        while(scnr.hasNext()){
            anagramsList.get(i).addWord();
            i++;
        }
        */
        return anagramsList;
    }

    // COUNT WORDS
    // Copied from zybooks
    public static int countWords(String fileName) throws IOException{
        // open a file as a FileInputStream
        FileInputStream inFile = new FileInputStream(fileName);
        Scanner fileInput = new Scanner(inFile);
        String word = "";
        int count = 0;
        while (fileInput.hasNext()) {
            word = fileInput.next();
            count++;
        }
        fileInput.close();
        inFile.close();
        return count;
    }

    public static void printAnagrams(){

    }
// string.toLowerCase().replaceAll("\\W","").toCharArray();

    public static void addAnagram(Anagrams gram){

    }

    // Returns index if found.
    // Returns -1 if not found
    public int findAnagram(String word){
        return 2;
    }

    // I don't think we're going to use this because we are using ArrayLists instead?

    public String[] createDictionary(String filename){
        String[] test = new String[20];
        return test;
    }
}
