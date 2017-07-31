/*here i am showing finds all anagram sets from a list of words */

package Assignment13;   // here i am creating Package name as Assignment13

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.lang.reflect.Array;

public class AnagramsExample {   // here i am creating class name as AnagramsExample
	
	public static void main (String [] args){ // i am creating main method
		
   List<String> list=new ArrayList<String>(); // here i am creating an object
   
         // here in the we are adding the list of String values
		list.add("listen");
		list.add(" pot");
		list.add("part");
		list.add(" opt");
		list.add(" trap");
		list.add(" silent");
		list.add(" top");
		list.add(" hello");
		list.add(" hits");
		list.add("what");
		list.add("shit");
	
		System.out.println(findAnagrams(list));
	}
	  private static Map<String ,List<String>> findAnagrams(List<String>words){

	 
		  Map<String,List<String>> anagrams=null; // created a HashMap string as a key and list as string
		  if (words==null || words.size()==0){    // it checks weather the list is empty or not
			  return null ;
			  
		  }
		anagrams =new HashMap <String,List<String>>();
		for (String word:words){    //creating a for loop which checks the words which we have given
			char[] charArray =word.trim(). toCharArray();//word.trim is to remove the white spaces
			Arrays.sort(charArray);
			String sortedWord=String.valueOf(charArray);
			
			if (anagrams.containsKey(sortedWord)){ // here it checks weather contains a key and get the sorted word
				
			List<String> newList= anagrams.get(sortedWord);
			newList.add(word);
			anagrams.put(sortedWord, newList);     // here to put values of sortedWord
			
			}
			  else{   // if the map doesn's contain the sorted word we are creating a new array list of type string
				List<String>list=new ArrayList<String>();
				list.add(word);
				anagrams.put(sortedWord,list);
			  }
			
		}	  
	  return anagrams;    // this returns the anagrams
	  }
}



