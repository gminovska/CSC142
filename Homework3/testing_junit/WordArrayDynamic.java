package testing_junit;

import java.util.*; 

//refactored into methods so it can be tested 

public class WordArrayDynamic {

	private static Scanner scanner = new Scanner(System.in);
	public static String searchedWord;
	
    public static void main(String[] args) {
	// introduce the program and give instructions
        System.out.println("Welcome to the Dynamic Word Array. Please insert words you would like to have in the array");
        System.out.println("Separate the words by a single space. Ex. cat dog horse mouse");

    String[] wordArray = CreateWordArray();
    int wordFound = SearchWord(wordArray);
    DisplayResult(wordFound);
    }

    public static String[] CreateWordArray() {
        //read user input
        
        String userWordlist = scanner.nextLine();

        //convert to lowercase to avoid inconsistencies
        userWordlist = userWordlist.toLowerCase();

        //separate the input string into an array of words
        String[] wordArray = userWordlist.split(" ");

        return wordArray;
    }
    
    public static int SearchWord(String[] wordArray) {
      //prompt for the word the user would like to search for
      System.out.println("Which word are you looking for?");
      String wordSearch = scanner.next();

  //convert to lowercase to avoid inconsistencies
      wordSearch = wordSearch.toLowerCase();
      //store the searched word in a property so it's accessible to other methods
      searchedWord = wordSearch;
  //declare and initialize counter
      int count = 0;
  //loop the array to search for the word and increase the counter when the word is found
      for (int i = 0; i < wordArray.length; i++){
          if (wordArray[i].contains(wordSearch)){
              //increment counter
              count++;
          }
      }
      return count;
    }
    
    public static String DisplayResult(int count) {
    	//notify the user about the search result
      if (count > 0){
          System.out. println("The word \"" + searchedWord + "\" was found " + count + " times");
          return "Word was found " + count + " times";
      }
      else {
          System.out.println("The word was not found");
          return "The word was not found";
      }
    }
    
    
   
}