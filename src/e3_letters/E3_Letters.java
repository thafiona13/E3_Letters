/*
 * Fiona xie 
 * 5/21/2020
 * Scans a file and counts the number of characters.
 */
package e3_letters;
import java.io.*;
import java.util.Scanner;

public class E3_Letters {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); //scan for inputting file name
        String fileName, line; // string for file name and the read line of the note file
        int vowels = 0,consonants = 0, digits = 0, spaces = 0, otherch = 0, UP = 0, DOWN = 0; // variables for characters
        char scan; // variable for char
        
        System.out.print("Name of the file: "); // gets name of file
        fileName = x.nextLine();
        
        Scanner file; 
        
        try {
            file = new Scanner(new File(fileName)); // opens the file
        } 
        catch (IOException e) { // an error has occurred
            System.out.println(fileName + " : File not found");
            return;
        }
	
        // read all of the data from the file, one line at a time
        while (file.hasNextLine()) { // if there is another line, continue the loop
            line = file.nextLine(); // read the line from the file
          
            for (int i=0;i < line.length(); i++)  {
                    scan = line.charAt(i); // sets scan to the input of "i"
                if (scan == 'a' || scan =='e' || scan == 'i' || scan =='o' || scan == 'u'|| scan == 'A' || scan =='E' || scan == 'I' || scan =='O' || scan == 'U')
                {
                    ++vowels; // adds 1 to integer vowel if scanner finds upper or lower case of A E I O U
                }
                else if (scan == ' ')
                {
                    ++spaces; // adds 1 to spaces if scanner finds space
                }
                else if (scan >= 'a' && scan <= 'z' ||scan >= 'A' && scan <= 'Z' )
                {
                   ++consonants; //adds 1 if scanner finds any letter from a to z, if earlier vowels did not catch it 
                }
                else if (scan >= '0' && scan <= '9')
                {
                    ++digits; // adds 1 if it was a digit from 0 to 9
                }
                else
                {
                    ++otherch; // adds 1 if its anything else
                }
                }
                for (int i=0; i<line.length(); ++i) // for statement analyzing each line of sentence
                {
                    scan = line.charAt(i);
                    if (scan >= 'a' && scan <= 'z') // if scanner finds lower case letters
                    {
                        ++DOWN;
                    }
                    else if (scan>='A' && scan<= 'Z') // if scanners finds upper case letters
                    {
                        ++UP;
                    }
        }
        //file.close();
        }
         System.out.println("There are "+vowels+" vowels");
         System.out.println("There are "+consonants+" consonants");
         System.out.println("There are "+digits+" digits");
         System.out.println("There are "+spaces+" spaces");
         System.out.println("There are "+otherch+" other characters");
         System.out.println("There are "+UP+" upper cases");
         System.out.println("There are "+DOWN+" lower cases");
    }
    
}
