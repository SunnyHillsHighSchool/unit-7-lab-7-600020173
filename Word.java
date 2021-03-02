//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Jonathan Hsing

import static java.lang.System.*;

public class Word
{
  private static String vowels = "AEIOUaeiou";   	//why is this here?
 																//why is it static?
   
  //add an instance variable
  private String a;
	//create a constructor
	public Word(){
    a = "";
  }
  public Word(String word){
    a = word;
  }
	//create other methods
//setter method
  public void setWord(String newString){
    a = newString;
  }
  //getter method
  public String getWord(){
    return a;
  }
  //create a method for vowels
  public int getNumVowels(){
    //create a variable to count
    int count = 0;
    //create a string variable to store
    String b = a;
    //use a for loop to iterate through
    for(int x = 0; x < b.length(); x++){
      //use a nested for loop to go through each character
      for(int y = 0; y < vowels.length(); y++){
        //if the character is a vowel, add 1 to the variable
        if(b.charAt(x) == vowels.charAt(y)){
          count++;
        }
      }
    }
    //return the length
    return count;
  }
  //getLength method
  public int getLength(){
    //returns the length
    return a.length();
  }
    //create a toString method
  public String toString(){
    return "Word: " + a;
  }
}