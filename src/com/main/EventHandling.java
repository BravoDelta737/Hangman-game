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
		boolean isTrue = GameLogic.checkLetter(gui.letterSelect.getSelectedItem().toString());
		int index = gui.letterSelect.getSelectedIndex();
		int lives = GameLogic.lives;
		if(isTrue == true){
			//Do nothing
		}else{
			GameLogic.subtractLife();
		}
		String livesString = Integer.toString(lives);
		gui.letterSelect.removeItemAt(index);
		gui.wordReveal.setText(GameLogic.displayFound());
		gui.attempts.setText("You now have: " + livesString + " lives");
		gui.revalidate();
		
}
	}

