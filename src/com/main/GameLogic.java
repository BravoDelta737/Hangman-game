package com.main;

public class GameLogic {
	static String word = "baboon";
	static String[] solvedWord = new String[word.length()];
	static char[] displayWord = new char[word.length()];
	int[] letterIndex = new int[word.length()];
	public static int lives = 9;
	static boolean isPlaying = true;
	
	public static boolean checkLetter(String object){
		boolean isFound = false;
		for(int i = 0; i < word.length(); i++){
			if(object.charAt(0) == word.charAt(i)){
				solvedWord[i] = object;
			}else{
				//Do nothing
			}
		}
		
		if(isFound == false){
			
		}else{
			
		}
		return isFound;
	}
	
	public static String displayFound(){
		String foundWord;
		for(int i = 0; i < solvedWord.length; i++){
			if(solvedWord[i] == null){
				displayWord[i] = '_';
			}else{
			displayWord[i] = solvedWord[i].charAt(0); 
				
			}
		}
		foundWord = new String(displayWord);
		return foundWord;
	}
	
	public static int returnLives(){
		return lives;
	}
}
