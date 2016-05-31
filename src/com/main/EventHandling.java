package com.main;

import java.awt.event.*;

public class EventHandling implements ActionListener {
	UI gui;
	
	public EventHandling(UI in){
		gui = in;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		boolean isRight = GameLogic.checkLetter(gui.letterSelect.getSelectedItem().toString());
		if(isRight == false){
			GameLogic.lives--;
		}else{
			
		}
		int index = gui.letterSelect.getSelectedIndex();
		int lives = GameLogic.lives;
		String livesString = Integer.toString(lives);
		gui.letterSelect.removeItemAt(index);
		gui.wordReveal.setText(GameLogic.displayFound());
		gui.attempts.setText(livesString);
		gui.revalidate();
		
}
	}

