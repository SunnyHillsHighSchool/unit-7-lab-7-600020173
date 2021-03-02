//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Jonathan Hsing

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for(String a: wordList){
      words.add(new Word(a));
	}
  }

	public int countWordsWithXChars(int size)
	{
		//create a variable = 0
    int count=0;
    //for loop
    for(Word current: words){
    //if statement comparing length
    if(current.getLength() == size)
      //increase increment
      count++;
    }
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		//Create variable = 0
    int vCount = 0;
    //for loop incrementing through the size of the word
    for(int a = 0; a < words.size(); a++){
      //if statement comparing length
      if(words.get(a).getLength() == size){
        //Add the number of vowels to the variable
        vCount += words.get(a).getNumVowels();
        //Remove value at the index
        words.remove(a);
        //increment down
        a--;
      }
    }
    //Return variable
		return vCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
    //for loop iterating through the array
  	for(Word current: words){
      //if statement comparing 
      if(current.getNumVowels() == numVowels){
        //increase count by 1
        count++;
      }
     }
   //Return count
		return count;
	}
	
	//add in a toString
  public String toString(){
    return "" + words;
  }
}