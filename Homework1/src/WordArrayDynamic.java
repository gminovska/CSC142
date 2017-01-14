/**
 * Homework 1 - CSC 142
 *
 * This program allows the user to input words into an array.
 * The user can then search for a specific word in the array.
 * The search is not case sensitive.
 * If the word is found in the array the user will be notified
 * how many times is the word found.
 * Else, the user will be notified the word is not in the array.
 *
 * Created by: Gordana Minovska
 * Date: 01/13/2017
 */

import java.util.*;

public class WordArrayDynamic {

    public static void main(String[] args) {
	// introduce the program and give instructions
        System.out.println("Welcome to the Dynamic Word Array. Please insert words you would like to have in the array");
        System.out.println("Separate the words by a single space. Ex. cat dog horse mouse");

    //read user input
        Scanner scanner = new Scanner(System.in);
        String userWordlist = scanner.nextLine();

    //convert to lowercase to avoid inconsistencies
        userWordlist = userWordlist.toLowerCase();

    //separate the input string into an array of words
        String[] wordArray = userWordlist.split(" ");

    //prompt for the word the user would like to search for
        System.out.println("Which word are you looking for?");
        String wordSearch = scanner.next();

    //convert to lowercase to avoid inconsistencies
        wordSearch = wordSearch.toLowerCase();

    //declare and initialize counter
        int count = 0;
    //loop the array to search for the word and increase the counter when the word is found
        for (int i = 0; i < wordArray.length; i++){
            if (wordArray[i].contains(wordSearch)){
                //increment counter
                count++;
            }
        }

    //notify the user about the search result
        if (count > 0){
            System.out. println("The word was found " + count + " times");
        }
        else {
            System.out.println("The word was not found");
        }

    }

}
