package com.main;

public class GameLogic {
	static String word = "baboon";
	static String[] solvedWord = new String[word.length()];
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
		
		if(isFound){
			//Do nothing
		}else{
			lives--;
		}
		return isFound;
	}
	
	public static void displayFound(){
		for(int i = 0; i < solvedWord.length; i++){
			if(solvedWord[i] == null){
				System.out.print("_");
			}else{
				System.out.print(solvedWord[i]);
				
			}
		}
	}
}
