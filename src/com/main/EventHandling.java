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
		
		GameLogic.checkLetter(gui.letterSelect.getSelectedItem().toString());
		gui.letterSelect.remove(gui.letterSelect.getSelectedIndex());
		GameLogic.displayFound();
		
}
	}

