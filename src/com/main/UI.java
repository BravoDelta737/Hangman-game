package com.main;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
	//Add Panels for each part of the UI
	JPanel letterContainer = new JPanel();
	JPanel wordContainer = new JPanel();
	//Create an alphabet array to plug into the combo box
	String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	//Create the combo box for letter selection
	JComboBox letterSelect = new JComboBox(letters);
	//Submits the letter selected for the GameLogic class to act on
	JButton chooseLetter = new JButton("Select");
	//Creates labels to display lives and to show letters in the word that have been guessed
	JLabel wordReveal = new JLabel("Word");
	JLabel attempts = new JLabel("Lives left: 9");
	
	public UI(){
		super("Hangman!");
		//creates the master layout to arrange the panels
		GridLayout mainLayout = new GridLayout(5,1,10,10);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(mainLayout);
		//Creates instance of EventHandler class to act on button press
		EventHandling even = new EventHandling(this);
		//Creates layouts for the two panels
		FlowLayout flo = new FlowLayout(FlowLayout.CENTER, 10, 10);
		FlowLayout flo2 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		letterContainer.setLayout(flo);
		//Adds elements of letterContainer panel
		letterContainer.add(letterSelect);
		letterContainer.add(chooseLetter);
		wordContainer.setLayout(flo2);
		wordReveal.setFont(new Font("Serif", Font.PLAIN, 20));
		wordContainer.add(wordReveal);
		wordContainer.add(attempts);
		add(letterContainer);
		add(wordContainer);
		chooseLetter.addActionListener(even);
		setVisible(true);
		
		
	}
}
