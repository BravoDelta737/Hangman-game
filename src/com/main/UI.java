package com.main;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
	JPanel letterContainer = new JPanel();
	JPanel wordContainer = new JPanel();
	String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	JComboBox letterSelect = new JComboBox(letters);
	JButton chooseLetter = new JButton("Select");
	JLabel wordReveal = new JLabel("Word");
	JLabel attempts = new JLabel("Lives left: 9");
	
	public UI(){
		super("Hangman!");
		GridLayout mainLayout = new GridLayout(5,1,10,10);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(mainLayout);
		EventHandling even = new EventHandling(this);
		FlowLayout flo = new FlowLayout(FlowLayout.CENTER, 10, 10);
		FlowLayout flo2 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		letterContainer.setLayout(flo);
		letterContainer.add(letterSelect);
		letterContainer.add(chooseLetter);
		wordContainer.setLayout(flo2);
		wordContainer.add(wordReveal);
		wordContainer.add(attempts);
		add(letterContainer);
		add(wordContainer);
		chooseLetter.addActionListener(even);
		setVisible(true);
		
		
	}
}
